package com.guorunhe.service.impl;

import com.guorunhe.service.ISolrService;
import com.guorunhe.utils.SolrUtils;
import com.guorunhe.vo.Position;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrResponse;
import org.apache.solr.client.solrj.SolrServerException;  
import org.apache.solr.client.solrj.impl.HttpSolrClient;  
import org.apache.solr.client.solrj.response.QueryResponse;  
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;  
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;  
import org.springframework.transaction.annotation.Transactional;  
  
  
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;  
import java.util.Map;  
  
/**  
 * Created by BackZero on 2016/11/29 0029.  
 */  
@Service  
@Transactional  
public class SolrServiceImpl implements ISolrService {
	
    /**  
     * 简单查询  
     * @param mQueryStr  
     * @return query result  
     */  
    public SolrDocumentList query(String mQueryStr) {  
  
    	SolrDocumentList list = new SolrDocumentList();
        try {  
            HttpSolrClient httpSolrClient = SolrUtils.connect(SolrServiceImpl.url);  
            SolrQuery query = new SolrQuery();  
            //设定查询字段  
            query.setQuery(mQueryStr);  
            //指定返回结果字段  
//            query.set("fl","id,provinceName");  
            //覆盖schema.xml的defaultOperator（有空格时用"AND"还是用"OR"操作逻辑），一般默认指定。必须大写  
            query.set("q.op","AND");  
            query.set("fq", "education:高中");
            query.set("fq", "exper:*经验不限");
            //设定返回记录数，默认为10条  
            query.setRows(10);
            query.setHighlight(true); // 开启高亮组件或用query.setParam("hl", "true");  
            query.addHighlightField("workAddress");// 高亮字段  
            query.setHighlightSimplePre("<font color='red'>");//标记，高亮关键字前缀  
            query.setHighlightSimplePost("</font>");//后缀  
            QueryResponse response = httpSolrClient.query(query);  
            System.out.println(response.getResponse().get("highlighting"));
            list= response.getResults();  
        } catch (SolrServerException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        return  list;   
    }  
  
    /**  
     * 分页查询  
     * @param queryStr  
     * @param start  
     * @param rows  
     * @return SolrDocumentList  
     */  
    public SolrDocumentList queryPage(String queryStr,Integer start,Integer rows ){  
        try {  
            HttpSolrClient httpSolrClient = SolrUtils.connect(SolrServiceImpl.url);  
            SolrQuery query = new SolrQuery();  
            //设定查询字段  
            query.setQuery(queryStr);
            //指定返回结果字段  
            query.setIncludeScore(true);  
            // query.set("fl","id,name");  
            //覆盖schema.xml的defaultOperator（有空格时用"AND"还是用"OR"操作逻辑），一般默认指定。必须大写  
            query.set("q.op","AND");
            query.set("fq", "education:高中");
            //分页开始页数  
            query.setStart(start);  
            //设定返回记录数，默认为10条  
            query.setRows(rows);  
            //设定对查询结果是否高亮  
            query.setHighlight(true);  
            //设定高亮字段前置标签  
            query.setHighlightSimplePre("<span style=\"color:red\">");  
            //设定高亮字段后置标签  
            query.setHighlightSimplePost("</span>");  
            //设定高亮字段  
            query.addHighlightField("name");  
            //设定拼写检查  
            query.setRequestHandler("/spell");  
            QueryResponse response = httpSolrClient.query(query);  
           //获取bean  
           //  List<Object> bean = response.getBeans(Object.class);  
            SolrDocumentList list = response.getResults();  
            return  list;  
        } catch (SolrServerException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        return null;  
  
    }  
  
    /**  
     * 添加一个实体  
     *  
     * @param object  
     */  
    public void addBean(Object object) {  
        try {  
            HttpSolrClient httpSolrClient = SolrUtils.connect(SolrServiceImpl.url);  
            httpSolrClient.addBean(object);  
            httpSolrClient.commit();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } catch (SolrServerException e) {  
            e.printStackTrace();  
        }  
  
    }  
  
    /**  
     * 添加简单索引  
     *  
     * @param map  
     */  
    public void addDoc(Map<String, Object> map) {  
        try {  
            HttpSolrClient httpSolrClient = SolrUtils.connect(SolrServiceImpl.url);  
            SolrInputDocument document = new SolrInputDocument();  
            document = SolrUtils.addFileds(map,document);  
            UpdateResponse response = httpSolrClient.add(document);  
            httpSolrClient.commit();  
        } catch (SolrServerException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
  
    /**  
     * 删除索引  
     *  
     * @param id  
     */  
    public void deleteById(String id) {  
        try {  
            HttpSolrClient httpSolrClient = SolrUtils.connect(SolrServiceImpl.url);  
            httpSolrClient.deleteById(id);  
            httpSolrClient.commit();  
        } catch (SolrServerException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
  
    }
    
	/**
	 * 该方法是全文搜索接口.做主页的搜索功能.
	 * 
	 * @param String            QString  Solr的参数q的设置值.
	 * @param ArrayList<String> FqString Solr的参数fq的设置值.
	 * 
	 * return SolrResponse.
	 */
	@Override
	public QueryResponse search(String QString, ArrayList<String> FqString, int start, int pagesize) {
		QueryResponse response = new QueryResponse();
		try {
            HttpSolrClient httpSolrClient = SolrUtils.connect(SolrServiceImpl.url);
            SolrQuery query = new SolrQuery();
            //设定查询字段
            query.setQuery(QString);
            //指定返回结果字段
//            query.set("fl","id,provinceName");
            //覆盖schema.xml的defaultOperator（有空格时用"AND"还是用"OR"操作逻辑），一般默认指定。必须大写
            query.set("q.op","AND");
            for (String fq : FqString) {
            	query.set("fq", fq);
			}
            start = (start - 1) * pagesize;
            query.setStart(start);
            //设定返回记录数，默认为10条
            query.setRows(pagesize);
            query.setHighlight(true); // 开启高亮组件或用query.setParam("hl", "true");
            query.addHighlightField("companyName");// 高亮字段
            query.setHighlightSimplePre("<font color='red'>");//标记，高亮关键字前缀
            query.setHighlightSimplePost("</font>");//后缀
            response = httpSolrClient.query(query);
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return response;
	}
  
}  