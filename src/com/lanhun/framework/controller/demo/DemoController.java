/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.lanhun.framework.controller.demo;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.Page;
import com.lanhun.framework.orm.model.Country;
import com.lanhun.framework.orm.model.CountryExample;
import com.lanhun.framework.service.DemoService;

/**
 * @author liuzh
 */
@Controller
@SuppressWarnings({ "rawtypes", "unchecked" })
public class DemoController {

	@Resource
	private DemoService demoService;

	@RequestMapping(value = { "/", "index.html" })
	public String index() {
		return "index";
	}

	@ResponseBody
	@RequestMapping("test3")
	public List<Country> requestTest7(
			@RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
			@RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize) {
		return demoService.selectPage(pageNum, pageSize);
	}
	@RequestMapping("test4")
	public ModelAndView requestTest8(
			@RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
			@RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize) {
		ModelAndView view=new ModelAndView();
		
		Page<Country> dataList=(Page)demoService.selectPage(pageNum, pageSize);
		view.addObject("total", dataList.getTotal());
		view.addObject("dataList",dataList);
		return view;
	}
	@RequestMapping("test5")
	public ModelAndView requestTest9(
			@RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
			@RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize) {
		ModelAndView view=new ModelAndView();
		CountryExample example =new CountryExample();
		example.setOrderByClause("id");
		Page<Country> dataList=(Page)demoService.selectByExample(pageNum, pageSize, example);
		view.addObject("total", dataList.getTotal());
		view.addObject("dataList",dataList);
		return view;
	}
}
