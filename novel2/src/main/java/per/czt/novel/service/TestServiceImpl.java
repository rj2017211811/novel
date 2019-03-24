package per.czt.novel.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import per.czt.novel.dao.TestDao;
import per.czt.novel.domain.Test;

@Service("testService")
public class TestServiceImpl  implements TestService{
	@Resource(name="testDao")
	private TestDao testDao;
	
	public TestDao getTestDao() {
		return testDao;
	}

	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}

	@Override
	public List<Test> listAll() {
	
		return testDao.listAll();
	}

}
