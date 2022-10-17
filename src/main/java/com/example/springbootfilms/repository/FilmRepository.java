package com.example.springbootfilms.repository;

import com.example.springbootfilms.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Long> {
}
