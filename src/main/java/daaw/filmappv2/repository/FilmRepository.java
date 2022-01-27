package daaw.filmappv2.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import daaw.filmappv2.model.Film;

@Repository
public interface FilmRepository extends MongoRepository<Film, String> {
    List<Film> findByTitulo(String titulo);
    List<Film> findByActores(String actores);
}
