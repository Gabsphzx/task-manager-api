package com.taskmanager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import com.taskmanager.model.Task.TaskStatus;
import com.taskmanager.model.Task.TaskPriority;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDTO {

    private Long id;

    @NotBlank(message = "Título não pode ser vazio")
    @Size(min = 3, max = 200, message = "Título deve ter entre 3 e 200 caracteres")
    private String title;

    private String description;

    @NotNull(message = "Status não pode ser nulo")
    private TaskStatus status;

    private TaskPriority priority;

    @NotNull(message = "ID do usuário não pode ser nulo")
    private Long userId;
}