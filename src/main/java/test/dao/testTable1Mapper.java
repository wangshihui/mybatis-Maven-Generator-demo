package test.dao;

import test.domain.po.testTable1;

public interface testTable1Mapper {
    int insert(testTable1 record);

    int insertSelective(testTable1 record);
}