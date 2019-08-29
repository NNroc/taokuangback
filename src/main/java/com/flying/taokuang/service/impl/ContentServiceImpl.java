package com.flying.taokuang.service.impl;

import com.flying.taokuang.dao.ContentMapper;
import com.flying.taokuang.dataobject.Content;
import com.flying.taokuang.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author NNShadow
 * @date 2019/8/27 16:26
 */
@Component
public class ContentServiceImpl implements ContentService {
    @Autowired
    private ContentMapper contentMapper;

    @Override
    public int deleteById(Integer id) {
        return contentMapper.deleteById(id);
    }

    @Override
    public int insert(Content record) {
        return contentMapper.insert(record);
    }

    @Override
    public List<Content> selectByUsername(String username) {
        return contentMapper.selectByUsername(username);
    }

    @Override
    public List<Content> selectAll() {
        return contentMapper.selectAll();
    }

    @Override
    public int update(Content record) {
        return contentMapper.update(record);
    }

    @Override
    public List<Content> selectByType(String type) {
        return contentMapper.selectByType(type);
    }

    @Override
    public List<Content> selectByKeyword(String keyword) {
        StringBuilder stringBuilder = new StringBuilder("%");
        stringBuilder.append(keyword);
        stringBuilder.append("%");
        return contentMapper.selectByKeyword(stringBuilder.toString());
    }
}