package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 房间退订
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
@TableName("fangjiantuiding")
public class FangjiantuidingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FangjiantuidingEntity() {
		
	}
	
	public FangjiantuidingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 退订编号
	 */
					
	private String tuidingbianhao;
	
	/**
	 * 商家编号
	 */
					
	private String shangjiabianhao;
	
	/**
	 * 民宿名称
	 */
					
	private String minsumingcheng;
	
	/**
	 * 房间类型
	 */
					
	private String fangjianleixing;
	
	/**
	 * 房间价格
	 */
					
	private Integer fangjianjiage;
	
	/**
	 * 天数
	 */
					
	private Integer tianshu;
	
	/**
	 * 已收金额
	 */
					
	private String yishoujine;
	
	/**
	 * 退订时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date tuidingshijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：退订编号
	 */
	public void setTuidingbianhao(String tuidingbianhao) {
		this.tuidingbianhao = tuidingbianhao;
	}
	/**
	 * 获取：退订编号
	 */
	public String getTuidingbianhao() {
		return tuidingbianhao;
	}
	/**
	 * 设置：商家编号
	 */
	public void setShangjiabianhao(String shangjiabianhao) {
		this.shangjiabianhao = shangjiabianhao;
	}
	/**
	 * 获取：商家编号
	 */
	public String getShangjiabianhao() {
		return shangjiabianhao;
	}
	/**
	 * 设置：民宿名称
	 */
	public void setMinsumingcheng(String minsumingcheng) {
		this.minsumingcheng = minsumingcheng;
	}
	/**
	 * 获取：民宿名称
	 */
	public String getMinsumingcheng() {
		return minsumingcheng;
	}
	/**
	 * 设置：房间类型
	 */
	public void setFangjianleixing(String fangjianleixing) {
		this.fangjianleixing = fangjianleixing;
	}
	/**
	 * 获取：房间类型
	 */
	public String getFangjianleixing() {
		return fangjianleixing;
	}
	/**
	 * 设置：房间价格
	 */
	public void setFangjianjiage(Integer fangjianjiage) {
		this.fangjianjiage = fangjianjiage;
	}
	/**
	 * 获取：房间价格
	 */
	public Integer getFangjianjiage() {
		return fangjianjiage;
	}
	/**
	 * 设置：天数
	 */
	public void setTianshu(Integer tianshu) {
		this.tianshu = tianshu;
	}
	/**
	 * 获取：天数
	 */
	public Integer getTianshu() {
		return tianshu;
	}
	/**
	 * 设置：已收金额
	 */
	public void setYishoujine(String yishoujine) {
		this.yishoujine = yishoujine;
	}
	/**
	 * 获取：已收金额
	 */
	public String getYishoujine() {
		return yishoujine;
	}
	/**
	 * 设置：退订时间
	 */
	public void setTuidingshijian(Date tuidingshijian) {
		this.tuidingshijian = tuidingshijian;
	}
	/**
	 * 获取：退订时间
	 */
	public Date getTuidingshijian() {
		return tuidingshijian;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
