package com.unitofcode.urlshortenerapi.dto;

import com.unitofcode.urlshortenerapi.model.User;

import lombok.Data;

@Data
public class AccessTokenResponse {

	private String accessToken;
	private String tokenType;
	private Integer expiresIn;
	private User user;
}
