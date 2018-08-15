package com.ck.service;

import com.ck.entity.Role;

import java.util.List;

/**
 * Created by ChiKuo on 2018/7/4.
 */
public interface RoleService {
    public int insertRole(Role role);
    public int updateRole(Role role);
    public int deleteRole(Integer id);
    public Role getRole(Integer id);
    public List<Role> findRoles(String roleName, int start, int limit);
}
