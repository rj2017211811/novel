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
public class HomeController {
	@Resource
	private NovelsortService novelsortService;
	@Resource
	private NovelService novelService;
	
	@RequestMapping("/home")
	public String goHome(Model model)
	{
		Map<String,Object> map=new HashMap<String,Object>();
		 map.put("num", 10);
    	 map.put("order", "order");
    	 map.put("orderBy", "novel.id");
    	 map.put("ordered", "desc");
		List<Novel> novelLatestList=novelService.searchNovel(map);
		
		Map<String,Object> map1=new HashMap<String,Object>();
		 map1.put("num", 4);
   	     map1.put("order", "order");
   	    map1.put("orderBy", "novel.id");
   	     map1.put("ordered", "desc");
		List<Novel> novelrecommendList=novelService.searchNovel(map1);
		
		
		Map<String,Object> map2=new HashMap<String,Object>();
		map2.put("name", "都市");
		map2.put("num", 6);
		List<Novel> cityNovelList=novelService.searchNovel(map2);
		
		Map<String,Object> map3=new HashMap<String,Object>();
		map3.put("name", "修真");
		map3.put("num", 6);
		List<Novel> xiuzhenNovelList=novelService.searchNovel(map3);
		
		Map<String,Object> map4=new HashMap<String,Object>();
		map4.put("name", "玄幻");
		map4.put("num", 6);
		List<Novel> xuanhuanNovelList=novelService.searchNovel(map4);
		
		Map<String,Object> map5=new HashMap<String,Object>();
		map5.put("name", "武侠");
		map5.put("num", 6);
		List<Novel> wuxiaNovelList=novelService.searchNovel(map5);
		
		Map<String,Object> map6=new HashMap<String,Object>();
		map6.put("name", "网游");
		map6.put("num", 6);
		List<Novel> wangyouNovelList=novelService.searchNovel(map6);
		Map<String,Object> map7=new HashMap<String,Object>();
		map7.put("name", "科幻");
		map7.put("num", 6);
		List<Novel> kehuanNovelList=novelService.searchNovel(map7);
		
		Map<String,Object> map8=new HashMap<String,Object>();
		map8.put("name", "穿越");
		map8.put("num", 6);
		List<Novel> chuanyueNovelList=novelService.searchNovel(map8);
		
		
		
		model.addAttribute("novelrecommendList", novelrecommendList);
		model.addAttribute("novelLatestList", novelLatestList);
		model.addAttribute("cityNovelList", cityNovelList);
		model.addAttribute("xiuzhenNovelList", xiuzhenNovelList);
		model.addAttribute("xuanhuanNovelList", xuanhuanNovelList);
		model.addAttribute("wuxiaNovelList", wuxiaNovelList);
		model.addAttribute("wangyouNovelList", wangyouNovelList);
		model.addAttribute("kehuanNovelList", kehuanNovelList);
		model.addAttribute("chuanyueNovelList", chuanyueNovelList);
		
		
		return "index";
	}
}
