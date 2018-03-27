package com.jee.mapper;

import com.jee.mapper.dao.RoleMapper;
import com.jee.mapper.dao.SqlBuilder;
//import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.tools.ant.types.Mapper;
import org.junit.Test;

public class Dome {
    @Test
    public void test()
    {
//        Role role = SqlBuilder.getSqlSessionFactory().openSession().selectOne("getOneRole",1L);
//        System.out.println(role.getSrc());
        SqlSession session = SqlBuilder.getSqlSessionFactory().openSession();
        RoleMapper mapper = session.getMapper(RoleMapper.class);
        Role role = mapper.getOneRole(2L);
        System.out.println(role);
    }
}
