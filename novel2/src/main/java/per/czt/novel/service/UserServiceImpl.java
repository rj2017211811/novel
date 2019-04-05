package per.czt.novel.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import per.czt.novel.dao.UserDao;
import per.czt.novel.domain.User;

@Repository("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> searchUser(Map map) {
		// TODO Auto-generated method stub
		return userDao.searchUser(map);
	}

	@Override
	public int updateUser(Map map) {
		// TODO Auto-generated method stub
		return userDao.updateUser(map);
	}
	

}
