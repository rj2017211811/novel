/*var people=[{"name":"小明","age":"12"},{"name":"小张","age":"6"}];
 alert(people[0].name+people[0].age);

 alert(people[1].name+people[1].age);*/

//创建ajax引擎
function getXmlHttpObject() {
	var xmlHttp = null;

	// 不同浏览器获取XMLHttpRequest的方法不同
	try {

		xmlHttp = new XMLHttpRequest();
	} catch (e) {

		try {
			xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
		} catch (e) {
			xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
	}
	return xmlHttp;
}
function check() {
	var xmlHttp = getXmlHttpObject();
	// window.alert("xmlHttp:"+xmlHttp);
	// 通过xmlHttp对象向服务器某个页面发送请求
	// 参数:1.方法 get/post 2.url 3.是否异步
	var username = $("#username").val();
	var url = "./test/checkUser.action?username=" + username;

	// 打开请求
	xmlHttp.open("get", url, true);
	// 指定回调函数
	xmlHttp.onreadystatechange = function checkDeal() {

		if (xmlHttp.readyState == 4) {
			console.log("完成");
			// alert("success:"+xmlHttp.responseText)
			// $("#username1").val(xmlHttp.responseText);
			// 取出XML数据,返回了一个dom对象
			// alert(xmlHttp.responseXML);
			/*
			 * var msg=xmlHttp.responseXML.getElementsByTagName("msg");
			 * alert(decodeURIComponent(msg[0].childNodes[0].nodeValue));
			 */
			// window.alert(xmlHttp.responseText);
			var msg_json = eval("(" + decodeURIComponent(xmlHttp.responseText)
					+ ")");
			alert(msg_json[0].res + msg_json[1].res);

			// 遍历返回的json数据
			for (var i = 0; i < msg_json.length; i++) {
				window.alert(msg_json[i].res);
			}

		}
		if (xmlHttp.readyState == 0) {
			console.log("未初始化");
		}
		if (xmlHttp.readyState == 1) {
			console.log("读取中");
		}
		if (xmlHttp.readyState == 2) {
			console.log("已读取");
		}
		if (xmlHttp.readyState == 3) {
			console.log("交互中");
		}
	};
	// 真的发送请求,如果是get请求，填入空，如果是post，填入实际数据
	var data = "username=" + username;
	xmlHttp.send(null);
}
function checkUsername() {
	var username = $("#username").val();
	// window.alert(username);
	$.ajax({
		url : "./checkUser.action",
		type : "post",
		data : {
			username : username
		},
		success : function(data) {
			// alert(data);

			console.log(typeof data);
			if (data.trim() == "true") {
				$("#username1").val("用户名正确");
				// alert("登录成功"+data);
			} else {
				$("#username1").val("用户名错误");
				// alert("用户名错误"+data);
			}

		},
		error : function() {
			alert("错误");
		}
	})
}
function delNovel(obj) {

	var xmlHttp = getXmlHttpObject();
	// alert(obj);
	var url = "./delNovel.action?id=" + obj;
	xmlHttp.open("get", url, true);
	xmlHttp.onreadystatechange = function delNovelDeal() {
		if (xmlHttp.readyState == 4) {
			var responseText = xmlHttp.responseText;
			if (responseText.trim() == "true") {
				window.alert("删除成功!");
				window.location.href = "./tomanageNovel?pageNow=2";
			} else {
				window.alert("删除失败!");
			}

		}
	}
	xmlHttp.send(null);

}
function getProCity(obj) {
	var id = $(obj).val();
	var xmlHttp = getXmlHttpObject();
	var url = "./test/getProCity.action?id=" + id;
	xmlHttp.open("get", url, true);
	xmlHttp.onreadystatechange = function setProCity() {
		if (xmlHttp.readyState == 4) {
			
			console.log("完成");
			
			var city=eval("(" + decodeURIComponent(xmlHttp.responseText)
					+ ")");
	
			
			var str;
			for(var i=0;i<city.length;i++)
			{
				
				str+="<option>"+city[i].name+"</option>";
				
			}
			$("#city").html(str);
			
			//window.alert(city[1].name+city[1].id);
		}

	}
	xmlHttp.send(null);

}

function checkUser(obj1,obj2) {

	var xmlHttp = getXmlHttpObject();
	var username=$(obj1).val();
	var password=$(obj2).val();
	if(username!=""&&password!="")
	{
		// alert("xmlHttp:"+xmlHttp+" "+"username:"+username+" "+"password:"+password);
		
		
		var url = "./user/checkUser.action?username=" + username+"&password="+password;
		xmlHttp.open("get", url, true);
		xmlHttp.onreadystatechange = function checkUserDeal() {
			if (xmlHttp.readyState == 4) {
				var responseText = xmlHttp.responseText;
				//window.alert(responseText);
				console.log(responseText);
				console.log(typeof(responseText));
				if(responseText.trim()=="true")
				{
					//alert("登录成功!");
					location.href="./user/userInfo.action";
				}
				else
				{
					alert("用户名或密码错误!");
				}

			}
		}
		xmlHttp.send(null);
		
		
	}
	else
	{
		alert("请输入您的用户名或密码!");
	}
	

}

function chat(obj1,obj2,obj3) {

	var xmlHttp = getXmlHttpObject();
	//alert("obj:"+obj.id);
		var url = "./chat.action?senderId="+$(obj1).val()+"&getterId="+$(obj2).val()+"&content="+$(obj3).val();
		//alert(url);
		xmlHttp.open("get", url, true);
		xmlHttp.onreadystatechange = function getChatFriendInfo() {
			if (xmlHttp.readyState == 4) {
				var responseText = xmlHttp.responseText;
				//alert(responseText);
				if(responseText.trim()=="true")
				{
					
					location.href="./goChat.action?id="+$(obj2).val();
					
				}
				else
				{
					alert("发送失败!")
				}

			}
		}
		xmlHttp.send(null);
		
		


	

}

