package com.jee.mapper.Instences;

import com.jee.mapper.MybatisUtils.SqlSessionFactoryUtils;
import com.jee.mapper.Role;
import org.apache.ibatis.session.SqlSession;

public class Dome {
    public static void main(String args[]){
        SqlSession sqlSession = null;
        try{
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            System.out.println(role.getSrc());
        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            if(sqlSession != null)
            {
                sqlSession.close();
            }
        }
    }
}
