package com.spring.service;

import com.spring.entity.Kaiguanji;
import java.util.*;
import tk.mybatis.mapper.entity.Example;

public interface KaiguanjiService {
    /**
     * 获取所有数据
     * @return
     */
    public List<Kaiguanji> select();

    /**
     * 根据Kaiguanji类搜索数据
     * @param y
     * @return
     */
    public List<Kaiguanji> select(Kaiguanji y);

    /**
     * 根据主键获取开关机一行数据
     * @param id
     * @return
     */
    public Kaiguanji find(Object id);

    /**
     * 根据开关机获取开关机类条件查询一行数据
     * @param id
     * @return
     */
    public Kaiguanji findEntity(Kaiguanji id);

    /**
     * 搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Kaiguanji> selectPage(Kaiguanji obj, int page, int pageSize);

    /**
     * 根据Example搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Kaiguanji> selectPageExample(Example obj, int page, int pageSize);

    /**
     * 根据主键删除一行数据
     * @param id
     * @return
     */
    public int delete(Object id);

    /**
     * 插入开关机     * @param y
     * @return
     */
    public int insert(Kaiguanji y);

    /**
     * 更新开关机     * @param y
     * @return
     */
    public int update(Kaiguanji y);
}
