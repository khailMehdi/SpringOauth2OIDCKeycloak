package org.khail.invantoryservice.Security;

import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .csrf(csrf ->csrf.disable() )
                .headers(h -> h.frameOptions(frameOptionsConfig -> frameOptionsConfig.disable()) )
                .authorizeHttpRequests(ar -> ar.requestMatchers("/api/**","/h2-console/**").permitAll())
                .authorizeHttpRequests(ar ->ar.anyRequest().authenticated() )
                .build();
    }
}
