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

		String sql = " select * from bidder ";
		BeanPropertyRowMapper<Bidder> rowMapper = ParameterizedBeanPropertyRowMapper
				.newInstance(Bidder.class);

		List<Bidder> bidders = jdbcTemplate.query(sql, rowMapper);

		log.debug("[LOG][bidders size]" + bidders.size());

		for (int i = 0; i < bidders.size(); i++) {
			Bidder bidder = bidders.get(i);
			if(bidder.getEmail().equals(username)){
				/**
				 * 後台管理者 BD search
				 * TODO fix 新增使用者有問題
				 */
				if ("222".equals(bidder.getFirstName())) {
					return new User(2, bidder.getEmail(), bidder.getPassWord());
				}
				return new User(1, bidder.getEmail(), bidder.getPassWord());
			}
		}

		throw new UsernameNotFoundException("User " + username
				+ " has no GrantedAuthority");
	}
}
