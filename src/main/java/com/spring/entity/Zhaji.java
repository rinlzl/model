package com.spring.entity;

import com.spring.util.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "zhaji")
public class Zhaji implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(generator = "JDBC") // 自增的主键映射
    @Id
    @Column(name = "id", insertable = false)
    private Integer id;

    @Column(name = "jiqihao")
    private String jiqihao;

    @Column(name = "mingcheng")
    private String mingcheng;

    @Column(name = "tupian")
    private String tupian;

    @Column(name = "quyu")
    private String quyu;

    @Column(name = "zhuangtai")
    private String zhuangtai;

    @Column(name = "xiangxi")
    private String xiangxi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getKaiguanjiCount() {
        return Query.make("kaiguanji").where("zhajiid", id).count();
    }

    public Long getDengjiCount() {
        return Query.make("dengji").where("zhajiid", id).count();
    }

    public String getJiqihao() {
        return jiqihao;
    }

    public void setJiqihao(String jiqihao) {
        this.jiqihao = jiqihao;
    }

    public String getMingcheng() {
        return mingcheng;
    }

    public void setMingcheng(String mingcheng) {
        this.mingcheng = mingcheng;
    }

    public String getTupian() {
        return tupian;
    }

    public void setTupian(String tupian) {
        this.tupian = tupian;
    }

    public String getQuyu() {
        return quyu;
    }

    public void setQuyu(String quyu) {
        this.quyu = quyu;
    }

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    public String getXiangxi() {
        return xiangxi;
    }

    public void setXiangxi(String xiangxi) {
        this.xiangxi = xiangxi;
    }
}
