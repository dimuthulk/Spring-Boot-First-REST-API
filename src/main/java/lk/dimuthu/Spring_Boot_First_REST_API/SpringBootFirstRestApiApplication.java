package lk.dimuthu.Spring_Boot_First_REST_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController()
public class SpringBootFirstRestApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstRestApiApplication.class, args);
		System.out.println("Server is running http://localhost:8080/");
	}

	@GetMapping(value = "/")
	public String test(){
		return "API Success!";
	}

}
