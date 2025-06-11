package com.visiontecno.restapitest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

	
	@GetMapping
	private ResponseEntity<String> gretting(){
		return ResponseEntity.ok("hola");
	}
}
