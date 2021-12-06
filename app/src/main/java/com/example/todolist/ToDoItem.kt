package com.example.todolist

data class ToDoItem(
    val title: String,
    var isChecked: Boolean = false
)