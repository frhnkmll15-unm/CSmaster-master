//package com.juaracoding.CSmaster.configuration;/*
//Created By IntelliJ IDEA 2022.1.3 (Community Edition)
//Build #IC-221.5921.22, built on June 21, 2022
//@Author Farhan a.k.a Muhammad Farhan Kamil
//Java Developer
//Created On 07/03/2023 00:27
//@Last Modified 07/03/2023 00:27
//Version 1.0
//*/
//
//
//import javax.sql.DataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//	@Autowired
//	private DataSource dataSource;
//
//	@Value("${spring.queries.users-query}")
//	private String usersQuery;
//
//	@Value("${spring.queries.roles-query}")
//	private String rolesQuery;
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth)
//			throws Exception {
//		auth.
//				jdbcAuthentication()
//				.usersByUsernameQuery(usersQuery)
//				.authoritiesByUsernameQuery(rolesQuery)
//				.dataSource(dataSource)
//				.passwordEncoder(bCryptPasswordEncoder);
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
//		http.
//				authorizeRequests()
//				.antMatchers("/").permitAll()
//				.antMatchers("/login").permitAll()
//				.antMatchers("/registration").permitAll()
//				.antMatchers("/admin/**").hasAuthority("ADMIN").anyRequest()
//				.authenticated().and().csrf().disable().formLogin()
//				.loginPage("/login").failureUrl("/login?error=true")
//				.defaultSuccessUrl("/admin/home")
//				.usernameParameter("email")
//				.passwordParameter("password")
//				.and().logout()
//				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//				.logoutSuccessUrl("/").and().exceptionHandling()
//				.accessDeniedPage("/access-denied");
//	}
//
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web
//				.ignoring()
//				.antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**");
//	}
//
//}
