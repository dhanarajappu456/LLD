package bookmyshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {

    Map<String, List<Movie>> cityVsMovies;
    List<Movie> allMovies;


    MovieController() {

        cityVsMovies = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    void addMovie(Movie movie, String city) {
        List<Movie> movies = cityVsMovies.getOrDefault(city, new ArrayList<>());

        movies.add(movie);

        cityVsMovies.put(city, movies);
        allMovies.add(movie);


    }

    Movie getMovieByName(String movieName) {

        for (Movie movie : allMovies) {
            if (movie.getName().equals(movieName)) {
                return movie;
            }
        }
        return null;

    }

    List<Movie> movieByCity(String city) {
        //assume only cities listed can be selected for a movie

        return cityVsMovies.get(city);

    }


}
