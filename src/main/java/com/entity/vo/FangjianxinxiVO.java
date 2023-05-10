package com.entity.vo;

import com.entity.FangjianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 房间信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
public class FangjianxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 民宿名称
	 */
	
	private String minsumingcheng;
		
	/**
	 * 房间类型
	 */
	
	private String fangjianleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 房间设施
	 */
	
	private String fangjiansheshi;
		
	/**
	 * 房间价格
	 */
	
	private Integer fangjianjiage;
		
	/**
	 * 房间介绍
	 */
	
	private String fangjianjieshao;
		
	/**
	 * 收取金额
	 */
	
	private String shouqujine;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
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
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：房间设施
	 */
	 
	public void setFangjiansheshi(String fangjiansheshi) {
		this.fangjiansheshi = fangjiansheshi;
	}
	
	/**
	 * 获取：房间设施
	 */
	public String getFangjiansheshi() {
		return fangjiansheshi;
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
	 * 设置：房间介绍
	 */
	 
	public void setFangjianjieshao(String fangjianjieshao) {
		this.fangjianjieshao = fangjianjieshao;
	}
	
	/**
	 * 获取：房间介绍
	 */
	public String getFangjianjieshao() {
		return fangjianjieshao;
	}
				
	
	/**
	 * 设置：收取金额
	 */
	 
	public void setShouqujine(String shouqujine) {
		this.shouqujine = shouqujine;
	}
	
	/**
	 * 获取：收取金额
	 */
	public String getShouqujine() {
		return shouqujine;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
