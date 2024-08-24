package br.edu.ifpe.recife.gcms.WebApp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller

public class HomeController {
	
	@RequestMapping("/")
	public @ResponseBody String greeting() {
	return "Hello, World java!";
	}
	
	@RequestMapping("/Diogo")
	public @ResponseBody String greetingFulano() {
	return "Hello, Diogo!";
	}
	
	@RequestMapping("/Professor")
	public @ResponseBody String greetingSiclano() {
	return "Hello, Professor Ramide! Ajuste Passo 2 Parte 3.";
	}
	
	@RequestMapping("/Hotfix")
	public @ResponseBody String greetingHotfix() {
	return "Hello, pratica 04";
	}

	@RequestMapping("/Build")
	public @ResponseBody String greetinghotfix() {
	return "Hello, pratica 05";
	}
}
