package com.in28minutes.springboot.myfirstwebapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.CrossOrigin;

//@Configuration
public class BasicAuthenticationSecurityConfig {
//	@Bean 
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//		
//		//Making necessary the authentication for all resquests
//		return 
//				http.authorizeHttpRequests(
//						auth -> 
//						auth
//						.anyRequest()
//						.authenticated()
//					)
//				.httpBasic(Customizer.withDefaults())
//				.sessionManagement( 
//						session -> session.sessionCreationPolicy
//						(SessionCreationPolicy.STATELESS)
//						)
//				.csrf().disable()
//				.build();
//	}
}
