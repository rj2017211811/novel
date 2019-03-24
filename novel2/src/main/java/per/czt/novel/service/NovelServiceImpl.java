package per.czt.novel.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import per.czt.novel.dao.NovelDao;
import per.czt.novel.domain.Novel;
@Service("novelServicce")
public class NovelServiceImpl implements NovelService {
	
	@Resource
	private NovelDao novelDao;
	

	public NovelDao getNovelDao() {
		return novelDao;
	}


	public void setNovelDao(NovelDao novelDao) {
		this.novelDao = novelDao;
	}


	@Override
	public List<Novel> searchNovel(Map map) {
		// TODO Auto-generated method stub
		return novelDao.searchNovel(map);
	}


	@Override
	public int addNovel(Novel n) {
	
		return novelDao.addNovel(n);
	}


	@Override
	public int deleteNovel(Novel n) {
		// TODO Auto-generated method stub
		return novelDao.deleteNovel(n);
	}


	@Override
	public int updateNovel(Novel n) {
		
		return novelDao.updateNovel(n);
	}


	@Override
	public Novel setectOneNovel(Map map) {
		// TODO Auto-generated method stub
		return novelDao.setectOneNovel(map);
	}


	
}
