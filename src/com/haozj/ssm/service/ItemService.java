package com.haozj.ssm.service;

import java.util.List;

import com.haozj.ssm.po.ItemsCustom;
import com.haozj.ssm.po.ItemsQueryVo;

public interface ItemService {
    //��Ʒ��ѯ�б�
    public List<ItemsCustom> findItemList(ItemsQueryVo itemsQueryVo) throws Exception;
}
