package com.syphan.practice.boardinghouserestfullapi.config;

import com.syphan.practice.boardinghouserestfullapi.security.JwtTokenProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(JwtTokenProperties.class)
public class JwtSecurityAutoConfiguration {
}
