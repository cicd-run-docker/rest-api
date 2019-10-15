package com.syphan.practice.boardinghouserestfullapi.security;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.jwt")
public class JwtTokenProperties extends com.syphan.practice.commonservice.security.JwtTokenProperties {
}
