package com.ck.service;

import com.ck.dao.RoleDao;
import com.ck.entity.Role;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ChiKuo on 2018/7/4.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int insertRole(Role role) {
        return this.roleDao.insertRole(role);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int updateRole(Role role) {
        return this.roleDao.updateRole(role);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int deleteRole(Integer id) {
        return this.roleDao.deleteRole(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Role getRole(Integer id) {
        return this.roleDao.getRole(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Role> findRoles(String roleName, int start, int limit) {
        return this.roleDao.findRoles(roleName, new RowBounds(start, limit));
    }
}
