package com.hdbandit.task.request;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.wordnik.swagger.annotations.ApiModel;

/**
 * <p>
 * Esta clase declara atributos específicos de todas las tareas (parte común)
 * </p>
 *
 */
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=CreateGroupTaskRequest.class, name="group"),
	@JsonSubTypes.Type(value=CreateUserTaskRequest.class, name="user"),
})
@ApiModel(value="AbstractCreateTaskRequest", description="Petición genérica tarea", subTypes = {CreateGroupTaskRequest.class, CreateUserTaskRequest.class})
public class AbstractCreateTaskRequest implements CreateTaskRequest {
	
	// Anotamos todas las bean validations necesarias
	
	@NotEmpty
	@NotNull
	private String title;
	@NotEmpty
	@NotNull
	private String description;
	@NotNull
	@NotEmpty
	private String owner;
	private TaskType taskType;
	
	public AbstractCreateTaskRequest(TaskType taskType) {
		this.taskType = taskType;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getOwner() {
		return owner;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public TaskType getType() {
		return taskType;
	}

}
