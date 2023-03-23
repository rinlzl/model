package com.spring.service;

import com.spring.entity.Dengji;
import java.util.*;
import tk.mybatis.mapper.entity.Example;

public interface DengjiService {
    /**
     * 获取所有数据
     * @return
     */
    public List<Dengji> select();

    /**
     * 根据Dengji类搜索数据
     * @param y
     * @return
     */
    public List<Dengji> select(Dengji y);

    /**
     * 根据主键获取登记一行数据
     * @param id
     * @return
     */
    public Dengji find(Object id);

    /**
     * 根据登记获取登记类条件查询一行数据
     * @param id
     * @return
     */
    public Dengji findEntity(Dengji id);

    /**
     * 搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Dengji> selectPage(Dengji obj, int page, int pageSize);

    /**
     * 根据Example搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Dengji> selectPageExample(Example obj, int page, int pageSize);

    /**
     * 根据主键删除一行数据
     * @param id
     * @return
     */
    public int delete(Object id);

    /**
     * 插入登记     * @param y
     * @return
     */
    public int insert(Dengji y);

    /**
     * 更新登记     * @param y
     * @return
     */
    public int update(Dengji y);
}
