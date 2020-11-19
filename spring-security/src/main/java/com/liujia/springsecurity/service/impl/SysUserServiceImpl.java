package com.liujia.springsecurity.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.liujia.springsecurity.model.User;
import com.liujia.springsecurity.security.GrantedAuthorityImpl;
import com.liujia.springsecurity.service.UserService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class SysUserServiceImpl implements UserService {

	@Override
	public User findByUsername(String username) {
		User user = new User();
		user.setId(1L);
		user.setUsername(username);
		String password = new BCryptPasswordEncoder().encode("123");
		user.setPassword(password);
		return user;
	}

	@Override
	public Set<String> findPermissions(String username) {
		Set<String> permissions = new HashSet<>();
		permissions.add("sys:user:view");
		permissions.add("sys:user:add");
		permissions.add("sys:user:edit");
		permissions.add("sys:user:delete");
		return permissions;
	}


}
