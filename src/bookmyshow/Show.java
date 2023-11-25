package bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class Show {

    int id;
    Movie movie;
    int startTime;
    List<Integer> bookedSeatsIds = new ArrayList<>();
    Screen screen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public List<Integer> getBookedSeatsIds() {
        return bookedSeatsIds;
    }

    public void setBookedSeatsIds(List<Integer> bookedSeatsIds) {
        this.bookedSeatsIds = bookedSeatsIds;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

}


