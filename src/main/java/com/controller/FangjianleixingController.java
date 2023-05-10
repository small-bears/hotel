package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.FangjianleixingEntity;
import com.entity.view.FangjianleixingView;

import com.service.FangjianleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 房间类型
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
@RestController
@RequestMapping("/fangjianleixing")
public class FangjianleixingController {
    @Autowired
    private FangjianleixingService fangjianleixingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FangjianleixingEntity fangjianleixing, HttpServletRequest request){
        EntityWrapper<FangjianleixingEntity> ew = new EntityWrapper<FangjianleixingEntity>();
		PageUtils page = fangjianleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fangjianleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FangjianleixingEntity fangjianleixing, HttpServletRequest request){
        EntityWrapper<FangjianleixingEntity> ew = new EntityWrapper<FangjianleixingEntity>();
		PageUtils page = fangjianleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fangjianleixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FangjianleixingEntity fangjianleixing){
       	EntityWrapper<FangjianleixingEntity> ew = new EntityWrapper<FangjianleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fangjianleixing, "fangjianleixing")); 
        return R.ok().put("data", fangjianleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FangjianleixingEntity fangjianleixing){
        EntityWrapper< FangjianleixingEntity> ew = new EntityWrapper< FangjianleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fangjianleixing, "fangjianleixing")); 
		FangjianleixingView fangjianleixingView =  fangjianleixingService.selectView(ew);
		return R.ok("查询房间类型成功").put("data", fangjianleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FangjianleixingEntity fangjianleixing = fangjianleixingService.selectById(id);
        return R.ok().put("data", fangjianleixing);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FangjianleixingEntity fangjianleixing = fangjianleixingService.selectById(id);
        return R.ok().put("data", fangjianleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FangjianleixingEntity fangjianleixing, HttpServletRequest request){
    	fangjianleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fangjianleixing);
        fangjianleixingService.insert(fangjianleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FangjianleixingEntity fangjianleixing, HttpServletRequest request){
    	fangjianleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fangjianleixing);
        fangjianleixingService.insert(fangjianleixing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FangjianleixingEntity fangjianleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fangjianleixing);
        fangjianleixingService.updateById(fangjianleixing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fangjianleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<FangjianleixingEntity> wrapper = new EntityWrapper<FangjianleixingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = fangjianleixingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
