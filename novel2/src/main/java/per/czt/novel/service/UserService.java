package per.czt.novel.service;

import java.util.List;
import java.util.Map;

import per.czt.novel.domain.User;

public interface UserService {
	public List<User> searchUser(Map map);
	public int updateUser(Map map) ;

}
