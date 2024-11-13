package com.intissar.demo.service.register;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
	VerificationToken save(String token);
	 VerificationToken findByToken(String token);
}