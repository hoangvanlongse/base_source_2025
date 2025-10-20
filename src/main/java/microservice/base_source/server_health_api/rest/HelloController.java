package microservice.base_source.server_health_api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HelloController {
	
	@GetMapping
	public String sayHello() {
		return "Xin chào! Đây là phản hồi từ REST.";
	}
}
