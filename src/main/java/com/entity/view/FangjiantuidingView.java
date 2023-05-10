package com.entity.view;

import com.entity.FangjiantuidingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 房间退订
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
@TableName("fangjiantuiding")
public class FangjiantuidingView  extends FangjiantuidingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangjiantuidingView(){
	}
 
 	public FangjiantuidingView(FangjiantuidingEntity fangjiantuidingEntity){
 	try {
			BeanUtils.copyProperties(this, fangjiantuidingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
