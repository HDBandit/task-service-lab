package com.hdbandit.task.request;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * <p>
 * Esta clase declara atributos específicos de tareas de grupo.
 * Como por ejemplo el nombre del grupo al que pertenece la tarea.
 * </p>
 *
 */
public class CreateGroupTaskRequest extends AbstractCreateTaskRequest {

	@NotEmpty
	@NotNull
	private String groupName;
	
	public CreateGroupTaskRequest() {
		super(TaskType.GROUP);
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
