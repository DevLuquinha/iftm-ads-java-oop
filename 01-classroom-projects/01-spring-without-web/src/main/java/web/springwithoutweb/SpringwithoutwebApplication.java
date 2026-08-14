package web.springwithoutweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringwithoutwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwithoutwebApplication.class, args);
		System.out.println("System it's running! Monitoring directories...");
	}

}
