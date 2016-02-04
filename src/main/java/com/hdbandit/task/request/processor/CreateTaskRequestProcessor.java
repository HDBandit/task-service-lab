package com.hdbandit.task.request.processor;

import com.hdbandit.task.request.CreateTaskRequest;

/**
 * <p>
 * 	Interfaz que modela la pieza de código que se encarga de tractar las cosas específicas del tipo de request.
 *  Habrá un processor específico por cada creación de tarea específica que tengamos. El diseño cumple OCP.
 * </p>
 *
 */
public interface CreateTaskRequestProcessor {
	
	void process(CreateTaskRequest createTaskRequest);

}
