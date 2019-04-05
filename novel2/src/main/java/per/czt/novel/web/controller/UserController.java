package per.czt.novel.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import per.czt.novel.domain.Message;
import per.czt.novel.domain.User;
import per.czt.novel.service.MessageService;
import per.czt.novel.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	@Resource
	private MessageService messageService;

	@RequestMapping(value = "/checkUser", method = RequestMethod.GET, produces = "text/html;charset=utf-8")
	@ResponseBody
	public void checkUser(HttpServletResponse response, String username, String password, HttpServletRequest request)
			throws IOException {
		PrintWriter out = response.getWriter();
		Map<String, Object> map = new HashMap();
		map.put("username", username);
		map.put("password", password);
		map.put("num", 1);
		List<User> userList = userService.searchUser(map);
		System.out.println("userList.size():" + userList.size());
		if (userList.size() == 1) {

			User u = new User();
			u = userList.get(0);
			// 更新在线状态
			Map<String, Object> map2 = new HashMap();
			System.out.println("id:"+u.getId());
			map2.put("id", u.getId());
			map2.put("isOnline", true);
			int flag = userService.updateUser(map2);
			if (flag == 1) {
				System.out.println("更新登录信息成功!");
			}
			else
			{
				System.out.println("更新登录信息失败!");
			}

			// session保存当前用户信息
			HttpSession session = request.getSession();
			session.setAttribute("user", u);
			session.setMaxInactiveInterval(60 * 60);
			out.println("true");
		} else {
			out.println("false");
		}
		/*
		 * System.out.println("username:"+username);
		 * 
		 * System.out.println("password:"+password);
		 */
	}

	@RequestMapping("/userInfo")
	public String goUserInfo(HttpServletRequest request, Model model) {
		
		User u = new User();
		u = (User) request.getSession().getAttribute("user");
		if (u != null) {
			Map<String, Object> map = new HashMap();
			map.put("isOnline", true);
			List<User> onlineuserList = userService.searchUser(map);
			System.out.println("onlineuserList.size():" + onlineuserList.size());
			model.addAttribute("onlineuserList", onlineuserList);
			Map<String, Object> map2 = new HashMap();
			map2.put("isOnline", false);
			List<User> notonlineuserList = userService.searchUser(map2);
			System.out.println("notonlineuserList.size():" + notonlineuserList.size());
			model.addAttribute("notonlineuserList", notonlineuserList);
			return "user/userInfo";
		} else {
			model.addAttribute("tipMessage", "您还未登录或您的登录已经失效,请重新登录");
			return "user/userInfo";
		}
	}

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		User u = new User();
		u = (User) request.getSession().getAttribute("user");
		// 更新在线状态
		Map<String, Object> map2 = new HashMap();
		System.out.println("u_id:"+u.getId());
		map2.put("id", u.getId());
	
		map2.put("isOnline", false);
		int flag = userService.updateUser(map2);
		if (flag == 1) {
			System.out.println("更新成功!");
		}
	

		HttpSession session = request.getSession();
		session.removeAttribute("user");

		return "redirect:../home.action";
		

	}

	@RequestMapping(value = "/goChat", method = RequestMethod.GET)

	public String goChat(HttpServletResponse response, Integer id, Model model,HttpServletRequest request) throws IOException {
		
		
		User u1 = (User) request.getSession().getAttribute("user");
		
		Map<String, Object> map1 = new HashMap();
		map1.put("senderId", u1.getId());
		map1.put("getterId", id);
		System.out.println("id1:"+u1.getId()+" id2:"+id);
		List<Message> messageList=messageService.searchMessage(map1);
		System.out.println("size:" + messageList.size());
		for(Message m:messageList)
		{
			System.out.println("id:"+m.getId());
			System.out.println("sender.id:"+m.getSender().getId()+"sender.name"+m.getSender().getUsername());
			System.out.println("content:"+m.getContent());
			System.out.println("getter:"+m.getGetterId());
		
			
		}
		
		
		
		Map<String, Object> map = new HashMap();
		map.put("u_id", id);
		List<User> userList = userService.searchUser(map);
		User u = new User();
		u = userList.get(0);
		model.addAttribute("user2", u);
		model.addAttribute("messageList",messageList);

	
		
		return "user/userChat";
		

	}
	
	
	@RequestMapping(value = "/chat", method = RequestMethod.GET,produces="text/html;charset=utf-8")
	@ResponseBody
	public void chat(HttpServletResponse response,  Model model,HttpServletRequest request) throws IOException {
		PrintWriter pw=response.getWriter();
		String content=request.getParameter("content");
		Integer getterId=Integer.parseInt(request.getParameter("getterId"));
		User u1 = (User) request.getSession().getAttribute("user");
		int senderId=u1.getId();
		System.out.println("content:"+content);
		System.out.println("getterId:"+getterId);
		System.out.println("senderId:"+senderId);
		Map<String, Object> map = new HashMap();
		map.put("u_id", senderId);
		User sender = userService.searchUser(map).get(0);
		System.out.println("senderId:"+sender.getId());
		Message m=new Message();
		m.setContent(content);
		m.setGetterId(getterId);
		m.setSender(sender);
		m.setSendDate(new java.util.Date());

		int flag = messageService.insertMessage(m);
		if (flag == 1) {
			System.out.println("发送成功!");
			pw.println(true);
			
		}
		else
		{
			System.out.println("发送失败!");
			pw.println(false);
		}
		
	
		

	}

}
