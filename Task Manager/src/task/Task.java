package task;

import java.util.List;

public class Task {
    private String name;
    private String description;
    private String category;
    private String todolist;

    public Task(String name, String description, String category, String todolist) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.todolist = todolist;
    }

    public void addTask(List<Task> taskList, Task newTask) {
        // Please enter definition here.
    }

    public void removeTask(List<Task> taskList, String taskName) {
        // Please enter definition here.
    }

    public void printAllTasks(List<Task> taskList) {
        // Please enter definition here.
    }

    public void printTasksByCategory(List<Task> taskList, String category) {
        // Please enter definition here.
    }

    public void addTodoList(Task task, String todoList) {
        // Please enter definition here.
    }
}