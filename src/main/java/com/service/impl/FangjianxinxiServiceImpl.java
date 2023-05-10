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


import com.dao.FangjianxinxiDao;
import com.entity.FangjianxinxiEntity;
import com.service.FangjianxinxiService;
import com.entity.vo.FangjianxinxiVO;
import com.entity.view.FangjianxinxiView;

@Service("fangjianxinxiService")
public class FangjianxinxiServiceImpl extends ServiceImpl<FangjianxinxiDao, FangjianxinxiEntity> implements FangjianxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangjianxinxiEntity> page = this.selectPage(
                new Query<FangjianxinxiEntity>(params).getPage(),
                new EntityWrapper<FangjianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangjianxinxiEntity> wrapper) {
		  Page<FangjianxinxiView> page =new Query<FangjianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangjianxinxiVO> selectListVO(Wrapper<FangjianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangjianxinxiVO selectVO(Wrapper<FangjianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangjianxinxiView> selectListView(Wrapper<FangjianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangjianxinxiView selectView(Wrapper<FangjianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
