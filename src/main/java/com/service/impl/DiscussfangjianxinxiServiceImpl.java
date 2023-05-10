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


import com.dao.DiscussfangjianxinxiDao;
import com.entity.DiscussfangjianxinxiEntity;
import com.service.DiscussfangjianxinxiService;
import com.entity.vo.DiscussfangjianxinxiVO;
import com.entity.view.DiscussfangjianxinxiView;

@Service("discussfangjianxinxiService")
public class DiscussfangjianxinxiServiceImpl extends ServiceImpl<DiscussfangjianxinxiDao, DiscussfangjianxinxiEntity> implements DiscussfangjianxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfangjianxinxiEntity> page = this.selectPage(
                new Query<DiscussfangjianxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussfangjianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfangjianxinxiEntity> wrapper) {
		  Page<DiscussfangjianxinxiView> page =new Query<DiscussfangjianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfangjianxinxiVO> selectListVO(Wrapper<DiscussfangjianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfangjianxinxiVO selectVO(Wrapper<DiscussfangjianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfangjianxinxiView> selectListView(Wrapper<DiscussfangjianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfangjianxinxiView selectView(Wrapper<DiscussfangjianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
