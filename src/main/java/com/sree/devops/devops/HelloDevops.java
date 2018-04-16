package com.sree.devops.devops;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDevops {

	@RequestMapping("/rest/hello")
	public String helloDev() {
		return "Hello Devops ";
	}
}
