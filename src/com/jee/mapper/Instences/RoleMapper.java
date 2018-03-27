package com.jee.mapper.Instences;

import com.jee.mapper.Role;

import java.util.List;

public interface RoleMapper {
    public int insertRole(Role role);
    public Role getRole(Long id);
    public List<Role> findRoles(String roleName);
}
