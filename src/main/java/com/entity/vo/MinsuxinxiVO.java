package com.entity.vo;

import com.entity.MinsuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 民宿信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
public class MinsuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 民宿编号
	 */
	
	private String minsubianhao;
		
	/**
	 * 民宿名称
	 */
	
	private String minsumingcheng;
		
	/**
	 * 民宿地址
	 */
	
	private String minsudizhi;
		
	/**
	 * 民宿图片
	 */
	
	private String minsutupian;
		
	/**
	 * 民宿简介
	 */
	
	private String minsujianjie;
		
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
	 * 设置：民宿编号
	 */
	 
	public void setMinsubianhao(String minsubianhao) {
		this.minsubianhao = minsubianhao;
	}
	
	/**
	 * 获取：民宿编号
	 */
	public String getMinsubianhao() {
		return minsubianhao;
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
	 * 设置：民宿地址
	 */
	 
	public void setMinsudizhi(String minsudizhi) {
		this.minsudizhi = minsudizhi;
	}
	
	/**
	 * 获取：民宿地址
	 */
	public String getMinsudizhi() {
		return minsudizhi;
	}
				
	
	/**
	 * 设置：民宿图片
	 */
	 
	public void setMinsutupian(String minsutupian) {
		this.minsutupian = minsutupian;
	}
	
	/**
	 * 获取：民宿图片
	 */
	public String getMinsutupian() {
		return minsutupian;
	}
				
	
	/**
	 * 设置：民宿简介
	 */
	 
	public void setMinsujianjie(String minsujianjie) {
		this.minsujianjie = minsujianjie;
	}
	
	/**
	 * 获取：民宿简介
	 */
	public String getMinsujianjie() {
		return minsujianjie;
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
			
}
