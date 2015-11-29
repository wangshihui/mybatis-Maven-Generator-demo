/*
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名: test
 * 创建人: user    
 * 创建时间: 2015年11月29日
 */

package org.wsh.mybatistest;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import test.dao.testTable1Mapper;
import test.domain.po.testTable1;


/**
 * TODO <功能简述> <br/>
 * TODO <功能详细描述>
 * @author user
 */
public class test{
    public static void main(String... s){
        String mybatisConfigPath = "mybatis/configuration.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(mybatisConfigPath);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        testTable1 t = new testTable1();
        t.setId("111");
        sqlSession.insert("test.dao.testTable1Mapper.insert",t);
        sqlSession.commit();
        List tl= sqlSession.selectList("test.dao.testTable1Mapper.test");
        testTable1Mapper mapper = sqlSession.getMapper(testTable1Mapper.class);
        tl=  mapper.test();
        sqlSession.close();
    }
}
