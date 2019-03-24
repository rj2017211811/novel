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
    	 map.put("name", "����");
    	 
    	 List<Novel> novelList=novelService.searchNovel(map);
    	 System.out.println("novelList.size():"+novelList.size());
    	 for(Novel n:novelList)
    	 {
    		 System.out.println("id:"+n.getId());
    		 System.out.println("title:"+n.getTitle());
    		 System.out.println("author:"+n.getAuthor());
    		 System.out.println("����:"+n.getNovelsort().getName());
    	 }
		
	}
	public static void searchNovelsort()
	{
		 ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
    	 NovelsortService novelsortService=(NovelsortService) ac.getBean("novelsortService");
    	 Map<String,Object> map=new HashMap();
 		
    	 map.put("name", "����");
    	 
    	 List<Novelsort> novelsortList=novelsortService.searchNovelsort(map);
    	
    	 for(Novelsort novelsort:novelsortList)
    	 {
    		 System.out.println("name:"+novelsort.getName());
    		 System.out.println("С˵��Ŀ:"+novelsort.getCount());
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
    	 novelsort.setName("����");
    	 novelsort.setPublishDate(new java.util.Date());
    	 int flag=0;
    	 try
    	 {
    		 flag=novelsortService.addNovelsort(novelsort);
    		 if(flag==1)
    		 {
    			 System.out.println("��ӳɹ�!");
    			 
    		 }
    	 }
    	 catch(Exception e)
    	 {
    		
        		 System.out.println("���ʧ��!");
    		
    	 }
    	
    	 
		
	}
	
	public static void insertNovel()
	{
		 ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
    	 NovelService novelService=(NovelService) ac.getBean("novelService");
    	 NovelsortService novelsortService=(NovelsortService) ac.getBean("novelsortService");
    	Novel novel=new Novel();
    	novel.setAuthor("����");
    	novel.setTitle("����");
    	Map<String,Object> map=new HashMap();
    	map.put("name", "����");
    	novel.setNovelsort(novelsortService.getNovelsort(map));
    	novel.setPublishDate(new java.util.Date());
    	
    	Novelsort novelsort=novelsortService.getNovelsort(map);
    System.out.println("novelsort.id:"+novelsort.getId());
    	/* int flag=0;
    	 
    		 flag=novelService.addNovel(novel);
    		 if(flag==1)
    		 {
    			 System.out.println("��ӳɹ�!");
    			 
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
    			 System.out.println("ɾ���ɹ�!");
    			 
    		 }
    		 else
    		 {
    			 System.out.println("ɾ��ʧ��!");
    		 }
    		 
	}
	public static void updateNovel()
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		NovelService novelService=(NovelService) ac.getBean("novelService");
		NovelsortService novelsortService=(NovelsortService)ac.getBean("novelsortService");
		Novel n=new Novel();
		//n.setTitle("���ҽ��1");
		//n.setAuthor("���»�");
		Map<String,Object> map=new HashMap();
		map.put("id", 4);
		n.setNovelsort(novelsortService.getNovelsort(map));
		n.setId(63);
		int flag=novelService.updateNovel(n);
		if(flag==1)
		{
			System.out.println("�޸ĳɹ�");
		}
		else
		{
			System.out.println("�޸�ʧ��");
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
