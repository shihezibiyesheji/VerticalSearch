package com.guorunhe.service;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrDocumentList;

public interface IDemoService {

	
	public int insertDemo(int id) throws SQLException;
	
	public SolrDocumentList query() throws SolrServerException, IOException;
	
}
