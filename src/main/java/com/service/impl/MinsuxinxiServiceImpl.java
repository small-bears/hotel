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


import com.dao.MinsuxinxiDao;
import com.entity.MinsuxinxiEntity;
import com.service.MinsuxinxiService;
import com.entity.vo.MinsuxinxiVO;
import com.entity.view.MinsuxinxiView;

@Service("minsuxinxiService")
public class MinsuxinxiServiceImpl extends ServiceImpl<MinsuxinxiDao, MinsuxinxiEntity> implements MinsuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MinsuxinxiEntity> page = this.selectPage(
                new Query<MinsuxinxiEntity>(params).getPage(),
                new EntityWrapper<MinsuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MinsuxinxiEntity> wrapper) {
		  Page<MinsuxinxiView> page =new Query<MinsuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MinsuxinxiVO> selectListVO(Wrapper<MinsuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MinsuxinxiVO selectVO(Wrapper<MinsuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MinsuxinxiView> selectListView(Wrapper<MinsuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MinsuxinxiView selectView(Wrapper<MinsuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
