package per.czt.novel.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import per.czt.novel.domain.Novel;
import per.czt.novel.domain.Novelsort;
import per.czt.novel.service.NovelService;
import per.czt.novel.service.NovelsortService;

public class TestMybatis1 {
	public static void searchNovel()
	{
		 ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
    	 NovelService novelService=(NovelService) ac.getBean("novelService");
    	 Map<String,Object> map=new HashMap();
 		
    	 map.put("num", 4);
    	 
    	 //map.put("orderBy", "title");
    	 map.put("ordered", "desc");
    	 map.put("name", "都市");
    	 
    	 List<Novel> novelList=novelService.searchNovel(map);
    	 System.out.println("novelList.size():"+novelList.size());
    	 for(Novel n:novelList)
    	 {
    		 System.out.println("id:"+n.getId());
    		 System.out.println("title:"+n.getTitle());
    		 System.out.println("author:"+n.getAuthor());
    		 System.out.println("类型:"+n.getNovelsort().getName());
    	 }
		
	}
	public static void searchNovelsort()
	{
		 ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
    	 NovelsortService novelsortService=(NovelsortService) ac.getBean("novelsortService");
    	 Map<String,Object> map=new HashMap();
 		
    	 map.put("name", "都市");
    	 
    	 List<Novelsort> novelsortList=novelsortService.searchNovelsort(map);
    	
    	 for(Novelsort novelsort:novelsortList)
    	 {
    		 System.out.println("name:"+novelsort.getName());
    		 System.out.println("小说数目:"+novelsort.getCount());
    		 /*for(Novel n:novelsort.getNovels())
    		 {
    			 System.out.println("id:"+n.getId());
        		 System.out.println("title:"+n.getTitle());
        		 System.out.println("author:"+n.getAuthor());
        		
    		 }*/
    	 }
    	 
		
	}
	public static void insertNovelsort()
	{
		 ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
    	 NovelsortService novelsortService=(NovelsortService) ac.getBean("novelsortService");
    	 Novelsort novelsort=new Novelsort();
    	 novelsort.setName("言情");
    	 novelsort.setPublishDate(new java.util.Date());
    	 int flag=0;
    	 try
    	 {
    		 flag=novelsortService.addNovelsort(novelsort);
    		 if(flag==1)
    		 {
    			 System.out.println("添加成功!");
    			 
    		 }
    	 }
    	 catch(Exception e)
    	 {
    		
        		 System.out.println("添加失败!");
    		
    	 }
    	
    	 
		
	}
	
	public static void insertNovel()
	{
		 ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
    	 NovelService novelService=(NovelService) ac.getBean("novelService");
    	 NovelsortService novelsortService=(NovelsortService) ac.getBean("novelsortService");
    	Novel novel=new Novel();
    	novel.setAuthor("辰东");
    	novel.setTitle("遮天");
    	Map<String,Object> map=new HashMap();
    	map.put("name", "玄幻");
    	novel.setNovelsort(novelsortService.getNovelsort(map));
    	novel.setPublishDate(new java.util.Date());
    	
    	Novelsort novelsort=novelsortService.getNovelsort(map);
    System.out.println("novelsort.id:"+novelsort.getId());
    	/* int flag=0;
    	 
    		 flag=novelService.addNovel(novel);
    		 if(flag==1)
    		 {
    			 System.out.println("添加成功!");
    			 
    		 }*/
	}
	
	public static void deleteNovel()
	{
		 ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
    	 NovelService novelService=(NovelService) ac.getBean("novelService");
    	
    	Novel novel=new Novel();
    	novel.setId(45);
    	
    	
    	
    	
    	
    	 int flag=0;
    	
    		 flag=novelService.deleteNovel(novel);
    		 if(flag==1)
    		 {
    			 System.out.println("删除成功!");
    			 
    		 }
    		 else
    		 {
    			 System.out.println("删除失败!");
    		 }
    		 
	}
	public static void updateNovel()
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		NovelService novelService=(NovelService) ac.getBean("novelService");
		NovelsortService novelsortService=(NovelsortService)ac.getBean("novelsortService");
		Novel n=new Novel();
		//n.setTitle("天才医生1");
		//n.setAuthor("柳下惠");
		Map<String,Object> map=new HashMap();
		map.put("id", 4);
		n.setNovelsort(novelsortService.getNovelsort(map));
		n.setId(63);
		int flag=novelService.updateNovel(n);
		if(flag==1)
		{
			System.out.println("修改成功");
		}
		else
		{
			System.out.println("修改失败");
		}
	}
	public static void selectOneNovel()
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		NovelService novelService=(NovelService) ac.getBean("novelService");
		Map<String,Object> map=new HashMap();
		map.put("n_id",3);
		Novel novel=new Novel();
		novel=novelService.setectOneNovel(map);
		if(novel!=null)
		{
			System.out.println("id:"+novel.getId());
		}
		
		
	}
     public static void main(String []args)
     {
    	 //System.out.println(1);
    	 //search();
    	 //searchNovelsort();
    	// insertNovel();
    	 //deleteNovel();
    	//updateNovel();
    	 selectOneNovel();
     }
}
