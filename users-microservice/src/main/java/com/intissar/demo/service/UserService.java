package com.intissar.demo.service;


import java.util.*;

import com.intissar.demo.entities.Role;
import com.intissar.demo.entities.User;
import com.intissar.demo.service.exceptions.EmailAlreadyExistsException;
import com.intissar.demo.service.register.RegistrationRequest;


public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();
	User registerUser(RegistrationRequest request);
	
	public User validateToken(String code);
	
}	