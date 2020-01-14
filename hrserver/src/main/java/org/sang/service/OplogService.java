package org.sang.service;

import org.sang.bean.Oplog;
import org.sang.common.HrUtils;
import org.sang.mapper.OplogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by sang on 2018/1/10.
 */
@Service
@Transactional
public class OplogService {
    @Autowired
    OplogMapper oplogMapper;

    public int logCurrentOp() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();

        Oplog oplog = new Oplog.Builder().hrid(HrUtils.getCurrentHr().getId())
                .operate(requestAttributes.getRequest().getRequestURI())
                .addDate(Timestamp.valueOf(LocalDateTime.now()))
                .build();

        return oplogMapper.addOplog(oplog);
    }

    public List<Oplog> getAllPos() {
        return oplogMapper.getAllOplog();
    }
}
