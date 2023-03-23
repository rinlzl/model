package com.spring.entity;

import com.spring.util.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "dengji")
public class Dengji implements Serializable {

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

    @Column(name = "dengji")
    private String dengji;

    @Column(name = "gerenxinxi")
    private Integer gerenxinxi;

    @Column(name = "yonghuming")
    private String yonghuming;

    @Column(name = "xingming")
    private String xingming;

    @Column(name = "shouji")
    private String shouji;

    @Column(name = "zhaopian")
    private String zhaopian;

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

    public String getDengji() {
        return dengji;
    }

    public void setDengji(String dengji) {
        this.dengji = dengji;
    }

    public Integer getGerenxinxi() {
        return gerenxinxi;
    }

    public void setGerenxinxi(Integer gerenxinxi) {
        this.gerenxinxi = gerenxinxi;
    }

    public String getYonghuming() {
        return yonghuming;
    }

    public void setYonghuming(String yonghuming) {
        this.yonghuming = yonghuming;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public String getShouji() {
        return shouji;
    }

    public void setShouji(String shouji) {
        this.shouji = shouji;
    }

    public String getZhaopian() {
        return zhaopian;
    }

    public void setZhaopian(String zhaopian) {
        this.zhaopian = zhaopian;
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
