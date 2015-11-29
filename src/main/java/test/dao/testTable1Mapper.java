package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.domain.po.testTable1;
import test.domain.po.testTable1Example;

public interface testTable1Mapper {
    int countByExample(testTable1Example example);

    int deleteByExample(testTable1Example example);

    int insert(testTable1 record);

    int insertSelective(testTable1 record);
    
    List<testTable1>  test();

    List<testTable1> selectByExample(testTable1Example example);

    int updateByExampleSelective(@Param("record") testTable1 record, @Param("example") testTable1Example example);

    int updateByExample(@Param("record") testTable1 record, @Param("example") testTable1Example example);
}