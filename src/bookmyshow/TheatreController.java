package bookmyshow;

import java.util.*;
import java.util.List;

public class TheatreController {

    Map<String, List<Theatre>> cityVsTheatre;

    List<Theatre> allTheatres;

    TheatreController() {

        cityVsTheatre = new HashMap<>();
        allTheatres = new ArrayList<>();


    }

    void addTheatre(String city, Theatre theatre) {

        List<Theatre> theatres = cityVsTheatre.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        cityVsTheatre.put(city, theatres);
        allTheatres.add(theatre);


    }

    Map<Theatre, List<Show>> getAllShowsIntheCity(String city, Movie movie) {

        List<Theatre> theatres = cityVsTheatre.get(city);
        Map<Theatre, List<Show>> theatreVsShows = new HashMap<>();

        for (Theatre theatre : theatres) {
            List<Show> givenMovieShows = new ArrayList<>();
            for (Show show : theatre.shows) {
                if (show.movie.getName().equals(movie.getName())) {
                    givenMovieShows.add(show);
                }

            }

            if (!givenMovieShows.isEmpty()) {

                theatreVsShows.put(theatre, givenMovieShows);
            }
        }
        return theatreVsShows;

    }


}
