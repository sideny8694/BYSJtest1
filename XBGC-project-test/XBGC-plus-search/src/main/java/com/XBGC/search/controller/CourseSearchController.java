package com.XBGC.search.controller;

import com.XBGC.base.model.PageParams;
import com.XBGC.base.model.PageResult;
import com.XBGC.search.dto.SearchCourseParamDto;
import com.XBGC.search.dto.SearchPageResultDto;
import com.XBGC.search.po.CourseIndex;
import com.XBGC.search.service.CourseSearchService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description 课程搜索接口
 * @author Mr.w
 * @date 2025/2/24 22:31
 * @version 1.0
 */
@Api(value = "课程搜索接口",tags = "课程搜索接口")
 @RestController
 @RequestMapping("/course")
public class CourseSearchController {

 @Autowired
 CourseSearchService courseSearchService;


 @ApiOperation("课程搜索列表")
  @GetMapping("/list")
 public SearchPageResultDto<CourseIndex> list(PageParams pageParams, SearchCourseParamDto searchCourseParamDto){

    return courseSearchService.queryCoursePubIndex(pageParams,searchCourseParamDto);
   
  }
}
