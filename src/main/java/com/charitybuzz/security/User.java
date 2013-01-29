package com.charitybuzz.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class User implements UserDetails {

	private static final long serialVersionUID = 1L;

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

		switch (authority) {
		case 1:
			grantedAuthorities.add(new SimpleGrantedAuthority("loginBidder"));
			break;
		case 2:
			grantedAuthorities.add(new SimpleGrantedAuthority("loginBidder"));
			grantedAuthorities.add(new SimpleGrantedAuthority("loginAdmin"));
			break;
		default:
			break;
		}

		return grantedAuthorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return name;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}