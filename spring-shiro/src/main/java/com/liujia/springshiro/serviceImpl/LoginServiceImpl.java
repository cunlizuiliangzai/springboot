package com.liujia.springshiro.serviceImpl;

import com.liujia.springshiro.bean.Permission;
import com.liujia.springshiro.bean.Role;
import com.liujia.springshiro.bean.User;
import com.liujia.springshiro.dao.RoleDao;
import com.liujia.springshiro.dao.UserDao;
import com.liujia.springshiro.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {


    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;

    @Override
    public User addUser(User user) {
        userDao.save(user);
        return user;
    }

    @Override
    public Role addRole(Role role) {
        User user = userDao.findByName(role.getUser().getName());
        role.setUser(user);
        Permission permission1 = new Permission();
        permission1.setPermission("create");
        permission1.setRole(role);
        Permission permission2 = new Permission();
        permission2.setPermission("update");
        permission2.setRole(role);
        List<Permission> permissions = new ArrayList<Permission>();
        permissions.add(permission1);
        permissions.add(permission2);
        role.setPermissions(permissions);
        roleDao.save(role);
        return role;
    }

    @Override
    public User findByName(String name) {
        return userDao.findByName(name);
    }
}
