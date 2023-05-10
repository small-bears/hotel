package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangjianyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangjianyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangjianyudingView;


/**
 * 房间预订
 *
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
public interface FangjianyudingService extends IService<FangjianyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangjianyudingVO> selectListVO(Wrapper<FangjianyudingEntity> wrapper);
   	
   	FangjianyudingVO selectVO(@Param("ew") Wrapper<FangjianyudingEntity> wrapper);
   	
   	List<FangjianyudingView> selectListView(Wrapper<FangjianyudingEntity> wrapper);
   	
   	FangjianyudingView selectView(@Param("ew") Wrapper<FangjianyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangjianyudingEntity> wrapper);
   	
}

