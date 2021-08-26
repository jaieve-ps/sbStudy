package com.study.hsy.service;

import com.study.hsy.mapper.LinkMapper;
import com.study.hsy.mapper.PersonMapper;
import com.study.hsy.model.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkService {

    LinkMapper linkMapper;
    public LinkService(LinkMapper linkMapper) {
        this.linkMapper = linkMapper;
    }

    public List<Link> getLinkList() { return linkMapper.getLinkList();}
}
