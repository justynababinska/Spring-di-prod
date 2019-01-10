package pl.justynababinska.config;

import java.util.Random;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	@Qualifier("randomNumber")
	public int getRandomNumber() {
		return new Random().nextInt();
	}
	

}
