package per.czt.novel.dao;

import java.util.List;
import java.util.Map;

import per.czt.novel.domain.Message;

public interface MessageDao {
	public int insertMessage(Message m);
	public List<Message> searchMessage(Map map);

}
