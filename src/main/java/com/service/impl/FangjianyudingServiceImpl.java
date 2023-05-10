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


import com.dao.FangjianyudingDao;
import com.entity.FangjianyudingEntity;
import com.service.FangjianyudingService;
import com.entity.vo.FangjianyudingVO;
import com.entity.view.FangjianyudingView;

@Service("fangjianyudingService")
public class FangjianyudingServiceImpl extends ServiceImpl<FangjianyudingDao, FangjianyudingEntity> implements FangjianyudingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangjianyudingEntity> page = this.selectPage(
                new Query<FangjianyudingEntity>(params).getPage(),
                new EntityWrapper<FangjianyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangjianyudingEntity> wrapper) {
		  Page<FangjianyudingView> page =new Query<FangjianyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangjianyudingVO> selectListVO(Wrapper<FangjianyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangjianyudingVO selectVO(Wrapper<FangjianyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangjianyudingView> selectListView(Wrapper<FangjianyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangjianyudingView selectView(Wrapper<FangjianyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
