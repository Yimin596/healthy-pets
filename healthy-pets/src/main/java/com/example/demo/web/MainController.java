package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.model.Record;
import com.example.demo.model.User;
import com.example.demo.repository.RecordsRepository;
import com.example.demo.service.RecordService;
import com.example.demo.service.UserServiceImpl;

import java.security.Principal;
@Controller
public class MainController {
	private final RecordsRepository recordsRepository ;
	@Autowired
	private UserServiceImpl userService;
	@Autowired
	private RecordService recordService;
	 public MainController(RecordsRepository recordsRepository) {
	        this.recordsRepository = recordsRepository;
	    }
    @GetMapping("/")
    public String root(Model model, Principal principal) {
	 	String email = principal.getName();
	 	System.out.println(email);
		User user = userService.findByEmail(email);
		System.out.println(user);
		System.out.println(recordService.findUserRecords(user));
		model.addAttribute("records", recordService.findUserRecords(user));
    	//model.addAttribute("records", recordsRepository.findAll());
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }
    @GetMapping("/faq")
    public String faq() {
        return "faq";
    }
}
