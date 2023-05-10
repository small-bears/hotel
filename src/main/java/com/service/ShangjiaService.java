package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangjiaView;


/**
 * 商家
 *
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
public interface ShangjiaService extends IService<ShangjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangjiaVO> selectListVO(Wrapper<ShangjiaEntity> wrapper);
   	
   	ShangjiaVO selectVO(@Param("ew") Wrapper<ShangjiaEntity> wrapper);
   	
   	List<ShangjiaView> selectListView(Wrapper<ShangjiaEntity> wrapper);
   	
   	ShangjiaView selectView(@Param("ew") Wrapper<ShangjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangjiaEntity> wrapper);
   	
}

