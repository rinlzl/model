package com.spring.service;

import com.spring.entity.Zhaji;
import java.util.*;
import tk.mybatis.mapper.entity.Example;

public interface ZhajiService {
    /**
     * 获取所有数据
     * @return
     */
    public List<Zhaji> select();

    /**
     * 根据Zhaji类搜索数据
     * @param y
     * @return
     */
    public List<Zhaji> select(Zhaji y);

    /**
     * 根据主键获取闸机一行数据
     * @param id
     * @return
     */
    public Zhaji find(Object id);

    /**
     * 根据闸机获取闸机类条件查询一行数据
     * @param id
     * @return
     */
    public Zhaji findEntity(Zhaji id);

    /**
     * 搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Zhaji> selectPage(Zhaji obj, int page, int pageSize);

    /**
     * 根据Example搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Zhaji> selectPageExample(Example obj, int page, int pageSize);

    /**
     * 根据主键删除一行数据
     * @param id
     * @return
     */
    public int delete(Object id);

    /**
     * 插入闸机     * @param y
     * @return
     */
    public int insert(Zhaji y);

    /**
     * 更新闸机     * @param y
     * @return
     */
    public int update(Zhaji y);
}
