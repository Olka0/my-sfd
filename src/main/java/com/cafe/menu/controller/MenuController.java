// package com.cafe.menu.controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;

// import com.cafe.menu.entity.Menu;
// import com.cafe.menu.service.TaskService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @Controller
// public class MenuController {

//     @Autowired
//     private TaskService taskService;

//     @GetMapping("/")
//     public String getAll(Model model) {
//         List<Menu> taskList = taskService.getAll();
//         model.addAttribute("taskList", taskList);
//         model.addAttribute("taskSize", taskList.size());
//         return "index";
//     }

//     @RequestMapping("/delete/{id}")
//     public String deleteTask(@PathVariable int id) {
//         taskService.delete(id);
//         return "redirect:/";
//     }

//     @PostMapping("/add")
//     public String addTask(@ModelAttribute Menu task) {
//         taskService.save(task);
//         return "redirect:/";
//     }
// }