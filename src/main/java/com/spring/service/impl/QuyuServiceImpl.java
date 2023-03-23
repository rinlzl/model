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

@Service("QuyuService")
public class QuyuServiceImpl implements QuyuService {

    @Resource
    private QuyuMapper dao;

    /**
     * 获取所有数据
     * @return
     */
    public List<Quyu> select() {
        return dao.select(null);
    }

    /**
     * 根据Quyu类搜索数据
     * @param y
     * @return
     */
    public List<Quyu> select(Quyu y) {
        return dao.select(y);
    }

    /**
     * 根据主键获取区域一行数据
     * @param id
     * @return
     */
    public Quyu find(Object id) {
        return dao.selectByPrimaryKey(id);
    }

    /**
     * 根据区域获取区域类条件查询一行数据
     * @param id
     * @return
     */
    public Quyu findEntity(Quyu id) {
        return dao.selectOne(id);
    }

    /**
     * 搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Quyu> selectPage(Quyu obj, int page, int pageSize) {
        PageHelper.startPage(page, pageSize, true);
        List<Quyu> list = select(obj);
        PageInfo<Quyu> pageInfo = new PageInfo(list);
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
    public List<Quyu> selectPageExample(Example obj, int page, int pageSize) {
        PageHelper.startPage(page, pageSize, true);
        List<Quyu> list = dao.selectByExample(obj);
        PageInfo<Quyu> pageInfo = new PageInfo(list);
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
     * 插入区域     * @param y
     * @return
     */
    public int insert(Quyu y) {
        return dao.insertSelective(y);
    }

    /**
     * 更新区域     * @param y
     * @return
     */
    public int update(Quyu y) {
        return dao.updateByPrimaryKeySelective(y);
    }
}
