package com.charitybuzz.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.charitybuzz.dao.PictureDao;
import com.charitybuzz.domain.Picture;
import com.charitybuzz.service.PictureService;

@Service("pictureService")
public class PictureServiceImpl implements PictureService {

	@Resource(name = "pictureJdbcDao")
	private PictureDao pictureDao;

	@Override
	public List<Picture> findPictureByArticleId(Long articleId) {
		List<Picture> pictures = pictureDao.findPictureByArticleId(articleId);
		if (pictures.size() > 0) {
			return pictures;
		}
		return new ArrayList<Picture>();

	}

}
