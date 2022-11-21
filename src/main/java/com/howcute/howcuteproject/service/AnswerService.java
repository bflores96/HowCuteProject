package com.howcute.howcuteproject.service;

import com.howcute.howcuteproject.data.entity.Answer;
import com.howcute.howcuteproject.data.repository.AnswerRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {
    private final AnswerRepository repository;

    public AnswerService(AnswerRepository repository) {this.repository = repository;}

    public List<Answer> findAll(Pageable pageable) {
        return repository.findAll(pageable).toList();
    }

    public Answer findById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException(String.format("El Id %d no existe", id)));
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    public Answer update(Answer answer) {
        if (answer.getId() == null) {
            throw new RuntimeException("No se puede actualizar respuestas que no tengan Identificador");
        }
        return repository.save(answer);
    }
}
