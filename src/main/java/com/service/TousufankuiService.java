package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TousufankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TousufankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TousufankuiView;


/**
 * 投诉反馈
 *
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
public interface TousufankuiService extends IService<TousufankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TousufankuiVO> selectListVO(Wrapper<TousufankuiEntity> wrapper);
   	
   	TousufankuiVO selectVO(@Param("ew") Wrapper<TousufankuiEntity> wrapper);
   	
   	List<TousufankuiView> selectListView(Wrapper<TousufankuiEntity> wrapper);
   	
   	TousufankuiView selectView(@Param("ew") Wrapper<TousufankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TousufankuiEntity> wrapper);
   	
}

