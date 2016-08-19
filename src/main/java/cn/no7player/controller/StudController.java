package cn.no7player.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(value = "/king")
public class StudController {

	@ApiOperation(value = "hello", notes = "获取属性")
	@RequestMapping("/hello")
	public String getName(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "age", required = false) String age, Model model) {
		model.addAttribute("name", "Get......" + name + "," + age);
		return "hello";
	}

	@ApiOperation(value = "world", notes = "设置属性")
	@RequestMapping("/world")
	public String setName(@RequestParam(value = "name", required = false) String name, Model model) {
		model.addAttribute("name", "Set....." + name);
		return "hello";
	}

	@ResponseBody
	@RequestMapping("/boy")
	public Map<String, String> returnJson() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "123");
		map.put("2345", "我的祖国");
		return map;
	}
}
