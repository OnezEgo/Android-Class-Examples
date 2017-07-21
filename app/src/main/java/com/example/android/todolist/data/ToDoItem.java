package com.example.android.todolist.data;

/**
 * Created by Fast_Balls on 7/20/2017.
 */

public class ToDoItem {
    private String description;
    private String dueDate;
    private String category;
    private String done;


    public ToDoItem(String description, String dueDate, String category, String done) {
        this.description = description;
        this.dueDate = dueDate;
        this.category = category;
        this.done = done;

    }
    // getters and setters for the new attributes categories and done
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDone() {return done;}

    public void setDone(String done) {
        this.done = done;
    }


}
