package com.intissar.demo.restControllers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intissar.demo.entities.User;
import com.intissar.demo.service.UserService;
import com.intissar.demo.service.exceptions.EmailAlreadyExistsException;
import com.intissar.demo.service.register.RegistrationRequest;

@RestController
@CrossOrigin(origins = "*")
public class UserRestController {
@Autowired
UserService userService;
	
	@GetMapping("all")
	public List<User> getAllUsers() {
			return userService.findAllUsers();
	}
	
	@PostMapping("/register")
	public User register(@RequestBody RegistrationRequest request) throws EmailAlreadyExistsException
	{
		return userService.registerUser(request);
	}
	
	@GetMapping("/verifyEmail/{token}")
	public User verifyEmail(@PathVariable("token") String token){
		return userService.validateToken(token);
	}
	
	
}
