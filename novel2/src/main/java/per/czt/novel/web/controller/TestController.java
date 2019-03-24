package per.czt.novel.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import per.czt.novel.domain.Test;
import per.czt.novel.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
	@Resource
	private TestService testService;
	
	
	

	@RequestMapping("/listAll")
	public String listAll(Model model)
	{
		List<Test> testList=testService.listAll();
		model.addAttribute(testList);
		return "test/testList";
	}
}
