package com.program.Pepperfry.controller;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.program.Pepperfry.entity.CheckoutData;
import com.program.Pepperfry.entity.ContactData;
import com.program.Pepperfry.entity.LoginData;
import com.program.Pepperfry.entity.UserData;
import com.program.Pepperfry.repository.CheckRepository;
import com.program.Pepperfry.repository.ContactRepository;
import com.program.Pepperfry.repository.UserRepository;

@Controller
public class HomeController {
	@Autowired
	private UserRepository repo;
	@Autowired
	private CheckRepository check;
	@Autowired
	private ContactRepository con;
	
	@GetMapping("/home")
	public String home()
	{
		return "Home";
	}
	
	@GetMapping("/bed")
	public String bed()
	{
		return "bed";
	}
	
	@GetMapping("/decore")
	public String decore()
	{
		return "decore";
	}
	
	@GetMapping("/storage")
	public String storage()
	{
		return "storage";
	}
	
	@GetMapping("/lamp")
	public String lamp()
	{
		return "lamp & lighting";
	}
	
	@GetMapping("/book")
	public String book()
	{
		return "bookshelf";
	}
	
	@GetMapping("/shoes")
	public String shoes()
	{
		return "shoes rack";
	}
	
	@GetMapping("/tv")
	public String tv()
	{
		return "T.V Unit";
	}
	
	@GetMapping("/dinning")
	public String dinning()
	{
		return "dinning";
	}
	
	@GetMapping("/wooden")
	public String wooden()
	{
		return "wooden sofa";
	}
	
	@GetMapping("/3 seater")
	public String seaterthree()
	{
		return "3 seater";
	}
	
	@GetMapping("/office")
	public String office()
	{
		return "office";
	}
	
	@GetMapping("/1 seater")
	public String seater()
	{
		return "1 seater";
	}
	
	@GetMapping("/study")
	public String study()
	{
		return "study";
	}
	
	@GetMapping("/kids")
	public String kids()
	{
		return "kids";
	}
	
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	@PostMapping("/register")
	public String register(@ModelAttribute UserData u, HttpSession session)
	{
		System.out.println(u);
		
		repo.save(u);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/login";
	}
	
	
	@PostMapping("/contact")
	public String contact(@ModelAttribute ContactData u, HttpSession session)
	{
		System.out.println(u);
		
		con.save(u);
		
		
		
		return "redirect:/home";
	}
	@GetMapping("/checkout")
	public String checkout()
	{
		return "checkout";
	}
	@PostMapping("/checkoutpage")
	public String checkoutpage(@ModelAttribute CheckoutData c, HttpSession session)
	{
		System.out.println(c);
		
		check.save(c);
		
		
		
		return "redirect:/checkoutnote";
		
	}
	@GetMapping("/checkoutnote")
	public String checkoutnote()
	{
		return "checkoupage";
	}
}
