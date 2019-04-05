package per.czt.novel.domain;

public class Message {
	private Integer id;
	private User sender;
	private Integer getterId;


	private String content;
	private java.util.Date sendDate;
	private Boolean isGet;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public java.util.Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(java.util.Date sendDate) {
		this.sendDate = sendDate;
	}
	public Boolean getIsGet() {
		return isGet;
	}
	public void setIsGet(Boolean isGet) {
		this.isGet = isGet;
	}
	public User getSender() {
		return sender;
	}
	public void setSender(User sender) {
		this.sender = sender;
	}
	public Integer getGetterId() {
		return getterId;
	}
	public void setGetterId(Integer getterId) {
		this.getterId = getterId;
	}
	

	

}
