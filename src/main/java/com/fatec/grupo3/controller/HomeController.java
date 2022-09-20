package com.fatec.grupo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fatec.grupo3.model.UsuarioApp;

@Controller
@RequestMapping("/home")
public class HomeController {
	/*
	// ao digitar no browse http://localhost:8080/ a aplicação responde com pagina
	// menu
	@GetMapping("/")
	public ModelAndView menu() {
		return new ModelAndView("paginaMenu");
	}

	@GetMapping("/login")
	public ModelAndView autenticacao() {
		return new ModelAndView("paginaLogin");
	}

	@GetMapping("/clientes")
	public ModelAndView cadastrarCliente() {
		return new ModelAndView("cadastrarCliente");
	}

	@GetMapping("/fornecedores")
	public ModelAndView cadastrarFornecedor() {
		return new ModelAndView("cadastrarFornecedor");
	}

	@GetMapping(value = "/users")
	public UsuarioApp getUsers() {
		
		return null;
	}

	@PostMapping(value = "/users")
	public UsuarioApp createUser(UsuarioApp user) {
		
		return null;
	}

	@GetMapping(value = "/users/{id}")
	public UsuarioApp getUser(@PathVariable("id") String id) {
		return null;
	}*/

}
