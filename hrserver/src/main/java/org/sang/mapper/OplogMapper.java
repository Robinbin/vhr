package org.sang.mapper;

import org.apache.ibatis.annotations.Param;
import org.sang.bean.Oplog;

import java.util.List;

public interface OplogMapper {
    int addOplog(@Param("oplog") Oplog oplog);

    List<Oplog> getAllOplog();
}
