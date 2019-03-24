package per.czt.novel.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import per.czt.novel.dao.NovelsortDao;
import per.czt.novel.domain.Novel;
import per.czt.novel.domain.Novelsort;
@Service("novelsortService")
public class NovelsortServiceImpl implements NovelsortService {

	@Resource
	private NovelsortDao novelsortDao;
	
	public NovelsortDao getNovelsortDao() {
		return novelsortDao;
	}

	public void setNovelsortDao(NovelsortDao novelsortDao) {
		this.novelsortDao = novelsortDao;
	}

	

	@Override
	public int addNovelsort(Novelsort novelsort) {
		
		return novelsortDao.addNovelsort(novelsort);
	}

	@Override
	public List<Novelsort> searchNovelsort(Map map) {
		// TODO Auto-generated method stub
		return novelsortDao.searchNovelsort(map);
	}

	@Override
	public Novelsort getNovelsort(Map map) {
		// TODO Auto-generated method stub
		return novelsortDao.getNovelsort(map);
	}

}
