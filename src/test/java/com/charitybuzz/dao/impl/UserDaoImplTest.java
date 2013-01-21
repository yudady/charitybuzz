package com.charitybuzz.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.charitybuzz.dao.UserDao;
import com.charitybuzz.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext.xml" })
public class UserDaoImplTest {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "userJdbcDao")
	private UserDao userDao;

	@Test
	public void findTotalUserCount() {
		log.debug("[LOG]" + userDao.findTotalUserCount());
	}

	@Test
	public void findAll() {
		List<User> users = userDao.findAll();
		for (int i = 0; i < users.size(); i++) {
			log.debug("[LOG]" + users.get(i));
		}
	}

	@Test
	@Rollback(false)
	public void insert() {
		User user = new User(2L, "lin", "tommy", "yudady", "123456",
				"yu_dady@yahoo.com.tw", "123456");

		userDao.insert(user);
		// log.debug("[LOG]"+userDao.findTotalUserCount());
	}

	@Test
	public void findByUserId() {
		User u = userDao.findByUserId(1L);
		log.debug("[LOG]" + u);
	}

}
