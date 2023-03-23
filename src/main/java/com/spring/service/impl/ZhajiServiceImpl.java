package com.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spring.dao.*;
import com.spring.entity.*;
import com.spring.service.*;
import com.spring.util.*;
import java.util.*;
import java.util.*;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

@Service("ZhajiService")
public class ZhajiServiceImpl implements ZhajiService {

    @Resource
    private ZhajiMapper dao;

    /**
     * 获取所有数据
     * @return
     */
    public List<Zhaji> select() {
        return dao.select(null);
    }

    /**
     * 根据Zhaji类搜索数据
     * @param y
     * @return
     */
    public List<Zhaji> select(Zhaji y) {
        return dao.select(y);
    }

    /**
     * 根据主键获取闸机一行数据
     * @param id
     * @return
     */
    public Zhaji find(Object id) {
        return dao.selectByPrimaryKey(id);
    }

    /**
     * 根据闸机获取闸机类条件查询一行数据
     * @param id
     * @return
     */
    public Zhaji findEntity(Zhaji id) {
        return dao.selectOne(id);
    }

    /**
     * 搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Zhaji> selectPage(Zhaji obj, int page, int pageSize) {
        PageHelper.startPage(page, pageSize, true);
        List<Zhaji> list = select(obj);
        PageInfo<Zhaji> pageInfo = new PageInfo(list);
        PageInfoUtil pageInfoUtil = new PageInfoUtil(page);
        pageInfoUtil.setPageInfo(Request.getRequest(), pageInfo.getTotal(), pageSize);
        return list;
    }

    /**
     * 根据Example搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Zhaji> selectPageExample(Example obj, int page, int pageSize) {
        PageHelper.startPage(page, pageSize, true);
        List<Zhaji> list = dao.selectByExample(obj);
        PageInfo<Zhaji> pageInfo = new PageInfo(list);
        PageInfoUtil pageInfoUtil = new PageInfoUtil(page);
        pageInfoUtil.setPageInfo(Request.getRequest(), pageInfo.getTotal(), pageSize);
        return list;
    }

    /**
     * 根据主键删除一行数据
     * @param id
     * @return
     */
    public int delete(Object id) {
        return dao.deleteByPrimaryKey(id);
    }

    /**
     * 插入闸机     * @param y
     * @return
     */
    public int insert(Zhaji y) {
        return dao.insertSelective(y);
    }

    /**
     * 更新闸机     * @param y
     * @return
     */
    public int update(Zhaji y) {
        return dao.updateByPrimaryKeySelective(y);
    }
}
