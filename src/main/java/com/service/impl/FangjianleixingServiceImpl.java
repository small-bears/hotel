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


import com.dao.FangjianleixingDao;
import com.entity.FangjianleixingEntity;
import com.service.FangjianleixingService;
import com.entity.vo.FangjianleixingVO;
import com.entity.view.FangjianleixingView;

@Service("fangjianleixingService")
public class FangjianleixingServiceImpl extends ServiceImpl<FangjianleixingDao, FangjianleixingEntity> implements FangjianleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangjianleixingEntity> page = this.selectPage(
                new Query<FangjianleixingEntity>(params).getPage(),
                new EntityWrapper<FangjianleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangjianleixingEntity> wrapper) {
		  Page<FangjianleixingView> page =new Query<FangjianleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangjianleixingVO> selectListVO(Wrapper<FangjianleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangjianleixingVO selectVO(Wrapper<FangjianleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangjianleixingView> selectListView(Wrapper<FangjianleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangjianleixingView selectView(Wrapper<FangjianleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
