package com.dao;

import com.entity.HuanbaozhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuanbaozhishiView;

/**
 * 环保知识 Dao 接口
 *
 * @author 
 */
public interface HuanbaozhishiDao extends BaseMapper<HuanbaozhishiEntity> {

   List<HuanbaozhishiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
