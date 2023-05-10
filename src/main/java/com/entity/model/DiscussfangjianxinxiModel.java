package com.entity.model;

import com.entity.DiscussfangjianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 房间信息评论表
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
public class DiscussfangjianxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户id
	 */
	
	private Long userid;
		
	/**
	 * 评论内容
	 */
	
	private String content;
		
	/**
	 * 回复内容
	 */
	
	private String reply;
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
				
	
	/**
	 * 设置：评论内容
	 */
	 
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * 获取：评论内容
	 */
	public String getContent() {
		return content;
	}
				
	
	/**
	 * 设置：回复内容
	 */
	 
	public void setReply(String reply) {
		this.reply = reply;
	}
	
	/**
	 * 获取：回复内容
	 */
	public String getReply() {
		return reply;
	}
			
}
