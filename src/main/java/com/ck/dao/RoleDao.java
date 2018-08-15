package com.ck.dao;

import com.ck.entity.Role;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ChiKuo on 2018/7/4.
 */
@Repository
public interface RoleDao {
    public int insertRole(Role role);
    public int updateRole(Role role);
    public int deleteRole(Integer id);
    public Role getRole(Integer id);
    public List<Role> findRoles(String roleName, RowBounds rowBounds);
}
