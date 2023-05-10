package com.dao;

import com.entity.TousufankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TousufankuiVO;
import com.entity.view.TousufankuiView;


/**
 * 投诉反馈
 * 
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
public interface TousufankuiDao extends BaseMapper<TousufankuiEntity> {
	
	List<TousufankuiVO> selectListVO(@Param("ew") Wrapper<TousufankuiEntity> wrapper);
	
	TousufankuiVO selectVO(@Param("ew") Wrapper<TousufankuiEntity> wrapper);
	
	List<TousufankuiView> selectListView(@Param("ew") Wrapper<TousufankuiEntity> wrapper);

	List<TousufankuiView> selectListView(Pagination page,@Param("ew") Wrapper<TousufankuiEntity> wrapper);
	
	TousufankuiView selectView(@Param("ew") Wrapper<TousufankuiEntity> wrapper);
	
}
