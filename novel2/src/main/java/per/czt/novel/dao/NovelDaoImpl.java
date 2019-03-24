package per.czt.novel.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import per.czt.novel.domain.Novel;
@Repository("novelDao")
public class NovelDaoImpl extends SqlSessionDaoSupport implements NovelDao {
	
	
	
	@Override
	public List<Novel> searchNovel(Map map) {
		// TODO Auto-generated method stub
		return  this.getSqlSession().selectList("per.czt.novel.domain.searchNovel", map);
	}
	

	@Override
	public int addNovel(Novel n) {
	
		return this.getSqlSession().insert("per.czt.novel.domain.insertNovel", n);
	}

	@Override
	public int deleteNovel(Novel n) {
		// TODO Auto-generated method stub
		return this.getSqlSession().delete("per.czt.novel.domain.deleteNovel", n);
	}

	@Override
	public int updateNovel(Novel n) {
		// TODO Auto-generated method stub
		return this.getSqlSession().update("per.czt.novel.domain.updateNovel", n);
	}


	@Override
	public Novel setectOneNovel(Map map) {
		// TODO Auto-generated method stub
		return (Novel) this.getSqlSession().selectOne("per.czt.novel.domain.searchNovel", map);
		
	}

}
