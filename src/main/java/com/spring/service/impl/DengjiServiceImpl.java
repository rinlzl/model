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

@Service("DengjiService")
public class DengjiServiceImpl implements DengjiService {

    @Resource
    private DengjiMapper dao;

    /**
     * 获取所有数据
     * @return
     */
    public List<Dengji> select() {
        return dao.select(null);
    }

    /**
     * 根据Dengji类搜索数据
     * @param y
     * @return
     */
    public List<Dengji> select(Dengji y) {
        return dao.select(y);
    }

    /**
     * 根据主键获取登记一行数据
     * @param id
     * @return
     */
    public Dengji find(Object id) {
        return dao.selectByPrimaryKey(id);
    }

    /**
     * 根据登记获取登记类条件查询一行数据
     * @param id
     * @return
     */
    public Dengji findEntity(Dengji id) {
        return dao.selectOne(id);
    }

    /**
     * 搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Dengji> selectPage(Dengji obj, int page, int pageSize) {
        PageHelper.startPage(page, pageSize, true);
        List<Dengji> list = select(obj);
        PageInfo<Dengji> pageInfo = new PageInfo(list);
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
    public List<Dengji> selectPageExample(Example obj, int page, int pageSize) {
        PageHelper.startPage(page, pageSize, true);
        List<Dengji> list = dao.selectByExample(obj);
        PageInfo<Dengji> pageInfo = new PageInfo(list);
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
     * 插入登记     * @param y
     * @return
     */
    public int insert(Dengji y) {
        return dao.insertSelective(y);
    }

    /**
     * 更新登记     * @param y
     * @return
     */
    public int update(Dengji y) {
        return dao.updateByPrimaryKeySelective(y);
    }
}
