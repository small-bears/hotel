package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangjiantuidingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangjiantuidingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangjiantuidingView;


/**
 * 房间退订
 *
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
public interface FangjiantuidingService extends IService<FangjiantuidingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangjiantuidingVO> selectListVO(Wrapper<FangjiantuidingEntity> wrapper);
   	
   	FangjiantuidingVO selectVO(@Param("ew") Wrapper<FangjiantuidingEntity> wrapper);
   	
   	List<FangjiantuidingView> selectListView(Wrapper<FangjiantuidingEntity> wrapper);
   	
   	FangjiantuidingView selectView(@Param("ew") Wrapper<FangjiantuidingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangjiantuidingEntity> wrapper);
   	
}

