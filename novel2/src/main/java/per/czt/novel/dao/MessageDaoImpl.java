package per.czt.novel.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import per.czt.novel.domain.Message;
@Repository("messageDao")
public class MessageDaoImpl extends SqlSessionDaoSupport  implements MessageDao{

	
	@Override
	public int insertMessage(Message m) {
		// TODO Auto-generated method stub
		return this.getSqlSession().insert("per.czt.novel.domain.insertMessage", m);
	}

	@Override
	public List<Message> searchMessage(Map map) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("per.czt.novel.domain.searchMessage", map);
	}

}
