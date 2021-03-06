package com.example.testprofilespringboot.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ExampleResource {

	@Value("${spring.profiles.active}")
	private String profile;

	@GetMapping("/")
	public ResponseEntity<String> getProfile() {
		return new ResponseEntity<String>(profile, HttpStatus.OK);
	}
}
