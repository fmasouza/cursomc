package com.fabiosouza.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.fabiosouza.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
