package com.guorunhe.controller;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.guorunhe.service.ISolrService;
import com.guorunhe.vo.Position;

/**
 * solr控制器.
 * @date   2017-03-09.
 * @author Luo.Green.
 */
@Controller
@RequestMapping("/solr")
public class SolrController {
	
	@Autowired
	private ISolrService service;
	
	@RequestMapping("/query")
	@ResponseBody
	public ModelAndView query(){
		SolrDocumentList docList = service.query("name:程序员*");
		System.out.println("查询总数为："+docList.getNumFound());
		int i=0;
		for (SolrDocument solrDocument : docList) {
			System.out.println(solrDocument.get("name"));
		}
		System.out.println("思思");
		return new ModelAndView("index","username","思思");
	}
	
	/**
	 * 首页.
	 * 
	 * @return view.
	 */
	@RequestMapping("/index")
	public String index(){
		return "SearchHome";
	}
	
	@RequestMapping("search")
	@ResponseBody
	public ModelAndView search()
	{
		ArrayList<String> fq = new ArrayList<String>();
		ArrayList<String> hl = new ArrayList<String>();
		fq.add("education:高中");
		fq.add("exper:经验不限");
		fq.add("companyField:*美容*");
		hl.add("companyName");
		QueryResponse response = service.search("workAddress:深圳", fq, 1, 11);
		Map<String, Map<String, List<String>>> highLightList = response.getHighlighting();
		SolrDocumentList list = response.getResults();
		ArrayList<Position> posList = new ArrayList<Position>();
		for (SolrDocument solrDocument : list) {
			Position pos = new Position();
			pos = pos.SolrListToPosition(solrDocument);
			if (hl.size() > 0) {
				for (String hlField : hl){
					try {
						String property = highLightList.get(Integer.toString(pos.getId())).get(hlField).get(0);
						if (property != null) {
							Class<?> clazz;
							clazz = Class.forName("com.guorunhe.vo.Position");
							String methodName = "set" + hlField.substring(0, 1).toUpperCase() + hlField.substring(1);
							Method method = clazz.getMethod(methodName, String.class);
//							System.out.println(hlField);
							//System.out.println(highLightList.get(Integer.toString(pos.getId())).get(hlField).get(0));
							method.invoke(pos, property);
						}
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | ClassNotFoundException | NoSuchMethodException | SecurityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			System.out.println(pos.toString());
			posList.add(pos);
		}
		System.out.println(highLightList);
		return new ModelAndView("SearchResult", "list", posList);
	}
	
	/**
	 * 按照职位类别查询招聘信息，可选类型：工作年限、薪资水平、学历、职位类别.
	 * 
	 * @param String queryClass 查询类型.
	 * @param String paramClass 参数类型.
	 * @param int    start      开始记录.
	 * @param int    pageSize   记录页数.
	 * 
	 * @return
	 */
	@RequestMapping("/querypostclass")
	@ResponseBody
	public ModelAndView queryPostClass(String queryClass, String paramClass, int start, int  pageSize){
		SolrDocumentList docList = service.queryPage(queryClass+":"+paramClass+"*", start, pageSize);
		System.out.println("查询总数为："+docList.getNumFound());
		ArrayList list = new ArrayList();
		for (SolrDocument solrDocument : docList) {
		}
		// 此处已经获得了查询结果，等到后期返回到视图就可以了。
		return new ModelAndView("index","list",list);
	}

}
