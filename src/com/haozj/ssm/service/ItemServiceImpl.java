package com.haozj.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.haozj.ssm.mapper.ItemsMapper;
import com.haozj.ssm.mapper.ItemsMapperCustom;
import com.haozj.ssm.po.ItemsCustom;
import com.haozj.ssm.po.ItemsQueryVo;

public class ItemServiceImpl implements ItemService{
    @Autowired
    private ItemsMapperCustom itemsMapperCustom;
    @Autowired
    private ItemsMapper ItemsMapper;
    @Override
    public List<ItemsCustom> findItemList(ItemsQueryVo itemsQueryVo) throws Exception {
        return itemsMapperCustom.findItemsList(itemsQueryVo);
    }
    
}
