package per.czt.novel.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import per.czt.novel.domain.Novel;
import per.czt.novel.service.NovelService;
import per.czt.novel.service.NovelsortService;

@Controller
public class NovelController {

	@Resource
	private NovelsortService novelsortService;
	@Resource
	private NovelService novelService;

	@RequestMapping("/dushi")
	public String godushiNovel(Model model) {
		Map<String, Object> map = new HashMap();
		map.put("num", 10);

		// map.put("orderBy", "title");
		map.put("ordered", "desc");
		map.put("name", "都市");
		List<Novel> novelLatestList = novelService.searchNovel(map);
		
	
		Map<String, Object> map1 = new HashMap();
		map1.put("num", 6);

		// map.put("orderBy", "title");
		map1.put("ordered", "desc");
		map1.put("name", "都市");
		
		

		List<Novel> 	novelrecommendList = novelService.searchNovel(map1);
		model.addAttribute("novelLatestList",novelLatestList);
		
		model.addAttribute("novelrecommendList",novelrecommendList);
		model.addAttribute("type","都市");
		return "novel";
	}

	@RequestMapping("/xuanhuan")
	public String goxuanhuanNovel(Model model) {
		Map<String, Object> map = new HashMap();
		map.put("num", 10);

		// map.put("orderBy", "title");
		map.put("ordered", "desc");
		map.put("name", "玄幻");
		
		

		List<Novel> novelLatestList = novelService.searchNovel(map);
		
	
		Map<String, Object> map1 = new HashMap();
		map1.put("num", 6);

		// map.put("orderBy", "title");
		map1.put("ordered", "desc");
		map1.put("name", "玄幻");
		
		

		List<Novel> 	novelrecommendList = novelService.searchNovel(map1);
		model.addAttribute("novelLatestList",novelLatestList);
		
		model.addAttribute("novelrecommendList",novelrecommendList);
		model.addAttribute("type","玄幻");
		return "novel";
	}

	@RequestMapping("/xiuzhen")
	public String goxiuzhenNovel(Model model) {
		Map<String, Object> map = new HashMap();
		map.put("num", 10);

		// map.put("orderBy", "title");
		map.put("ordered", "desc");
		map.put("name", "修真");

		List<Novel> novelLatestList = novelService.searchNovel(map);
		
	
		Map<String, Object> map1 = new HashMap();
		map1.put("num", 6);

		// map.put("orderBy", "title");
		map1.put("ordered", "desc");
		map1.put("name", "修真");
		
		

		List<Novel> 	novelrecommendList = novelService.searchNovel(map1);
		model.addAttribute("novelLatestList",novelLatestList);
		
		model.addAttribute("novelrecommendList",novelrecommendList);
		model.addAttribute("type","修真");
		return "novel";
	}

	@RequestMapping("/chuanyue")
	public String gochuanyueNovel(Model model) {
		Map<String, Object> map = new HashMap();
		map.put("num", 10);

		// map.put("orderBy", "title");
		map.put("ordered", "desc");
		map.put("name", "穿越");
		
		

		List<Novel> novelLatestList = novelService.searchNovel(map);
		
	
		Map<String, Object> map1 = new HashMap();
		map1.put("num", 6);

		// map.put("orderBy", "title");
		map1.put("ordered", "desc");
		map1.put("name", "穿越");
		
		

		List<Novel> 	novelrecommendList = novelService.searchNovel(map1);
		model.addAttribute("novelLatestList",novelLatestList);
		
		model.addAttribute("novelrecommendList",novelrecommendList);
		model.addAttribute("type","穿越");
		return "novel";
	}

	@RequestMapping("/wangyou")
	public String gowangyouNovel(Model model) {
		Map<String, Object> map = new HashMap();
		map.put("num", 10);

		// map.put("orderBy", "title");
		map.put("ordered", "desc");
		map.put("name", "网游");
		
		

		List<Novel> novelLatestList = novelService.searchNovel(map);
		
	
		Map<String, Object> map1 = new HashMap();
		map1.put("num", 6);

		// map.put("orderBy", "title");
		map1.put("ordered", "desc");
		map1.put("name", "网游");
		
		

		List<Novel> 	novelrecommendList = novelService.searchNovel(map1);
		model.addAttribute("novelLatestList",novelLatestList);
		
		model.addAttribute("novelrecommendList",novelrecommendList);
		model.addAttribute("type","网游");
		return "novel";
	}

	@RequestMapping("/kehuan")
	public String gokehuanNovel(Model model) {
		Map<String, Object> map = new HashMap();
		map.put("num", 10);

		// map.put("orderBy", "title");
		map.put("ordered", "desc");
		map.put("name", "科幻");
		
		

		List<Novel> novelLatestList = novelService.searchNovel(map);
		
	
		Map<String, Object> map1 = new HashMap();
		map1.put("num", 6);

		// map.put("orderBy", "title");
		map1.put("ordered", "desc");
		map1.put("name", "科幻");
		
		

		List<Novel> 	novelrecommendList = novelService.searchNovel(map1);
		model.addAttribute("novelLatestList",novelLatestList);
		
		model.addAttribute("novelrecommendList",novelrecommendList);
		model.addAttribute("type","科幻");
		return "novel";
	}
	
	@RequestMapping("/allnovel")
	public String allNovel(Model model)
	{
		Map<String, Object> map = new HashMap();
		map.put("orderBy", "ns_id");


		List<Novel> 	allNovelList = novelService.searchNovel(map);
		
		System.out.println("allNovelList.size():"+allNovelList.size());
		for(Novel n:allNovelList)
		{
			System.out.println("id:"+n.getId());
			System.out.println("title:"+n.getTitle());
			System.out.println("type:"+n.getNovelsort().getName());
		}
		model.addAttribute("allNovelList",allNovelList);
		model.addAttribute("type","全部小说");
	
		
		return "allNovel";
	}
}
