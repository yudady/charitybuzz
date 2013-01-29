package com.charitybuzz.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class User implements UserDetails {

	private static final long serialVersionUID = 1L;
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());
	private String name;
	private String password;
	private int authority;

	public User(int authority, String name, String password) {
		this.name = name;
		this.password = password;
		this.authority = authority;
	}

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
		log.debug("[LOG][getAuthorities]");
		switch (authority) {
		case 1:
			grantedAuthorities.add(new SimpleGrantedAuthority("loginBidder"));
			return grantedAuthorities;
		case 2:
			grantedAuthorities.add(new SimpleGrantedAuthority("loginBidder"));
			grantedAuthorities.add(new SimpleGrantedAuthority("loginAdmin"));
			return grantedAuthorities;
		default:
			return null;
		}

	}

	@Override
	public String getPassword() {
		log.debug("[LOG][getPassword]");
		return password;
	}

	@Override
	public String getUsername() {
		log.debug("[LOG][getUsername]");
		return name;
	}

	@Override
	public boolean isAccountNonExpired() {
		log.debug("[LOG][isAccountNonExpired]");
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		log.debug("[LOG][isAccountNonLocked]");
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		log.debug("[LOG][isCredentialsNonExpired]");
		return true;
	}

	@Override
	public boolean isEnabled() {
		log.debug("[LOG][isEnabled]");
		return true;
	}

}
