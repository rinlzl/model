package com.spring.entity;

import com.spring.util.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "kaiguanji")
public class Kaiguanji implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(generator = "JDBC") // 自增的主键映射
    @Id
    @Column(name = "id", insertable = false)
    private Integer id;

    @Column(name = "zhajiid")
    private Integer zhajiid;

    @Column(name = "jiqihao")
    private String jiqihao;

    @Column(name = "mingcheng")
    private String mingcheng;

    @Column(name = "tupian")
    private String tupian;

    @Column(name = "quyu")
    private String quyu;

    @Column(name = "caozuo")
    private String caozuo;

    @Column(name = "beizhu")
    private String beizhu;

    @Column(name = "addtime")
    private String addtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getZhajiid() {
        return zhajiid;
    }

    public void setZhajiid(Integer zhajiid) {
        this.zhajiid = zhajiid;
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

    public String getCaozuo() {
        return caozuo;
    }

    public void setCaozuo(String caozuo) {
        this.caozuo = caozuo;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }
}
