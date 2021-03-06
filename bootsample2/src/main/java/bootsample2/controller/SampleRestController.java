package bootsample2.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bootsample2.model.Task;
import bootsample2.service.TaskService;

@RestController
public class SampleRestController {

	@Autowired
	private TaskService taskService;
	
	@GetMapping("/hello")
	public String hello(){
		return "Hello World";
	}
	
//	@GetMapping("/all-tasks")
//	public String allTasks(){
//		return taskService.findAll().toString();
//	}
//	
//	@GetMapping("/save-task")
//	public String saveTasks(@RequestParam String name, @RequestParam String desc){
//		Task task = new Task(name, desc, new Date(), false);
//		taskService.save(task);
//		return "Task saved!!!!";
//	}
//	
//	@GetMapping("/delete-tasks")
//	public String deleteTasks(@RequestParam int id){
//		taskService.delete(id);
//		return "Task Deleted!!!!";
//	}
	
}
