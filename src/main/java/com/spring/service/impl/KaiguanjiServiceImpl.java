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

@Service("KaiguanjiService")
public class KaiguanjiServiceImpl implements KaiguanjiService {

    @Resource
    private KaiguanjiMapper dao;

    /**
     * 获取所有数据
     * @return
     */
    public List<Kaiguanji> select() {
        return dao.select(null);
    }

    /**
     * 根据Kaiguanji类搜索数据
     * @param y
     * @return
     */
    public List<Kaiguanji> select(Kaiguanji y) {
        return dao.select(y);
    }

    /**
     * 根据主键获取开关机一行数据
     * @param id
     * @return
     */
    public Kaiguanji find(Object id) {
        return dao.selectByPrimaryKey(id);
    }

    /**
     * 根据开关机获取开关机类条件查询一行数据
     * @param id
     * @return
     */
    public Kaiguanji findEntity(Kaiguanji id) {
        return dao.selectOne(id);
    }

    /**
     * 搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Kaiguanji> selectPage(Kaiguanji obj, int page, int pageSize) {
        PageHelper.startPage(page, pageSize, true);
        List<Kaiguanji> list = select(obj);
        PageInfo<Kaiguanji> pageInfo = new PageInfo(list);
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
    public List<Kaiguanji> selectPageExample(Example obj, int page, int pageSize) {
        PageHelper.startPage(page, pageSize, true);
        List<Kaiguanji> list = dao.selectByExample(obj);
        PageInfo<Kaiguanji> pageInfo = new PageInfo(list);
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
     * 插入开关机     * @param y
     * @return
     */
    public int insert(Kaiguanji y) {
        return dao.insertSelective(y);
    }

    /**
     * 更新开关机     * @param y
     * @return
     */
    public int update(Kaiguanji y) {
        return dao.updateByPrimaryKeySelective(y);
    }
}
