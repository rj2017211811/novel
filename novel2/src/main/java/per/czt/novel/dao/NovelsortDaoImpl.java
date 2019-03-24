package per.czt.novel.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import per.czt.novel.domain.Novel;
import per.czt.novel.domain.Novelsort;
@Repository("novelsortDao")
public class NovelsortDaoImpl extends SqlSessionDaoSupport implements NovelsortDao {
	
	

	@Override
	public int addNovelsort(Novelsort novelsort) {
		
		return this.getSqlSession().insert("per.czt.novel.domain.insertNovelsort", novelsort);
	}

	@Override
	public List<Novelsort> searchNovelsort(Map map) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("per.czt.novel.domain.searchNovelsort", map);
	}

	@Override
	public Novelsort getNovelsort(Map map) {
		// TODO Auto-generated method stub
		return (Novelsort) this.getSqlSession().selectOne("per.czt.novel.domain.getNovelsort", map);
	}

	

	

}
