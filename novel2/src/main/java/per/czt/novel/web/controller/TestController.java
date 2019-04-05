package per.czt.novel.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import per.czt.novel.domain.City;
import per.czt.novel.domain.Country;
import per.czt.novel.domain.Test;
import per.czt.novel.service.CountryService;
import per.czt.novel.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
	@Resource
	private TestService testService;
	
	@Resource
	private CountryService countryService;
	
	
	
	

	@RequestMapping("/listAll")
	public String listAll(Model model)
	{
		List<Test> testList=testService.listAll();
		model.addAttribute(testList);
		return "test/testList";
	}
	
	@RequestMapping(value= {"/checkUser"},method=RequestMethod.	GET,produces="text/xml;charset=utf-8")
	@ResponseBody
	public void checkUser(HttpServletResponse response,String username) throws IOException
	{
		PrintWriter out=response.getWriter();
		response.setHeader("Cache-Control", "no-cache");
		response.setContentType("text/xml;charset=utf-8");
		System.out.println("username:"+username+"欢迎您");
		String s2="欢迎您";
		String s1="抱歉";
		
		System.out.println(username.equals("123"));
		if(username.equals("123"))
		{
			//out.println(true);
			String str1=URLEncoder.encode(s1.toString(),"UTF-8");
			
			//out.println("<res><msg>The username is valiad."+str1+"</msg></res>");
			out.println("[{'res':'"+str1+"'},{'res':'"+URLEncoder.encode("该账号已经被注册","UTF-8")+"'}]");
		
			System.out.println(true);
		}
		else
		{
			//对字符进行utf-8编码
			String str2=URLEncoder.encode(s2.toString(),"UTF-8");
			//out.println("<res><msg>The username is not valiad."+str2+"</msg></res>");
			out.println("[{'res':'"+str2+"'},{'res':'"+URLEncoder.encode(username,"UTF-8")+"'}]");
			
			//out.println(false);
			System.out.println(false);
		}
		
	}
	

	@RequestMapping(value= {"/getProCity"},method=RequestMethod.GET,produces="text/xml;charset=utf-8")
	@ResponseBody
	public void getProCity(HttpServletResponse response,Integer id) throws IOException
	{
		PrintWriter out=response.getWriter();
		//System.out.println("id:"+id);
		Map<String,Object> map=new HashMap();
    	// map.put("c1_id", 2);
    	 map.put("p_id",id);
		List<Country> countryList=countryService.searchCountry(map);
		System.out.println("id:"+countryList.get(0).getProvinces().get(0).getId());
		System.out.println("省份:"+countryList.get(0).getProvinces().get(0).getName());
		out.println("[");
		for(City city:countryList.get(0).getProvinces().get(0).getCities())
		{
			 System.out.println("id:"+city.getId());
    		 System.out.println("name:"+city.getName());
    		 out.println("{'name':'"+URLEncoder.encode(city.getName(),"UTF-8")+"','id':'"+city.getId()+"'},");
		}
		out.println("]");
		
		
		
		/*if(id==3)
		{
			out.println("[{'name':'"+URLEncoder.encode("新泰市","UTF-8")+"','id':'1'},{'name':'"+URLEncoder.encode("章丘市","UTF-8")+"','id':'2'}]");
		}
		if(id==1)
		{
			out.println("[{'name':'"+URLEncoder.encode("东城区","UTF-8")+"','id':'1'},{'name':'"+URLEncoder.encode("朝阳区","UTF-8")+"','id':'2'}]");
		}
		if(id==2)
		{
			out.println("[{'name':'"+URLEncoder.encode("黄浦区","UTF-8")+"','id':'1'},{'name':'"+URLEncoder.encode("浦东新区","UTF-8")+"','id':'2'}]");
		}*/
		
	}
}
