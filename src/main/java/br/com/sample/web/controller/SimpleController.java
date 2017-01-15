package br.com.sample.web.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method = GET, produces = APPLICATION_JSON_VALUE)
public class SimpleController {

	@RequestMapping(path = "/greetings")
	public String greetings() {
		return "{\"message\": \"Hello!\"}";
	}

}
