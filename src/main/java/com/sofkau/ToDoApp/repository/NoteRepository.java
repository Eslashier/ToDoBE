package com.sofkau.ToDoApp.repository;

import com.sofkau.ToDoApp.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {


}
