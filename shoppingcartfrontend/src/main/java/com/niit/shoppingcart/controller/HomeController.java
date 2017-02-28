package com.niit.shoppingcart.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController{
	@RequestMapping("/")
public String gotoHome()
{
	
	return"index";
}
	@RequestMapping("/validate")
	public String validate(@RequestParam(name="userID") String id,@RequestParam(name="password") String pwd, Model model)
			{
		
	if(id.equals("niit") && pwd.equals("niit"))
	{
		
		model.addAttribute("successMessage","You successfully logged in");
		return "index";
	}
	else
	{
		
		model.addAttribute("errorMessage","Invalid Credentials");
		return "login";
	}
	
			}

	@RequestMapping("/login")
	public String login( Model model)
	{
		model.addAttribute("userClickedLogin","true");
		return"index";
	}
	@RequestMapping("/Register")
public String Register(Model model)
		{
		model.addAttribute("userClickedRegister","true");
			return"index";
		}
}

