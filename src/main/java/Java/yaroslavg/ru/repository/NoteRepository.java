package Java.yaroslavg.ru.repository;

import Java.yaroslavg.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Репозиторий для работы с заметками.
 */
@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

    /**
     * Получить заметки по статусу.
     * @param status статус заметки
     * @return список заметок с указанным статусом
     */
    List<Note> getNoteByStatus(Note.Status status);
}
