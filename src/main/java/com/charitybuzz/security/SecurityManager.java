package com.charitybuzz.security;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.charitybuzz.domain.Bidder;

public class SecurityManager implements UserDetailsService {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException, DataAccessException {

		String sql = " select * from bidder where email = '111' ";
		BeanPropertyRowMapper<Bidder> rowMapper = ParameterizedBeanPropertyRowMapper
				.newInstance(Bidder.class);

		List<Bidder> bidders = jdbcTemplate.query(sql, rowMapper);

		log.debug("[LOG][bidders size]" + bidders.size());

		if (bidders.size() > 0) {
			
			Bidder bidder = bidders.get(0);
			return new User(1, bidder.getEmail(), bidder.getPassWord());
		}

		throw new UsernameNotFoundException("User " + username
				+ " has no GrantedAuthority");
	}
}
