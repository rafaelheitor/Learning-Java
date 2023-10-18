package controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan()
public class HelloSpring {

	@RequestMapping("/")
	public String hello() {
		return "Hello from SpringBoot";
	}
}
