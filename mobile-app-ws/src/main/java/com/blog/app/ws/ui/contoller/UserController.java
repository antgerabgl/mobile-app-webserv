package com.blog.app.ws.ui.contoller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")  //http://localhost:8080/users
public class UserController {

	@GetMapping
	public String getUser()
	{
		return "metodo getUser() llamado, SE REALIZO UNA OPERACION CON EL COMANDO GET";
	}
	
	@PostMapping
	public String createUser()
	{
		return "metodo createUser()  llamado SE REALIZO UNA OPERACION CON EL COMANDO POST";
	}
	
	@PutMapping
	public String updateUser()
	{
		return "metodo updateUser()  llamado";
	}
	
	@DeleteMapping
	public String deleteUser()
	{
		return "metodo deleteUser()  llamado";
	}
}//CLASE
