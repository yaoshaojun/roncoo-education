package com.roncoo.education.course.feign.web;

import org.springframework.cloud.openfeign.FeignClient;

import com.roncoo.education.course.common.interfaces.web.BossDicList;

/**
 * 数据字典明细表 
 *
 * @author wujing
 */
@FeignClient(value = "roncoo-education-course-service")
public interface IBossDicList extends BossDicList {

}
