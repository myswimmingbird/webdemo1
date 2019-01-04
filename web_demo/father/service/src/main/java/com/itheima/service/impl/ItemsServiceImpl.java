package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    ItemsDao dao;

    @Override
    public Items findById(int id) {
        return dao.findById(id);
    }
}
