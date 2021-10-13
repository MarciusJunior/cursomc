package com.java.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.java.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	

}
