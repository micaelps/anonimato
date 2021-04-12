package com.micaelps.anonimato.security;

import org.springframework.security.core.userdetails.UserDetails;


public interface UserDetailsMapper {

	UserDetails map(Object shouldBeASystemUser);
}
