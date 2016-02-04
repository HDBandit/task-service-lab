package com.hdbandit.task.request.processor.impl;

import com.hdbandit.task.request.CreateGroupTaskRequest;
import com.hdbandit.task.request.CreateTaskRequest;
import com.hdbandit.task.request.processor.CreateTaskRequestProcessor;

public class CreateGroupTaskRequestProcessor implements CreateTaskRequestProcessor {

	@Override
	public void process(CreateTaskRequest createTaskRequest) {
		if (!(createTaskRequest instanceof CreateGroupTaskRequest)) { // programación defensiva 
			throw new IllegalArgumentException("Task type not supported. This processor only support group tasks");
		}
		
		CreateGroupTaskRequest createGroupTaskRequest = (CreateGroupTaskRequest) createTaskRequest;
		// LLAMAR A SERVICE, HACER EL PROCESAMIENTO QUE HAGA FALTA PARA CREACION DE TAREAS DE GRUPOS
		System.out.print(String.format("Tarea de grupo %s PROCESADA!!", createGroupTaskRequest.getGroupName()));
	}

}
