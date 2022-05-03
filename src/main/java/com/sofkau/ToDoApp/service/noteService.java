package com.sofkau.ToDoApp.service;

import com.sofkau.ToDoApp.entity.Note;

import java.util.List;

public interface noteService {

    List<Note> getNotes();

    Note saveNote(Note note);

    Note updateNote(Note note);

    void deleteNote(Long id);

}
