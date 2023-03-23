package com.spring.service;

import com.spring.entity.Quyu;
import java.util.*;
import tk.mybatis.mapper.entity.Example;

public interface QuyuService {
    /**
     * 获取所有数据
     * @return
     */
    public List<Quyu> select();

    /**
     * 根据Quyu类搜索数据
     * @param y
     * @return
     */
    public List<Quyu> select(Quyu y);

    /**
     * 根据主键获取区域一行数据
     * @param id
     * @return
     */
    public Quyu find(Object id);

    /**
     * 根据区域获取区域类条件查询一行数据
     * @param id
     * @return
     */
    public Quyu findEntity(Quyu id);

    /**
     * 搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Quyu> selectPage(Quyu obj, int page, int pageSize);

    /**
     * 根据Example搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Quyu> selectPageExample(Example obj, int page, int pageSize);

    /**
     * 根据主键删除一行数据
     * @param id
     * @return
     */
    public int delete(Object id);

    /**
     * 插入区域     * @param y
     * @return
     */
    public int insert(Quyu y);

    /**
     * 更新区域     * @param y
     * @return
     */
    public int update(Quyu y);
}
