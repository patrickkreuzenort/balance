package balance;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BalanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BalanceApplication.class, args);
	}

	@Value("${spring.profiles.active}")
	private String activeProfile;

	@PostConstruct
	public void init() {
		System.out.println("Active Profile: " + activeProfile);
	}

}
