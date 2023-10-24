package com.example.execerciciosSpringBoot.application;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.execerciciosSpringBoot.core.domain.user.entity.User;

@RestController
@RequestMapping(path = "/")
public class HelloSpring {

	@GetMapping
	public List<User> hello() {
		return List.of(new User(1L, "Rafael", "rafael@email.com", "123456", LocalDate.of(1992, Month.MAY, 5), 31));
	}
}
