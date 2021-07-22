package com.birdapp.bp.stock_app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(
                            "/images/**",
                            "/css/**",
                            "/javascript/**"
                            );
    }

    // TODO need to understand what this method means
    @Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
                .antMatchers("/register", "/login").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/sign_in")
                .usernameParameter("username")
                .passwordParameter("password")
                // TODO after implementation, change path to /home
                .successForwardUrl("/user/list")
                .failureUrl("/login?error")
                .permitAll()
                // .and()
                // .authorizeRequests().mvcMatchers("/user/list").hasAuthority("Admin")
                // .anyRequest().authenticated()
                .and()
            .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login?logout")
                .permitAll();
	}

	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		UserDetails user = User.withUsername("user")
                               .password("{noop}password")
                               .roles("USER")
                               .build();

		return new InMemoryUserDetailsManager(user);
	}
    // @Autowired
    // public void configure(AuthenticationManagerBuilder auth) throws Exception{
    //     // auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    //     /*
    //      * インメモリの場合は以下を使います。
    //     */
    //     PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    //     auth.inMemoryAuthentication()
    //         .withUser("user").password(encoder.encode("password")).roles("USER")
    //         .and()
    //         .withUser("admin").password(encoder.encode("password")).roles("ADMIN");   
    // }

}
