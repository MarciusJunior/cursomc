package com.java.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.java.cursomc.services.DBService;
import com.java.cursomc.services.EmailService;
import com.java.cursomc.services.SmtpEmailService;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		
		dbService.instantiateTestDatabase();		
		
		return true;
		
	}
	
	@Bean
	public EmailService emailService() {
		return new SmtpEmailService();
	}
}
