package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussminsuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussminsuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussminsuxinxiView;


/**
 * 民宿信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
public interface DiscussminsuxinxiService extends IService<DiscussminsuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussminsuxinxiVO> selectListVO(Wrapper<DiscussminsuxinxiEntity> wrapper);
   	
   	DiscussminsuxinxiVO selectVO(@Param("ew") Wrapper<DiscussminsuxinxiEntity> wrapper);
   	
   	List<DiscussminsuxinxiView> selectListView(Wrapper<DiscussminsuxinxiEntity> wrapper);
   	
   	DiscussminsuxinxiView selectView(@Param("ew") Wrapper<DiscussminsuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussminsuxinxiEntity> wrapper);
   	
}

