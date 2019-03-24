package per.czt.novel.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import per.czt.novel.domain.Novel;
import per.czt.novel.domain.Novelsort;
import per.czt.novel.service.NovelService;
import per.czt.novel.service.NovelsortService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Resource
	private NovelsortService novelsortService;
	@Resource
	private NovelService novelService;

	@RequestMapping("/toaddNovelsort")
	public String toaddNovelsort() {
		return "admin/novelsortAdd";

	}

	@RequestMapping(value = "/addNovelsort", method = RequestMethod.POST)
	public String addNovelsort(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		System.out.println("name:" + name);

		Novelsort novelsort = new Novelsort();
		novelsort.setName(name);
		novelsort.setPublishDate(new java.util.Date());
		int flag = 0;
		try {
			flag = novelsortService.addNovelsort(novelsort);
			if (flag == 1) {
				model.addAttribute("tipMessage", "添加成功!");
			}
		} catch (Exception e) {
			model.addAttribute("tipMessage", "该类型已经存在，请勿重复添加!");

		}

		return "admin/novelsortAdd";

	}

	@RequestMapping("/toaddNovel")
	public String toaddNovel(Model model) {
		Map<String, Object> map = new HashMap();

		List<Novelsort> novelsortList = novelsortService.searchNovelsort(map);

		model.addAttribute("novelsortList", novelsortList);

		return "admin/novelAdd";

	}

	@RequestMapping(value = "/addNovel", method = RequestMethod.POST)
	public String addNovel(HttpServletRequest request, Model model) {
		Novel novel = new Novel();
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		System.out.println("title:" + title);
		System.out.println("author:" + author);
		Integer id = Integer.parseInt(request.getParameter("novelsort"));

		Novelsort novelsort = new Novelsort();
		Map<String, Object> map = new HashMap();
		map.put("id", id);
		novelsort = novelsortService.getNovelsort(map);
		System.out.println("novelsort:" + novelsort.getName());
		novel.setAuthor(author);
		novel.setTitle(title);

		novel.setNovelsort(novelsort);
		novel.setPublishDate(new java.util.Date());

		int flag = 0;

		try {
			flag = novelService.addNovel(novel);
			if (flag == 1) {
				model.addAttribute("tipMessage", "添加成功!");
			}
		} catch (Exception e) {

			model.addAttribute("tipMessage", "该书籍已经存在，请勿重复添加!");

		}

		return "admin/novelAdd";

	}

	@RequestMapping("/delNovel")
	public String delNovel(Integer id,Model model) {
		Novel novel = new Novel();
		novel.setId(id);

		int flag = novelService.deleteNovel(novel);
		if (flag == 1) {
			System.out.println("删除成功!");
			model.addAttribute("tipMessage", "删除成功!");

		} else {
			System.out.println("删除失败!");
			model.addAttribute("tipMessage", "删除失败，该书籍不存在!");
		}

		return "redirect:/admin/tomanageNovel";
	}

	@RequestMapping("/toupdateNovel")
	public String toupdateNovel(Model model,Integer id,HttpServletRequest request) {
		
		

		List<Novelsort> novelsortList = novelsortService.searchNovelsort(null);

		model.addAttribute("novelsortList", novelsortList);
		
		Map<String, Object> map = new HashMap();
		map.put("n_id",id);
		Novel novel=new Novel();
		novel=novelService.setectOneNovel(map);
		model.addAttribute("novel", novel);
		return "admin/novelUpdate";
	}
	
	@RequestMapping(value= {"/updateNovel"},method=RequestMethod.POST )
	public String updateNovel(Model model,HttpServletRequest request) {
		Novel novel=new Novel();
		Integer id=Integer.parseInt(request.getParameter("id"));
		String title=request.getParameter("title");
		String author=request.getParameter("author");
		String strNovelsortId=request.getParameter("novelsort");
		
		Integer novelsortId=Integer.parseInt(strNovelsortId);
		System.out.println("novelsort:"+novelsortId);
		System.out.println("title:"+title);
		System.out.println("author:"+author);
		novel.setId(id);
		novel.setAuthor(author);
		novel.setTitle(title);
		Map<String,Object> map=new HashMap();
		map.put("id", novelsortId);
	
		Novelsort novelsort=new Novelsort();
		novelsort=novelsortService.getNovelsort(map);
		novel.setNovelsort(novelsort);
		//System.out.println("novelsort:"+novelsort.getName());
		System.out.println("novelsort2:"+novelsort.getId());
		
		int flag=0;
		try
		{
			flag=novelService.updateNovel(novel);
			if(flag==1)
			{
				System.out.println("更新成功");
				model.addAttribute("tipMessage","修改成功");
			}
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			model.addAttribute("tipMessage","修改失败");
		}
		
		return "redirect:/admin/tomanageNovel";
	}

	@RequestMapping("/tomanageNovel")
	public String tomanageNovel(Model model,HttpServletRequest request) {
		String tipMessage=request.getParameter("tipMessage");
		if(tipMessage!=null)
		{
			model.addAttribute("tipMessage",tipMessage);
		}
		
		Map<String, Object> map = new HashMap();
		map.put("orderBy", "ns_id");

		List<Novel> allNovelList = novelService.searchNovel(map);

	//	System.out.println("allNovelList.size():" + allNovelList.size());
		model.addAttribute("allNovelList", allNovelList);
		model.addAttribute("type", "全部小说");

		return "admin/novelManage";
	}

	@RequestMapping("/tomanageNovelsort")
	public String tomanageNovelsort(Model model) {
		Map<String, Object> map = new HashMap();

		List<Novelsort> allNovelsortList = novelsortService.searchNovelsort(map);

		System.out.println("allNovelsortList.size():" + allNovelsortList.size());
		model.addAttribute("allNovelsortList", allNovelsortList);
		model.addAttribute("type", "全部小说");

		return "admin/novelsortManage";
	}

	@RequestMapping("/tomanageWriter")
	public String tomanageWriter(Model model) {

		return "admin/writerManage";

	}

	@RequestMapping("/tomanageReader")
	public String tomanageReader(Model model) {

		return "admin/readerManage";
	}

}
