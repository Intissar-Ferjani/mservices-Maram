package com.intissar.demo.util;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;
import java.lang.IllegalStateException; // Explicit import

@AllArgsConstructor
@Service
public class EmailService implements EmailSender{
	private final JavaMailSender mailSender;
	public void sendEmail(String to, String email){
		try {
			MimeMessage mimeMessage = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
			helper.setText(email, true);
			helper.setTo(to);
			helper.setSubject("Confirm your email");
			helper.setFrom("i.ferjani.26@gmail.com");
			mailSender.send(mimeMessage);
		} catch (MessagingException e) {
			throw new IllegalStateException("Failed to send email");

		}
	 }

}
