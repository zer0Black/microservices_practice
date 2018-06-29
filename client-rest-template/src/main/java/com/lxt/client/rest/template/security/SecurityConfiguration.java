package com.lxt.client.rest.template.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private ClientUserDetailsService clientUserDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(clientUserDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
            .authorizeRequests().antMatchers("/", "/index.html").permitAll().anyRequest()
            .authenticated().and()
            .formLogin().and()
            .logout().permitAll().and()
            .csrf().disable();
    }

}
