package com.hdbandit.task.request;

/**
 * <p>
 * 	Todas las tareas de nuestro sistema se componen como mínimo de un titulo, una descripción, un propietario y son de un tipo.
 * </p>
 * 
 * <p>
 * 	Esta interfaz nos servirá para aplicar polimorfismo y por lo tanto generalizar código.
 * </p>
 *
 */
public interface CreateTaskRequest {
	
	String getTitle();
	
	String getDescription();
	
	String getOwner();
	
	TaskType getType();

}
