package com.charitybuzz.service;

import java.util.List;

import com.charitybuzz.domain.Picture;


public interface PictureService {

	public List<Picture> findPictureByitemId(Long itemId);

}
