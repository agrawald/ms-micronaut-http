package ms.micronaut.example.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("/greet")
public class GreetController {

	@Get("/{name}")
	public String greet(String name) {
		return "Hello "+ name;
	}

	@Post(value = "/{name}", consumes = MediaType.TEXT_PLAIN)
	public String setGreeting(@Body String name) {
		return "Hello " + name;
	}
}
