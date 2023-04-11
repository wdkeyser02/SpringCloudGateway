package willydekeyser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {

	@GetMapping("/message")
	public String test(@RequestHeader("first-request") String header) {
		return "Hello Spring Boot Tutorial Called in First Service " + header;
	}
}
