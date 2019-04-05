package per.czt.novel.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import per.czt.novel.dao.MessageDao;
import per.czt.novel.domain.Message;

@Repository("messageService")
public class MessageServiceImpl implements MessageService {
	@Resource
	private MessageDao messageDao;

	public MessageDao getMessageDao() {
		return messageDao;
	}

	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}

	@Override
	public int insertMessage(Message m)  {
		// TODO Auto-generated method stub
		return messageDao.insertMessage(m);
	}

	@Override
	public List<Message> searchMessage(Map map) {
		// TODO Auto-generated method stub
		return messageDao.searchMessage(map);
	}
	

}
