package com.techm.microservices.springbootmongodb.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.techm.microservices.springbootmongodb.document.Users;
import com.techm.microservices.springbootmongodb.repository.UserRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class MongoDBConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return new CommandLineRunner() {
			@Override
			public void run(String...strings) throws Exception {
				userRepository.save(new Users(1, "Rajesh", "Development", 3000L));
				userRepository.save(new Users(2, "Nitin", "Operations", 2000L));
			}
		};
	}

}
