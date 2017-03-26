package com.guorunhe.vo;

import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

public class Position {

	/**
	 *"companyScale":"150-500人",
        "education":" 本科及以上 ",
        "postType":"全职",
        "advantage":"扁平化,福利",
        "companyName":"马上游市场部招聘",
        "description":"工作职责： 1、对为政府和景区进行的全域旅游策划方案负责； 2、整体把控策划方案的宣讲和沟通效果； 3、准确把握公司的品牌定位，将品牌策划及品牌体系建设融入全域旅游策划方案； 4、结合全域旅游各案配合各目的地营销，提供策略依据； 5、监督全域旅游各案广告和市场活动的总体预算，严控各案营销预算的使用情况； 6、准确把控全域旅游策划方案的执行情况，带领市场团队确保公司策划营销指标的达成； 7、对公司全域旅游各案进行总体总结、评估、调整； 8、定期对同业公司的营销环境、目标、计划、业务活动进行核查分析。 任职要求： 1、本科及以上学历； 2、五年以上的市场相关工作经验，三年以上的团队管理经验， 3、有旅游行业公关传播全案服务和项目执行经验者优先； 4、具备良好的沟通与组织协调能力； 5、较强的市场分析能力和应变能力； 6、具备正直坦诚、客户增值、追求卓越、清晰思考等核心素质； 7、精通营销模式，对各类活动营销、策划具有全方位的把控能力。",
        "companyField":"电子商务,旅游",
        "companyUrl":"http://www.msy.cn",
        "salary":"20k-40k",
        "title":"市场公关总监招聘-马上游招聘",
        "exper":"经验5-10年",
        "workAddress":"北京",
        "url":"https://www.lagou.com/jobs/2781224.html",
        "positionLng":"116.447968",
        "companyDevelStage":"A轮",
        "positionAddress":"太阳宫中路12号冠城大厦302室",
        "name":"市场公关总监",
        "positionLat":"39.970887",
        "id":"1",
        "techType":"市场",
	 */
	
	
	/**
	 * 职位类
	 */
	private int id;
	private String url;
	private String companyScale;
	private String education;
	private String postType;
	private String advantage;
	private String companyName;
	private String description;
	private String companyField;
	private String companyUrl;
	private String salary;
	private String title;
	private String exper;
	private String workAddress;
	private String positionLng;
	private String positionLat;
	private String companyDevelStage;
	private String positionAddress;
	private String name;
	private String techType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCompanyScale() {
		return companyScale;
	}
	public void setCompanyScale(String companyScale) {
		this.companyScale = companyScale;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getPostType() {
		return postType;
	}
	public void setPostType(String postType) {
		this.postType = postType;
	}
	public String getAdvantage() {
		return advantage;
	}
	public void setAdvantage(String advantage) {
		this.advantage = advantage;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCompanyField() {
		return companyField;
	}
	public void setCompanyField(String companyField) {
		this.companyField = companyField;
	}
	public String getCompanyUrl() {
		return companyUrl;
	}
	public void setCompanyUrl(String companyUrl) {
		this.companyUrl = companyUrl;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getExper() {
		return exper;
	}
	public void setExper(String exper) {
		this.exper = exper;
	}
	public String getWorkAddress() {
		return workAddress;
	}
	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}
	public String getPositionLng() {
		return positionLng;
	}
	public void setPositionLng(String positionLng) {
		this.positionLng = positionLng;
	}
	public String getPositionLat() {
		return positionLat;
	}
	public void setPositionLat(String positionLat) {
		this.positionLat = positionLat;
	}
	public String getCompanyDevelStage() {
		return companyDevelStage;
	}
	public void setCompanyDevelStage(String companyDevelStage) {
		this.companyDevelStage = companyDevelStage;
	}
	public String getPositionAddress() {
		return positionAddress;
	}
	public void setPositionAddress(String positionAddress) {
		this.positionAddress = positionAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechType() {
		return techType;
	}
	public void setTechType(String techType) {
		this.techType = techType;
	}
	
	
	public Position SolrListToPosition(SolrDocument solrDocument){
		this.advantage = solrDocument.get("advantage").toString();
		this.companyDevelStage = solrDocument.get("companyDevelStage").toString();
		this.companyField = solrDocument.get("companyField").toString();
		this.companyName = solrDocument.get("companyName").toString();
		this.companyScale = solrDocument.get("companyScale").toString();
		this.companyUrl = solrDocument.get("companyUrl").toString();
		this.description = solrDocument.get("description").toString();
		this.education = solrDocument.get("education").toString();
		this.exper = solrDocument.get("exper").toString();
		this.id = Integer.parseInt(solrDocument.get("id").toString());
		this.name = solrDocument.get("name").toString();
		this.positionAddress = solrDocument.get("positionAddress").toString();
		this.positionLat = solrDocument.get("positionLat").toString();
		this.positionLng = solrDocument.get("positionLng").toString();
		this.postType = solrDocument.get("postType").toString();
		this.salary = solrDocument.get("salary").toString();
		this.techType = solrDocument.get("techType").toString();
		this.title = solrDocument.get("title").toString();
		this.url = solrDocument.get("url").toString();
		this.workAddress = solrDocument.get("workAddress").toString();
		return this;
		
	}
	@Override
	public String toString() {
		return "Position [id=" + id + ", url=" + url + ", companyScale=" + companyScale + ", education=" + education
				+ ", postType=" + postType + ", advantage=" + advantage + ", companyName=" + companyName
				+ ", description=" + description + ", companyField=" + companyField + ", companyUrl=" + companyUrl
				+ ", salary=" + salary + ", title=" + title + ", exper=" + exper + ", workAddress=" + workAddress
				+ ", positionLng=" + positionLng + ", positionLat=" + positionLat + ", companyDevelStage="
				+ companyDevelStage + ", positionAddress=" + positionAddress + ", name=" + name + ", techType="
				+ techType + "]";
	}
	
	
}
