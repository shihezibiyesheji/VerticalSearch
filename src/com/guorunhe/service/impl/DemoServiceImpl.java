package com.guorunhe.service.impl;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guorunhe.mapper.IDemoMapper;
import com.guorunhe.service.IDemoService;

@Service
public class DemoServiceImpl implements IDemoService{

	@Autowired
	private IDemoMapper mapper;
	
	@Override
	public int insertDemo(int id) throws SQLException {
		// TODO Auto-generated method stub
		int result=mapper.insertDemo(id);
		if(result==1){
			System.out.println("插入成功！");
		}else{
			System.out.println("插入失败！");
		}
		return 0;
	}
	
	
	@Override
	public SolrDocumentList query() throws SolrServerException, IOException {
		String urlString = "http://localhost:8983/solr/company";
		SolrClient solr = new HttpSolrClient.Builder(urlString).build();
		SolrQuery query = new SolrQuery();
		query.set("q", "name:Gouda cheese wheel");
		query.set("fl", "category,title,price");
		query.setFields("category", "title", "price");
		query.set("q", "category:books");
		QueryResponse response = null;
		response = solr.query(query);
		SolrDocumentList list = response.getResults();
		return list;
	}

}
