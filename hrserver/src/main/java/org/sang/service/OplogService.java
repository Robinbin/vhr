package org.sang.service;

import org.sang.bean.Oplog;
import org.sang.mapper.OplogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sang on 2018/1/10.
 */
@Service
@Transactional
public class OplogService {
    @Autowired
    OplogMapper oplogMapper;

    public int addOplog(Oplog pos) {
        return oplogMapper.addOplog(pos);
    }

    public List<Oplog> getAllPos() {
        return oplogMapper.getAllOplog();
    }
}
