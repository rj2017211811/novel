package per.czt.novel.dao;

import java.util.List;
import java.util.Map;

import per.czt.novel.domain.Novel;
import per.czt.novel.domain.Novelsort;

public interface NovelsortDao {
	public List<Novelsort> searchNovelsort(Map map);
	public int addNovelsort(Novelsort novelsort);
	public Novelsort getNovelsort(Map map);
	
}
