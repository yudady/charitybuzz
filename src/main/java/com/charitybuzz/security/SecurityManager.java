package com.charitybuzz.security;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class SecurityManager implements UserDetailsService {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException, DataAccessException {
		log.debug("[LOG][loadUserByUsername]");
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(new User(1,"111", "111"));
		userList.add(new User(2,"Tom", "654321"));
		userList.add(new User(2,"Terry", "321456"));
		for (int i = 0; i < userList.size(); i++) {
			User user = (User) userList.get(i);
			if (user.getUsername().equals(username))
				return user;
		}
		throw new UsernameNotFoundException("User " + username
				+ " has no GrantedAuthority");
	}
}
