package by.tms.lesson5829onl.controller;

import by.tms.lesson5829onl.entity.Note;
import by.tms.lesson5829onl.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Author simonpirko
 * Created on 29.10.24
 */

@Controller
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @GetMapping
    public String getNote(Model model) {
        List<Note> all = noteRepository.findAll();
        model.addAttribute("notes", all);
        return "note";
    }

    @PostMapping
    public String postNote(Note note) {
        noteRepository.save(note);
        return "redirect:/note";
    }
}
