package com.dao;

import com.entity.FangjianyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangjianyudingVO;
import com.entity.view.FangjianyudingView;


/**
 * 房间预订
 * 
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
public interface FangjianyudingDao extends BaseMapper<FangjianyudingEntity> {
	
	List<FangjianyudingVO> selectListVO(@Param("ew") Wrapper<FangjianyudingEntity> wrapper);
	
	FangjianyudingVO selectVO(@Param("ew") Wrapper<FangjianyudingEntity> wrapper);
	
	List<FangjianyudingView> selectListView(@Param("ew") Wrapper<FangjianyudingEntity> wrapper);

	List<FangjianyudingView> selectListView(Pagination page,@Param("ew") Wrapper<FangjianyudingEntity> wrapper);
	
	FangjianyudingView selectView(@Param("ew") Wrapper<FangjianyudingEntity> wrapper);
	
}
