package com.guorunhe.service;

import java.util.ArrayList;

import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;

public interface ISolrService {
	
	static String url = "http://localhost:8983/solr/position";
	
	public SolrDocumentList query(String mQueryStr);
	
	public SolrDocumentList queryPage(String queryStr,Integer start,Integer rows );
	
	public QueryResponse search(String QString, ArrayList<String> FqString, int start, int pagesize);
}
