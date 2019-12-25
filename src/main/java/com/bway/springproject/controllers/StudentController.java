//package com.bway.springproject.controllers;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.util.StringUtils;
//
//import com.bway.springproject.daos.StudentDao;
//import com.bway.springproject.models.Student;
//
//
//
//@Controller
//public class StudentController {
//	
//	@Autowired
//	private StudentDao sdao;
//	
//	@RequestMapping(value="/student",method=RequestMethod.GET)
//	public String getStudentForm(Model model , HttpSession session){
//		
//		if(StringUtils.isEmpty(session.getAttribute("username"))){
//		
//		
//			// return"login"; 
//			return"studentform";
//			
//		}
//		
//		
//		
//		model.addAttribute("stud",new Student());
//		
//		return "studentform";
//		
//	}
//		
//		
//	
//	@RequestMapping(value="/student",method=RequestMethod.POST)
//	public String savestudent(@ModelAttribute Student s, Model model){
//		
//		sdao.addStudent(s);
//		
//		
//		model.addAttribute("slist",sdao.getAllStudent());
//		
//		
//		
//		return"home";
//	}
//	//delete student 
//	
//	
//	@RequestMapping(value="/{id}/delete",method=RequestMethod.GET)
//	public String deleteStud(@PathVariable("id")int id, Model model){
//		sdao.deleteStudent(id);
//		model.addAttribute("slist",sdao.getAllStudent());
//		
//		return "home";
//	}
//	
//	//edit  form
//	
//	@RequestMapping(value="/{id}/edit",method=RequestMethod.GET)
//	public String editStud(@PathVariable("id") int id, Model model){
//		 
//		model.addAttribute("stud",sdao.getById(id));
//		return "editForm";
//	}
//	
//	//update
//	
//	@RequestMapping(value="/update",method=RequestMethod.POST)
//	public String updateStud(@ModelAttribute Student s, Model model){
//		sdao.updateStudent(s);
//		model.addAttribute("slist",sdao.getAllStudent());
//		
//		return "home";
//	}
//	
//		
//
//}
