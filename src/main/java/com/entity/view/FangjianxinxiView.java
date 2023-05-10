package com.entity.view;

import com.entity.FangjianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 房间信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
@TableName("fangjianxinxi")
public class FangjianxinxiView  extends FangjianxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangjianxinxiView(){
	}
 
 	public FangjianxinxiView(FangjianxinxiEntity fangjianxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, fangjianxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
