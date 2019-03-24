package per.czt.novel.service;

import java.util.List;
import java.util.Map;

import per.czt.novel.domain.Novel;

public interface NovelService {
	public List<Novel> searchNovel(Map map);
	public int addNovel(Novel n);
	public int deleteNovel(Novel n);
	public int updateNovel(Novel n);
	public Novel setectOneNovel(Map map);
}
