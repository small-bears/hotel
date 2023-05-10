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


import com.dao.FangjiantuidingDao;
import com.entity.FangjiantuidingEntity;
import com.service.FangjiantuidingService;
import com.entity.vo.FangjiantuidingVO;
import com.entity.view.FangjiantuidingView;

@Service("fangjiantuidingService")
public class FangjiantuidingServiceImpl extends ServiceImpl<FangjiantuidingDao, FangjiantuidingEntity> implements FangjiantuidingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangjiantuidingEntity> page = this.selectPage(
                new Query<FangjiantuidingEntity>(params).getPage(),
                new EntityWrapper<FangjiantuidingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangjiantuidingEntity> wrapper) {
		  Page<FangjiantuidingView> page =new Query<FangjiantuidingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangjiantuidingVO> selectListVO(Wrapper<FangjiantuidingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangjiantuidingVO selectVO(Wrapper<FangjiantuidingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangjiantuidingView> selectListView(Wrapper<FangjiantuidingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangjiantuidingView selectView(Wrapper<FangjiantuidingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
