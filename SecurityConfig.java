package com.yourproject.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/login", "/register").permitAll()  // Allow login and register pages
                .anyRequest().authenticated()  // Other pages require authentication
            .and()
            .formLogin()
                .loginPage("/login")  // Custom login page
                .permitAll()  // Allow everyone to access login page
            .and()
            .logout()
                .permitAll();  // Allow logout for all
    }
}
