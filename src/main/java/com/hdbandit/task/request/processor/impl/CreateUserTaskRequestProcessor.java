package com.hdbandit.task.request.processor.impl;

import com.hdbandit.task.request.CreateTaskRequest;
import com.hdbandit.task.request.CreateUserTaskRequest;
import com.hdbandit.task.request.processor.CreateTaskRequestProcessor;


public class CreateUserTaskRequestProcessor implements CreateTaskRequestProcessor {

	@Override
	public void process(CreateTaskRequest createTaskRequest) {		
		if (!(createTaskRequest instanceof CreateUserTaskRequest)) { // programación defensiva 
			throw new IllegalArgumentException("Task type not supported. This processor only support user tasks");
		}
		
		CreateUserTaskRequest createUserTaskRequest = (CreateUserTaskRequest) createTaskRequest;
		// LLAMAR A SERVICE, HACER EL PROCESAMIENTO QUE HAGA FALTA PARA CREACION DE TAREAS DE USUARIOS
		System.out.print(String.format("Tarea de usuario %s PROCESADA!!", createUserTaskRequest.getUserName()));

	}

}
