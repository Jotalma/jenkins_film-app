package daaw.filmappv2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import daaw.filmappv2.model.Film;
import daaw.filmappv2.service.FilmService;

@RestController
@RequestMapping("/peliculas")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping("")
    public Iterable<Film> findAll(){
        return filmService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Film> findOne(@PathVariable String id){
        return filmService.findById(id);
    }

   
    @GetMapping("/titulo/{titulo}")
    public List<Film> findByTitulo(@PathVariable String titulo){
        return filmService.findByTitulo(titulo);
    }

    @GetMapping("/actor/{actores}")
    public List<Film> findByActores(@PathVariable String actores){
        return filmService.findByActores(actores);
    }

    @PostMapping("/")
    public void save(@RequestBody Film film){
        filmService.save(film);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        filmService.deleteById(id);
    }
}
