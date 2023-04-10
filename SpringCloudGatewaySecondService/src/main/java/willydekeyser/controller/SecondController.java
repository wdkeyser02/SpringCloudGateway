package willydekeyser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondController {

	@GetMapping("/message")
	public String test() {
		return "Hello Spring Boot Tutorial Called in Second Service";
	}
}
