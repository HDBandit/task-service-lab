package com.hdbandit.task.request;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * <p>
 * Esta clase declara atributos específicos de tareas de usuario.
 * Como por ejemplo el nombre del usuario al que pertenece la tarea.
 * </p>
 *
 */
public class CreateUserTaskRequest extends AbstractCreateTaskRequest {

	@NotEmpty
	@NotNull
	private String userName;
	
	public CreateUserTaskRequest() {
		super(TaskType.USER);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
