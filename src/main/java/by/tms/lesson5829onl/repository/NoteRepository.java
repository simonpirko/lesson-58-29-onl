package by.tms.lesson5829onl.repository;

import by.tms.lesson5829onl.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author simonpirko
 * Created on 29.10.24
 */

public interface NoteRepository extends JpaRepository<Note, Long> {
}
