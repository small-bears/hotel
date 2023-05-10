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


import com.dao.ShangjiaDao;
import com.entity.ShangjiaEntity;
import com.service.ShangjiaService;
import com.entity.vo.ShangjiaVO;
import com.entity.view.ShangjiaView;

@Service("shangjiaService")
public class ShangjiaServiceImpl extends ServiceImpl<ShangjiaDao, ShangjiaEntity> implements ShangjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangjiaEntity> page = this.selectPage(
                new Query<ShangjiaEntity>(params).getPage(),
                new EntityWrapper<ShangjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangjiaEntity> wrapper) {
		  Page<ShangjiaView> page =new Query<ShangjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangjiaVO> selectListVO(Wrapper<ShangjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangjiaVO selectVO(Wrapper<ShangjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangjiaView> selectListView(Wrapper<ShangjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangjiaView selectView(Wrapper<ShangjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
