package com.dao;

import com.entity.DiscussfangjianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfangjianxinxiVO;
import com.entity.view.DiscussfangjianxinxiView;


/**
 * 房间信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
public interface DiscussfangjianxinxiDao extends BaseMapper<DiscussfangjianxinxiEntity> {
	
	List<DiscussfangjianxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussfangjianxinxiEntity> wrapper);
	
	DiscussfangjianxinxiVO selectVO(@Param("ew") Wrapper<DiscussfangjianxinxiEntity> wrapper);
	
	List<DiscussfangjianxinxiView> selectListView(@Param("ew") Wrapper<DiscussfangjianxinxiEntity> wrapper);

	List<DiscussfangjianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfangjianxinxiEntity> wrapper);
	
	DiscussfangjianxinxiView selectView(@Param("ew") Wrapper<DiscussfangjianxinxiEntity> wrapper);
	
}
