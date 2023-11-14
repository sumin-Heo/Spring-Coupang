package com.asac.SpringCoupang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.client.JdbcOAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

import java.util.Arrays;
import java.util.List;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final DataSource dataSource;

    public SecurityConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers("/").permitAll();
                    auth.anyRequest().authenticated();
                })
                .oauth2Login(withDefaults())
                .formLogin(withDefaults())
                .build();
    }

    @Bean
    public OAuth2AuthorizedClientService auth2AuthorizedClientService() {
        return new JdbcOAuth2AuthorizedClientService(
                new JdbcTemplate(this.dataSource),
                new InMemoryClientRegistrationRepository(clientRegistration())
        );
    }

    private List<ClientRegistration> clientRegistration() {
        ClientRegistration googleClientRegistration = ClientRegistration
                .withRegistrationId("google")
                .clientId("536673094706-kqa2mrb6imjcqpcn571p76numhdla8df.apps.googleusercontent.com")
                .clientSecret("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")
                .redirectUri("http://localhost:8080/login/oauth2/code/google")
                .scope("openid", "profile", "email")
                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
                .build();

        ClientRegistration githubClientRegistration = ClientRegistration
                .withRegistrationId("github")
                .clientId("Iv1.73473262803b23e4")
                .clientSecret("4f703aec76f24d5d6adba8cfdca4de43426c9e00")
                .redirectUri("http://localhost:8080/login/oauth2/code/github")
                .scope("openid", "profile", "email")
                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
                .build();

        return Arrays.asList(googleClientRegistration, githubClientRegistration);
    }
}