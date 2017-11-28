package com.haozj.ssm.mapper;

import com.haozj.ssm.po.Items;
import com.haozj.ssm.po.ItemsCustom;
import com.haozj.ssm.po.ItemsExample;
import com.haozj.ssm.po.ItemsQueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemsMapperCustom {
    //商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}