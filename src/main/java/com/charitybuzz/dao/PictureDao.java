package com.charitybuzz.dao;

import java.util.List;

import com.charitybuzz.domain.Picture;

public interface PictureDao extends BaseDao<Picture> {

	List<Picture> findPictureByitemId(Long itemId);

}
