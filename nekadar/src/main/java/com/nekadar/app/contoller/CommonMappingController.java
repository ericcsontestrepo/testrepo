package com.nekadar.app.contoller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nekadar.app.entities.User;
import com.nekadar.app.services.EmployeeService;
import com.nekadar.app.services.UserService;

@Controller
public class CommonMappingController {

	@Autowired
	private UserService userService;
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showDefaultPage(Model model, @RequestParam(defaultValue = "0") int page) {
		model.addAttribute("data", userService.getAllUser(page));
		model.addAttribute("currentPage", page);
		return "index";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String updateRecord( User user) {
		userService.saveUser(user);
		return "redirect:/";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteUser(User user) {
		userService.deleteUser(user);
		return "redirect:/";
	}

	@RequestMapping(value = "/findOne", method = RequestMethod.GET)
	public @ResponseBody Optional<User> findOne(@RequestParam Long id) {
		return userService.findOneRecord(id);
	}
}
