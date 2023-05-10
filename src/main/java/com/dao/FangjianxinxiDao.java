package com.dao;

import com.entity.FangjianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangjianxinxiVO;
import com.entity.view.FangjianxinxiView;


/**
 * 房间信息
 * 
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
public interface FangjianxinxiDao extends BaseMapper<FangjianxinxiEntity> {
	
	List<FangjianxinxiVO> selectListVO(@Param("ew") Wrapper<FangjianxinxiEntity> wrapper);
	
	FangjianxinxiVO selectVO(@Param("ew") Wrapper<FangjianxinxiEntity> wrapper);
	
	List<FangjianxinxiView> selectListView(@Param("ew") Wrapper<FangjianxinxiEntity> wrapper);

	List<FangjianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FangjianxinxiEntity> wrapper);
	
	FangjianxinxiView selectView(@Param("ew") Wrapper<FangjianxinxiEntity> wrapper);
	
}
