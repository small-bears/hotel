package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MinsuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MinsuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MinsuxinxiView;


/**
 * 民宿信息
 *
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
public interface MinsuxinxiService extends IService<MinsuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MinsuxinxiVO> selectListVO(Wrapper<MinsuxinxiEntity> wrapper);
   	
   	MinsuxinxiVO selectVO(@Param("ew") Wrapper<MinsuxinxiEntity> wrapper);
   	
   	List<MinsuxinxiView> selectListView(Wrapper<MinsuxinxiEntity> wrapper);
   	
   	MinsuxinxiView selectView(@Param("ew") Wrapper<MinsuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MinsuxinxiEntity> wrapper);
   	
}

