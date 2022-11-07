package com.howcute.howcuteproject.service;

import com.howcute.howcuteproject.data.entity.Waifus;
import com.howcute.howcuteproject.data.repository.WaifusRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaifuService {

    private final WaifusRepository repository;

    public WaifuService(WaifusRepository repository) {
        this.repository = repository;
    }

    public List<Waifus> findAll(Pageable pageable) {
        return repository.findAll(pageable).toList();
    }

    public Waifus findById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException(String.format("El Id %d no existe", id)));
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    public Waifus update(Waifus waifu) {
        if (waifu.getId() == null) {
            throw new RuntimeException("No se puede actualizar waifus que no tengan Identificador");
        }
        return repository.save(waifu);
    }
}

