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
		map.put("name", "����");
		List<Novel> novelLatestList = novelService.searchNovel(map);
		
	
		Map<String, Object> map1 = new HashMap();
		map1.put("num", 6);

		// map.put("orderBy", "title");
		map1.put("ordered", "desc");
		map1.put("name", "����");
		
		

		List<Novel> 	novelrecommendList = novelService.searchNovel(map1);
		model.addAttribute("novelLatestList",novelLatestList);
		
		model.addAttribute("novelrecommendList",novelrecommendList);
		model.addAttribute("type","����");
		return "novel";
	}

	@RequestMapping("/xuanhuan")
	public String goxuanhuanNovel(Model model) {
		Map<String, Object> map = new HashMap();
		map.put("num", 10);

		// map.put("orderBy", "title");
		map.put("ordered", "desc");
		map.put("name", "����");
		
		

		List<Novel> novelLatestList = novelService.searchNovel(map);
		
	
		Map<String, Object> map1 = new HashMap();
		map1.put("num", 6);

		// map.put("orderBy", "title");
		map1.put("ordered", "desc");
		map1.put("name", "����");
		
		

		List<Novel> 	novelrecommendList = novelService.searchNovel(map1);
		model.addAttribute("novelLatestList",novelLatestList);
		
		model.addAttribute("novelrecommendList",novelrecommendList);
		model.addAttribute("type","����");
		return "novel";
	}

	@RequestMapping("/xiuzhen")
	public String goxiuzhenNovel(Model model) {
		Map<String, Object> map = new HashMap();
		map.put("num", 10);

		// map.put("orderBy", "title");
		map.put("ordered", "desc");
		map.put("name", "����");

		List<Novel> novelLatestList = novelService.searchNovel(map);
		
	
		Map<String, Object> map1 = new HashMap();
		map1.put("num", 6);

		// map.put("orderBy", "title");
		map1.put("ordered", "desc");
		map1.put("name", "����");
		
		

		List<Novel> 	novelrecommendList = novelService.searchNovel(map1);
		model.addAttribute("novelLatestList",novelLatestList);
		
		model.addAttribute("novelrecommendList",novelrecommendList);
		model.addAttribute("type","����");
		return "novel";
	}

	@RequestMapping("/chuanyue")
	public String gochuanyueNovel(Model model) {
		Map<String, Object> map = new HashMap();
		map.put("num", 10);

		// map.put("orderBy", "title");
		map.put("ordered", "desc");
		map.put("name", "��Խ");
		
		

		List<Novel> novelLatestList = novelService.searchNovel(map);
		
	
		Map<String, Object> map1 = new HashMap();
		map1.put("num", 6);

		// map.put("orderBy", "title");
		map1.put("ordered", "desc");
		map1.put("name", "��Խ");
		
		

		List<Novel> 	novelrecommendList = novelService.searchNovel(map1);
		model.addAttribute("novelLatestList",novelLatestList);
		
		model.addAttribute("novelrecommendList",novelrecommendList);
		model.addAttribute("type","��Խ");
		return "novel";
	}

	@RequestMapping("/wangyou")
	public String gowangyouNovel(Model model) {
		Map<String, Object> map = new HashMap();
		map.put("num", 10);

		// map.put("orderBy", "title");
		map.put("ordered", "desc");
		map.put("name", "����");
		
		

		List<Novel> novelLatestList = novelService.searchNovel(map);
		
	
		Map<String, Object> map1 = new HashMap();
		map1.put("num", 6);

		// map.put("orderBy", "title");
		map1.put("ordered", "desc");
		map1.put("name", "����");
		
		

		List<Novel> 	novelrecommendList = novelService.searchNovel(map1);
		model.addAttribute("novelLatestList",novelLatestList);
		
		model.addAttribute("novelrecommendList",novelrecommendList);
		model.addAttribute("type","����");
		return "novel";
	}

	@RequestMapping("/kehuan")
	public String gokehuanNovel(Model model) {
		Map<String, Object> map = new HashMap();
		map.put("num", 10);

		// map.put("orderBy", "title");
		map.put("ordered", "desc");
		map.put("name", "�ƻ�");
		
		

		List<Novel> novelLatestList = novelService.searchNovel(map);
		
	
		Map<String, Object> map1 = new HashMap();
		map1.put("num", 6);

		// map.put("orderBy", "title");
		map1.put("ordered", "desc");
		map1.put("name", "�ƻ�");
		
		

		List<Novel> 	novelrecommendList = novelService.searchNovel(map1);
		model.addAttribute("novelLatestList",novelLatestList);
		
		model.addAttribute("novelrecommendList",novelrecommendList);
		model.addAttribute("type","�ƻ�");
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
		model.addAttribute("type","ȫ��С˵");
	
		
		return "allNovel";
	}
}
