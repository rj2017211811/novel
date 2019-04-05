package per.czt.novel.service;

import java.util.List;
import java.util.Map;

import per.czt.novel.domain.Message;

public interface MessageService {
	public int insertMessage(Message m) ;
	public List<Message> searchMessage(Map map);
}
