package com.yoyling.service.impl;

import com.yoyling.domain.Tag;
import com.yoyling.service.TagService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("tagService")
public class TagServiceImpl extends BaseServiceImpl implements TagService {
	@Override
	public List<Tag> selectAllTag() {
		return tagMapper.selectAllTag();
	}

	@Override
	public List<Tag> fuzzyQueryTag(String tagName) {
		return tagMapper.fuzzyQueryTag(tagName);
	}

	@Override
	public int findTagIdByName(String s) {
		return tagMapper.findTagIdByName(s);
	}

	@Override
	public int insert(Tag tag) {
		return tagMapper.insert(tag);
	}

	@Override
	public Tag findTagById(int tagId) {
		return tagMapper.findTagById(tagId);
	}

	@Override
	public int selectCountOfTag() {
		int num = tagMapper.selectCountOfTag();
		if (num!=0) {
			return num;
		}else {
			return 0;
		}
	}

	@Override
	public int updateTagCount(int tagId,int count) {
		return tagMapper.updateTagCount(tagId,count);
	}
}
