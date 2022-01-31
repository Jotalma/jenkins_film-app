package daaw.filmappv2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daaw.filmappv2.model.Film;
import daaw.filmappv2.repository.FilmRepository;

@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;

    public List<Film> findAll(){
        return filmRepository.findAll();
    }

    public Optional<Film> findById(String id){
        return filmRepository.findById(id);
    }

    public List<Film> findByTitulo(String titulo){
        return filmRepository.findByTitulo(titulo);
    }

    public List<Film> findByActores(String actores){
        return filmRepository.findByActores(actores);
    }

    public void save(Film film){
        filmRepository.save(film);
    }

    public void deleteById(String id){
        filmRepository.deleteById(id);
    }
}
