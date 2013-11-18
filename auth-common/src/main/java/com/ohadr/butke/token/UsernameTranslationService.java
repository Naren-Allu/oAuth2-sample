package com.ohadr.butke.token;

import org.springframework.security.core.Authentication;

public interface UsernameTranslationService
{
	public String getUsernameFromAuthentication(Authentication authentication);
}