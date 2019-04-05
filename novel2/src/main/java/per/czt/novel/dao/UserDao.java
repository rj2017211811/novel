package per.czt.novel.dao;

import java.util.List;
import java.util.Map;

import per.czt.novel.domain.User;

public interface UserDao {
	public List<User> searchUser(Map  map);
	public int updateUser(Map map);
}
