package com.hdbandit.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hdbandit.task.annotation.EnableTaskRequestProcessors;

@SpringBootApplication
@EnableTaskRequestProcessors
public class TaskApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
    }

}
