package com.howcute.howcuteproject.service;

import com.howcute.howcuteproject.data.entity.Question;
import com.howcute.howcuteproject.data.repository.QuestionRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    private final QuestionRepository repository;

    public QuestionService(QuestionRepository repository) {
        this.repository = repository;
    }

    public List<Question> findAll(Pageable pageable) {
        return repository.findAll(pageable).toList();
    }

    public Question findById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException(String.format("El Id %d no existe", id)));
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    public Question update(Question question) {
        if (question.getId() == null) {
            throw new RuntimeException("No se puede actualizar preguntas que no tengan Identificador");
        }
        return repository.save(question);
    }
}
