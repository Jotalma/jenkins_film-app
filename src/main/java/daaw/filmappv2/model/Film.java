package daaw.filmappv2.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Peliculas")
public class Film {
    @Id
    public String id;
    public String titulo;
    public List<String> actores = new ArrayList<String>();
    public String genero;
    public String publicacion;
    
}