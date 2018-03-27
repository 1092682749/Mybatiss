package com.jee.mapper.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlBuilder {
    static SqlSessionFactory sqlSessionFactory = null;
    static {
        try {
            InputStream inputStream;
            String resource = "mybatis-config.xml";
            inputStream = org.apache.ibatis.io.Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSessionFactory getSqlSessionFactory()
    {
        return sqlSessionFactory;
    }
}
