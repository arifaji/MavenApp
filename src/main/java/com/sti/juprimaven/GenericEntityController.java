package com.sti.juprimaven;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class GenericEntityController {
	
	//localhost:8080/test/hello/value
	@GetMapping("/hello")
	public String hello(@RequestParam("data") String id) {
		return "hello "+id;
	}
	
	//localhost:8080/test/hello?data=value
	@GetMapping("/hello/{data}")
	public String helloPathVariable(@PathVariable("data") String id) {
		return "hello "+ id;
	}
	
	//localhost:8080/test/helloes
	@PostMapping("/helloes")
	public String hello(@RequestBody Customer customer) {
		return "hello " +customer.getFirstName();
	}
	
}
