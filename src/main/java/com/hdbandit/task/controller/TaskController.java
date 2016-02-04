package com.hdbandit.task.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdbandit.task.request.CreateTaskRequest;
import com.hdbandit.task.request.TaskType;
import com.hdbandit.task.request.processor.CreateTaskRequestProcessor;

@RestController
@RequestMapping("/task")
public class TaskController {
	
	@Autowired
	private Map<TaskType, CreateTaskRequestProcessor> createTaskRequestProcessors;
	
	@RequestMapping(method = POST)
	public void createTask(@Valid @RequestBody CreateTaskRequest createTaskRequest) {
		// cogemos de nuestros create task request processors configurados el que corresponde
		// al tipo que nos están pasando y lo ejecutamos.
		createTaskRequestProcessors.get(createTaskRequest.getType()).process(createTaskRequest);
	}

}
