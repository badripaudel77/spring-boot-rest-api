package io.social.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

@SpringBootApplication
//@RestController
public class SocialRestApiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialRestApiAppApplication.class, args);
	}

	//check endpoints

	@GetMapping("/")
	public Map<String, String> sayHello() {
		//return "Welcome user";
		//returns json response.
		return Collections.singletonMap("welcome_message", "WELCOME USER");
	}

	@GetMapping("/items")
//	public ArrayList<String> getItems() {
	public Map<String, ArrayList<String>> getItems() {
		ArrayList<String> items = new ArrayList<>();
		items.add("Banana");
		items.add("Apple");
		items.add("Cashews");
		items.add("Grapes");
		items.add("Orange");
		//return items;

		//returns json response.
		return Collections.singletonMap("items", items);
	}

}
