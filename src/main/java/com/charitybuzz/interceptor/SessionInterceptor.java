package com.charitybuzz.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.charitybuzz.exception.BidderException;

public class SessionInterceptor implements HandlerInterceptor {

	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	private List<String> excludedUrls;


	public void setExcludedUrls(List<String> excludedUrls) {
		this.excludedUrls = excludedUrls;
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
//		//Web完整網址
//		log.debug("[LOG]preHandle");
//		log.debug("[LOG][getRequestURL	]" + request.getRequestURL());
//		//Web網址後路徑
//		log.debug("[LOG][getRequestURI	]" + request.getRequestURI());
//		//request字串
//		log.debug("[LOG][getQueryString	]" + request.getQueryString());
//		log.debug("[LOG][getScheme		]" + request.getScheme());
//		log.debug("[LOG][getServerName	]" + request.getServerName());
//		log.debug("[LOG][getServerPort	]" + request.getServerPort());
//		log.debug("[LOG][getContextPath	]" + request.getContextPath());
		log.debug("[LOG][getServletPath	]" + request.getServletPath());
		 
		
		String servletPath = request.getServletPath();
		
		
		for(String str : excludedUrls){
			log.debug("[LOG][str	]" + str);
			log.debug("[LOG][servletPath	]" + servletPath);
			if(str.equalsIgnoreCase(servletPath)){
				return true;
			}
		}
		throw new BidderException();
		 
		
		
//
//		// intercept
//		HttpSession session = request.getSession();
//		if (session.getAttribute("bidder") == null) {
//			log.info("[LOG]沒有登入");
//			return true;
//		} else {
//			Bidder bidder = (Bidder) session.getAttribute("bidder");
//			log.info("[LOG]登入者" + bidder);
//			return true;
//		}
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//log.info("[LOG]postHandle");

	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//log.info("[LOG]afterCompletion");

	}

}