package com.charitybuzz.dao.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.charitybuzz.domain.AuctionRuleDetail;
import com.charitybuzz.operate.NextValueService;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/com/charitybuzz/dao/impl/applicationContext.xml" })
public class BidTest {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource
	NextValueService nextValueService;

	@Test
	public void value() {
		Double currentBid = 501d;
		Long auctionRuleId = 2L;
		Double v = nextValueService.findMinNextBid(auctionRuleId,
				currentBid);
		System.out.println("[LOG]" + v);
	}

	@Test
	public void bid() {
		// double currentBid = 6750;
		double currentBid = 0;

		// $7,250
		log.debug("[LOG][Least]" + this.getBidLeast(currentBid));

		while (currentBid < 50000) {
			currentBid = this.getBidLeast(currentBid);
			System.out.println(currentBid);
		}

	}

	/**
	 * @param currentBid
	 * @return
	 */
	private double getBidLeast(double currentBid) {
		List<Double> nextValueLevel = Arrays.asList(new Double[] { 250d, 500d,
				1000d, 5000d, 10000d, 25000d, 50000d, 10000000d });
		List<Double> nextValueAdd = Arrays.asList(new Double[] { 25d, 50d,
				100d, 250d, 500d, 1000d, 2500d, 5000d });

		for (int i = 0; i < nextValueLevel.size(); i++) {
			if (currentBid < nextValueLevel.get(i)) {
				return currentBid + nextValueAdd.get(i);
			}
		}
		return 0d;
	}

	@Test
	public void testClass() {
		System.out.println(this.getClass().getSimpleName().replace("Impl", ""));
		System.out.println(AuctionRuleDetail.class.getSimpleName().replace(
				"Impl", ""));

	}
	@Test
	public void testClass1111111111() {
		String numString = "0123456789";
		int num = Integer.parseInt(numString.substring(1));
		System.out.println("[LOG]"+num);
		
		
	}

}
