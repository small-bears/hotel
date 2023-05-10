package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TousufankuiDao;
import com.entity.TousufankuiEntity;
import com.service.TousufankuiService;
import com.entity.vo.TousufankuiVO;
import com.entity.view.TousufankuiView;

@Service("tousufankuiService")
public class TousufankuiServiceImpl extends ServiceImpl<TousufankuiDao, TousufankuiEntity> implements TousufankuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TousufankuiEntity> page = this.selectPage(
                new Query<TousufankuiEntity>(params).getPage(),
                new EntityWrapper<TousufankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TousufankuiEntity> wrapper) {
		  Page<TousufankuiView> page =new Query<TousufankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TousufankuiVO> selectListVO(Wrapper<TousufankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TousufankuiVO selectVO(Wrapper<TousufankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TousufankuiView> selectListView(Wrapper<TousufankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TousufankuiView selectView(Wrapper<TousufankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
