package com.emanuelgandrade.PerguntasAoProfessor;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping(value="/user", method = RequestMethod.GET)
	public String allUser() {
		return "all";
	}
	
	@RequestMapping(value="/user", method = RequestMethod.POST)
	public String registerUser(@RequestBody User user) {

		try {
			System.out.println(user);
			return "foi persistido o usuario " + user;

		} catch (Exception e) {
			return "problema";
		}
	}
	
	@RequestMapping(value="/user/{identifier}", method = RequestMethod.GET)
	public String getUser(@PathVariable(value="identifier") String username) {
		return "Ola, Meu Amigo Desenrolado que possui o ID = " + username;
	}
	
}
