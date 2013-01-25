package com.charitybuzz.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.charitybuzz.dao.PictureDao;
import com.charitybuzz.domain.Picture;
import com.charitybuzz.service.PictureService;

@Service
public class PictureServiceImpl implements PictureService {

	@Resource
	private PictureDao pictureDao;

	@Override
	public List<Picture> findByitemId(Long itemId) {
		List<Picture> pictures = pictureDao.findByitemId(itemId);
		if (pictures.size() > 0) {
			return pictures;
		}
		return new ArrayList<Picture>();

	}

}
