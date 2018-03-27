package com.jee.mapper.dao;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.apache.ibatis.mapping.Environment;

public class CodeCreateSqlSF {
    static private SqlSessionFactory sqlSessionFactory;

    public static SqlSessionFactory getSqlSessionFactory() {
        PooledDataSource dataSource = new PooledDataSource();
        dataSource.setDriver("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mocao");
        TransactionFactory tf = new JdbcTransactionFactory();
        Environment environment = new Environment("development",tf,dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.getTypeAliasRegistry().registerAlias("role",com.jee.mapper.Role.class);
        configuration.addMapper(RoleMapper.class);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        return sqlSessionFactory;
    }


}
