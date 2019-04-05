package per.czt.novel.dao;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import per.czt.novel.domain.User;

@Repository("userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public List<User> searchUser(Map map) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("per.czt.novel.domain.searchUser2", map);
	}

	@Override
	public int updateUser(Map map) {
		SqlSession session=this.getSqlSession();
		// TODO Auto-generated method stub
		int flag=session.update("per.czt.novel.domain.updateUser", map);
		System.out.println("flag:"+flag);
		
		return flag;
	}
	
	
	

}
