package per.czt.novel.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import per.czt.novel.domain.Test;
@Repository("testDao")
public class TestDaoImpl extends SqlSessionDaoSupport implements TestDao {
	

	@Override
	public List<Test> listAll() {
		
		return this.getSqlSession().selectList("per.czt.novel.domain.Test.search", null);
	}

}
