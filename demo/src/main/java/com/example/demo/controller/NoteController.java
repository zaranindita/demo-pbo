package com.example.demo.controller;
import com.example.demo.model.Note;
import com.example.demo.repository.NoteRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/notes")

public class NoteController {

    private final NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @PostMapping("/add")
    public Note addNote(@RequestBody Note note) {
        return noteRepository.save(note);
    }

    @GetMapping("/all")
    public List<Note> getAllNotes() {
         return noteRepository.findAll();
    }
}
