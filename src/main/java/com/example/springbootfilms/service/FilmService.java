package com.example.springbootfilms.service;

import com.example.springbootfilms.model.Film;
import com.example.springbootfilms.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    private final FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public Film findById(Long id) {
        return filmRepository.findById(id).orElse(null);
    }

    public List<Film> findAll() {
        return filmRepository.findAll();
    }

    public void saveFilm(Film film) {
        filmRepository.save(film);
    }

    public void deleteById(Long id) {
        filmRepository.deleteById(id);
    }
}
