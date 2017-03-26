package com.guorunhe.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.guorunhe.service.IDemoService;
import com.guorunhe.service.ISolrService;

@Controller
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	private IDemoService service;
	
	
	@RequestMapping("/test")
	@ResponseBody
	public void insert(String id){
		int id_=Integer.parseInt(id);
		try {
			service.insertDemo(id_);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/index")
	@ResponseBody
	public ModelAndView index(){
		SolrDocumentList list = null;
		try {
			list = service.query();
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("index", "username", list);
	}
	
}
