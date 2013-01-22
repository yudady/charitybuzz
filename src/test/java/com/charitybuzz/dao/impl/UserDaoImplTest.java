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
import org.springframework.transaction.annotation.Transactional;

import com.charitybuzz.dao.UserDao;
import com.charitybuzz.domain.User;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/com/charitybuzz/dao/impl/applicationContext.xml" })
public class UserDaoImplTest {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "userJdbcDao")
	private UserDao userDao;

	@Test
	public void findTotalUserCount() {
		log.debug("[LOG]" + userDao.findTotalCount());
	}

	@Test
	public void findAll() {
		List<User> users = userDao.findAll();
		for (int i = 0; i < users.size(); i++) {
			log.debug("[LOG]" + users.get(i));
		}
	}

	@Test
	@Rollback(true)
	public void insert() {
		User user = new User();
		user.setId(3L);
		log.debug("[LOG]" + userDao.insert(user));
	}
	@Test
	@Rollback(true)
	public void update() {
		User user = new User();
		user.setId(3L);
		log.debug("[LOG]" + userDao.update(user));
	}
	@Test
	@Rollback(true)
	public void delete() {
		log.debug("[LOG]" + userDao.delete(1L));
	}

	@Test
	public void findByUserId() {
		User u = userDao.findById(1L);
		log.debug("[LOG]" + u);
	}

}
