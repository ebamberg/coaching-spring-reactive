package com.ebamberg.coaching.springboot.web.reactiveweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/demo")
public class HelloWorldController {

	@GetMapping("greeting")
	public Mono<String> sayHello() {
		return Mono.just("Hello World");
	}
	
}
