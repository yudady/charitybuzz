package com.charitybuzz.dao.impl;

import java.util.Date;
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

import com.charitybuzz.dao.ArticleDao;
import com.charitybuzz.domain.Article;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/com/charitybuzz/dao/impl/applicationContext.xml" })
public class ArticleDaoImplTest {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "articleJdbcDao")
	private ArticleDao dao;

	@Test
	public void findTotalCount() {
		log.debug("[LOG]" + dao.findTotalCount());
	}

	@Test
	public void findAll() {
		List<Article> domains = dao.findAll();
		for (int i = 0; i < domains.size(); i++) {
			log.debug("[LOG]" + domains.get(i));
		}
	}

	@Test
	@Rollback(true)
	public void insert() {
		Article domain = new Article();
		domain.setId(100L);
		//2L, 1L,"lotDetails", "legalTerms","shipping", 1d, new Date(), new Date(), 1L, 100d
		log.debug("[LOG]" + dao.insert(domain));
	}

	@Test
	@Rollback(true)
	public void update() {
		Article domain = new Article();
		domain.setId(2L);
		log.debug("[LOG]" + dao.update(domain));
	}

	@Test
	@Rollback(true)
	public void delete() {
		log.debug("[LOG]" + dao.delete(1L));
	}

	@Test
	public void findByUserId() {
		Article u = dao.findById(1L);
		log.debug("[LOG]" + u);
	}

}
