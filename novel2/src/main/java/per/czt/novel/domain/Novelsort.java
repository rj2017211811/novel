package per.czt.novel.domain;

import java.util.List;

public class Novelsort {
	private Integer id;
	private String name;
	private List<Novel> novels;
	private java.util.Date publishDate;
	private Integer count;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Novel> getNovels() {
		return novels;
	}
	public void setNovels(List<Novel> novels) {
		this.novels = novels;
	}
	public java.util.Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(java.util.Date publishDate) {
		this.publishDate = publishDate;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	
	
}
