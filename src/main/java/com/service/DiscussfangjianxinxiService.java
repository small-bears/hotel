package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfangjianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfangjianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfangjianxinxiView;


/**
 * 房间信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
public interface DiscussfangjianxinxiService extends IService<DiscussfangjianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfangjianxinxiVO> selectListVO(Wrapper<DiscussfangjianxinxiEntity> wrapper);
   	
   	DiscussfangjianxinxiVO selectVO(@Param("ew") Wrapper<DiscussfangjianxinxiEntity> wrapper);
   	
   	List<DiscussfangjianxinxiView> selectListView(Wrapper<DiscussfangjianxinxiEntity> wrapper);
   	
   	DiscussfangjianxinxiView selectView(@Param("ew") Wrapper<DiscussfangjianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfangjianxinxiEntity> wrapper);
   	
}

