package com.hdbandit.task.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hdbandit.task.request.TaskType;
import com.hdbandit.task.request.processor.CreateTaskRequestProcessor;
import com.hdbandit.task.request.processor.impl.CreateGroupTaskProcessor;
import com.hdbandit.task.request.processor.impl.CreateUserTaskProcessor;

@Configuration
public class TaskRequestProcessorsConfig {
	
	/**
	 * <p>
	 *   A medida que se crean diferentes tipos de tareas, se configuran los nuevos processors.
	 *   No se toca código existente, solo se configura nuevos processors.
	 * </p>
	 * 
	 */
	@Bean
	public Map<TaskType, CreateTaskRequestProcessor> createTaskRequestProcessors() {
		HashMap<TaskType, CreateTaskRequestProcessor> createTaskRequestProcessors = new HashMap<TaskType, CreateTaskRequestProcessor>();
		createTaskRequestProcessors.put(TaskType.GROUP, new CreateGroupTaskProcessor());
		createTaskRequestProcessors.put(TaskType.USER, new CreateUserTaskProcessor());
		return createTaskRequestProcessors;
	}

}
