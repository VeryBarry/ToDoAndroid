package com.ironyard.verybarry.todoandroid;

/**
 * Created by VeryBarry on 9/28/16.
 */

public class ToDoItem {
    String text;
    boolean isDone;

    public ToDoItem(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }
    @Override
    public String toString() {
        String checkbox = " ";
        if(isDone){
            checkbox = "✓";
        }
        return String.format("%s %s", checkbox, text);
    }
}
