package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangjianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangjianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangjianxinxiView;


/**
 * 房间信息
 *
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
public interface FangjianxinxiService extends IService<FangjianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangjianxinxiVO> selectListVO(Wrapper<FangjianxinxiEntity> wrapper);
   	
   	FangjianxinxiVO selectVO(@Param("ew") Wrapper<FangjianxinxiEntity> wrapper);
   	
   	List<FangjianxinxiView> selectListView(Wrapper<FangjianxinxiEntity> wrapper);
   	
   	FangjianxinxiView selectView(@Param("ew") Wrapper<FangjianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangjianxinxiEntity> wrapper);
   	
}

