package com.entity.vo;

import com.entity.FangjianyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 房间预订
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
public class FangjianyudingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 预订时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yudingshijian;
		
	/**
	 * 入住时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date ruzhushijian;
		
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
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：预订时间
	 */
	 
	public void setYudingshijian(Date yudingshijian) {
		this.yudingshijian = yudingshijian;
	}
	
	/**
	 * 获取：预订时间
	 */
	public Date getYudingshijian() {
		return yudingshijian;
	}
				
	
	/**
	 * 设置：入住时间
	 */
	 
	public void setRuzhushijian(Date ruzhushijian) {
		this.ruzhushijian = ruzhushijian;
	}
	
	/**
	 * 获取：入住时间
	 */
	public Date getRuzhushijian() {
		return ruzhushijian;
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
