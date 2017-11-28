package com.haozj.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.haozj.ssm.po.ItemsCustom;
import com.haozj.ssm.service.ItemService;
@Controller
public class ItemsController {
    @Autowired
    private ItemService itemsService;
    //…Ã∆∑≤È—Ø
    @RequestMapping("/queryItems")
    public ModelAndView queryItems(HttpServletRequest request) throws Exception{
        List<ItemsCustom> itemsList = itemsService.findItemList(null);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsList",itemsList);
        modelAndView.setViewName("items/itemsList");
        return modelAndView;
    }
}
