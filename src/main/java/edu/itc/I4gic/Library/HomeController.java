package edu.itc.I4gic.Library;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping(path="/")
	public String index() {
		return "Hello World!";
	}
	
	@GetMapping(path="/final")
	public String task1() {
		return "<h1 style='text-align: center; margin-top:10%;'> Hello, Welcome to TP14 Task1! </h1>";
	}
}
