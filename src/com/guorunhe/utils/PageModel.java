package com.guorunhe.utils;
import java.util.List;

/**
 * 分页的通用模型
 * 
 * @author Lanqiao08
 *
 */
public class PageModel<T> {
	private String cpage;
	private String pageSize;;
	private String rows;
	private int totalpage;
	private int beginIndex;
	private int endIndex;
	
	private List<T> list;//新实体类不需要这个

	public void setCpage(String cpage) {
		this.cpage = cpage;
	}

	/**
	 * 获取当前页数
	 * 
	 * @return
	 */
	public int getCpage() {
		int _cpage = 1;
		if (cpage != null) {
			try {
				_cpage = Integer.parseInt(cpage);
			} catch (Exception ex) {
			}

		}
		return _cpage;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * 每页多少条
	 * 
	 * @return
	 */
	public int getPageSize() {
		int _pageSize = 5;
		if (pageSize != null) {
			try {
				_pageSize = Integer.parseInt(pageSize);
			} catch (Exception ex) {
			}

		}
		return _pageSize;
	}

	/**
	 * 获取当前页数
	 * 
	 * @return
	 */
	public int getBeginIndex() {
		int _beginIndex = (getCpage() - 1) * getPageSize();
		return _beginIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public List<T> getList() {
		return list;
	}

	/**
	 * 获取总条数
	 * 
	 * @return
	 */
	public int getRows() {
		int _rows = 0;
		if (rows != null) {
			try {
				_rows = Integer.parseInt(rows);
			} catch (Exception ex) {
			}
		}
		return _rows;
	}

	/**
	 * 共多少页
	 * 
	 * @return
	 */
	public int getTotalpage() {
		// 得到总条数
		int _totalpage = 0;
		int rows = getRows();
		int pagesize = getPageSize();
		if (rows % pagesize == 0) {
			_totalpage = rows / pagesize;
		} else {
			_totalpage = rows / pagesize + 1;
		}
		return _totalpage;
	}

	public void setBeginIndex(int beginIndex) {
		this.beginIndex = beginIndex;
	}

	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public void setRows(String rows) {
		this.rows = rows;
	}

	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}

}
