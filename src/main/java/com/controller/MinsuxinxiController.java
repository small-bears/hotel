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

import com.entity.MinsuxinxiEntity;
import com.entity.view.MinsuxinxiView;

import com.service.MinsuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 民宿信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-05 23:54:47
 */
@RestController
@RequestMapping("/minsuxinxi")
public class MinsuxinxiController {
    @Autowired
    private MinsuxinxiService minsuxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,MinsuxinxiEntity minsuxinxi, HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			minsuxinxi.setShangjiabianhao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<MinsuxinxiEntity> ew = new EntityWrapper<MinsuxinxiEntity>();
		PageUtils page = minsuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, minsuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,MinsuxinxiEntity minsuxinxi, HttpServletRequest request){
        EntityWrapper<MinsuxinxiEntity> ew = new EntityWrapper<MinsuxinxiEntity>();
		PageUtils page = minsuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, minsuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( MinsuxinxiEntity minsuxinxi){
       	EntityWrapper<MinsuxinxiEntity> ew = new EntityWrapper<MinsuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( minsuxinxi, "minsuxinxi")); 
        return R.ok().put("data", minsuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(MinsuxinxiEntity minsuxinxi){
        EntityWrapper< MinsuxinxiEntity> ew = new EntityWrapper< MinsuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( minsuxinxi, "minsuxinxi")); 
		MinsuxinxiView minsuxinxiView =  minsuxinxiService.selectView(ew);
		return R.ok("查询民宿信息成功").put("data", minsuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        MinsuxinxiEntity minsuxinxi = minsuxinxiService.selectById(id);
		minsuxinxi.setClicktime(new Date());
		minsuxinxiService.updateById(minsuxinxi);
        return R.ok().put("data", minsuxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        MinsuxinxiEntity minsuxinxi = minsuxinxiService.selectById(id);
		minsuxinxi.setClicktime(new Date());
		minsuxinxiService.updateById(minsuxinxi);
        return R.ok().put("data", minsuxinxi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        MinsuxinxiEntity minsuxinxi = minsuxinxiService.selectById(id);
        if(type.equals("1")) {
        	minsuxinxi.setThumbsupnum(minsuxinxi.getThumbsupnum()+1);
        } else {
        	minsuxinxi.setCrazilynum(minsuxinxi.getCrazilynum()+1);
        }
        minsuxinxiService.updateById(minsuxinxi);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MinsuxinxiEntity minsuxinxi, HttpServletRequest request){
    	minsuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(minsuxinxi);
        minsuxinxiService.insert(minsuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody MinsuxinxiEntity minsuxinxi, HttpServletRequest request){
    	minsuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(minsuxinxi);
        minsuxinxiService.insert(minsuxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MinsuxinxiEntity minsuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(minsuxinxi);
        minsuxinxiService.updateById(minsuxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        minsuxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<MinsuxinxiEntity> wrapper = new EntityWrapper<MinsuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			wrapper.eq("shangjiabianhao", (String)request.getSession().getAttribute("username"));
		}

		int count = minsuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,MinsuxinxiEntity minsuxinxi, HttpServletRequest request,String pre){
        EntityWrapper<MinsuxinxiEntity> ew = new EntityWrapper<MinsuxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = minsuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, minsuxinxi), params), params));
        return R.ok().put("data", page);
    }


}
