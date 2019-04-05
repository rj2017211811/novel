package per.czt.novel.dao;

import java.util.List;
import java.util.Map;

import per.czt.novel.domain.Novel;


public interface NovelDao {
	
	public List<Novel> searchNovel(Map map);
	public Novel setectOneNovel(Map map);
	public int addNovel(Novel n);
	public int deleteNovel(Novel n);
	public int updateNovel(Novel n);
	public int getPageCount(Map map,int pageSize);
	
}
