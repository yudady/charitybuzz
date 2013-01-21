package com.charitybuzz.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.charitybuzz.dao.UserDao;
import com.charitybuzz.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/applicationContext.xml"})
public class UserDaoImplTest {

	Logger log = LoggerFactory.getLogger(this.getClass());
	
	
	@Resource(name="userJdbcDao")
	UserDao userDao;
	
	
	@Test
	public void test01() {
		log.debug("[LOG]"+userDao.findTotalUser());
	}
	@Test
	public void test02() {
		List<User> users = userDao.findAll();
		log.debug("[LOG]"+users.size());
		for(int i = 0 ; i < users.size() ; i ++){
			log.debug("[LOG]"+users.get(i));
		}
		
	}

}
