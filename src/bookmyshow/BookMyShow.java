package bookmyshow;

import bookmyshow.enums.PaymentStatus;
import bookmyshow.enums.SeatType;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {

    //Populating the data

    //instantiate  the theatre controller and movie controller
    //1)create movies
    //2)create theatre
    //create screens
    //create seats
    //create shows
    //create booking
    MovieController movieController;
    TheatreController theatreController;

    BookMyShow() {

        movieController = new MovieController();

        theatreController = new TheatreController();

    }

    void initialize() {
        createMovie();
        createTheatre();

    }


    public static void main(String[] args) {


        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.initialize();
        //success booking
        System.out.println("Person 1 booking the ticket");
        bookMyShow.createBooking("Bangalore", "Bahubali");
        //since seat is already taken as the booking is done on the same seat , it print oops
        System.out.println("Person 2 booking the ticket");
        bookMyShow.createBooking("Bangalore", "Bahubali");

    }

    //populating movie info to movie controller
    void createMovie() {
        //create movie Bahubali
        Movie bahubali = new Movie();
        bahubali.setId(134);
        bahubali.setDuration(180);
        bahubali.setName("Bahubali");
        //create movie kgf
        Movie kgf = new Movie();
        kgf.setId(1344);
        kgf.setDuration(183);
        kgf.setName("KGF");

        //add movies mapped to cities
        movieController.addMovie(bahubali, "Bangalore");
        movieController.addMovie(bahubali, "Kasaragod");
        movieController.addMovie(kgf, "Bangalore");
        movieController.addMovie(kgf, "Kasaragod");


    }

    //populating theatre  info to theatre controller
    void createTheatre() {

        Movie bahu = movieController.getMovieByName("Bahubali");
        Movie kgf = movieController.getMovieByName("KGF");

        //max theatre data
        Theatre maxTheatre = new Theatre();
        maxTheatre.setId(1);
        maxTheatre.setName("MAX");
        maxTheatre.setScreens(createScreen());
        List<Show> maxShows = new ArrayList<>();
        maxShows.add(createShows(1, bahu, 8, maxTheatre.screens.get(0)));
        maxShows.add(createShows(2, kgf, 12, maxTheatre.screens.get(0)));
        maxTheatre.setShows(maxShows);
        maxTheatre.setCity("Kasaragod");


        //pvr  theatre data
        Theatre pvrTheatre = new Theatre();
        pvrTheatre.setId(1);
        pvrTheatre.setName("PVR");
        pvrTheatre.setScreens(createScreen());
        List<Show> pvrShows = new ArrayList<>();
        maxShows.add(createShows(1, bahu, 8, pvrTheatre.screens.get(0)));
        maxShows.add(createShows(2, kgf, 12, pvrTheatre.screens.get(0)));
        pvrTheatre.setShows(maxShows);
        pvrTheatre.setCity("Bangalore");

        //adding theatre info to the theatre controller
        theatreController.addTheatre("Bangalore", pvrTheatre);
        theatreController.addTheatre("Kasaragod", maxTheatre);


    }

    //method used in creteTheatre
    Show createShows(int id, Movie movie, int time, Screen screen) {
        Show show = new Show();
        show.setId(id);
        show.setMovie(movie);
        show.setStartTime(time);

        show.setScreen(screen);

        return show;

    }

    //method used in creteTheatre
    List<Screen> createScreen() {
        List<Screen> screens = new ArrayList<>();
        Screen screen = new Screen();
        screen.setId(1);
        screen.setSeats(createSeats());
        screens.add(screen);
        return screens;


    }

    //method used in creteTheatre
    List<Seat> createSeats() {
        //creating 100 seats of different categories

        List<Seat> seats = new ArrayList<>();


        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat();
            seat.setId(i);
            seat.setCost(120);
            seat.setType(SeatType.SILVER);
            seats.add(seat);

        }
        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat();
            seat.setId(i);
            seat.setCost(180);
            seat.setType(SeatType.GOLD);
            seats.add(seat);

        }

        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat();
            seat.setId(i);
            seat.setCost(200);
            seat.setType(SeatType.PLATINUM);
            seats.add(seat);

        }

        return seats;


    }

    // method for booking
    void createBooking(String city, String movieName) {
        //1.select the movie from the city
        List<Movie> movies = movieController.movieByCity(city);
        Movie interestedMovie = null;
        for (Movie movie : movies) {
            if (movie.getName().equals(movieName)) {
                interestedMovie = movie;

            }
        }


        //2.select the shows for this movie from theatres in this city

        Map<Theatre, List<Show>> theatreVsShows = theatreController.getAllShowsIntheCity("Bangalore", interestedMovie);

        //3. select the theatre and the show

        Map.Entry entry = theatreVsShows.entrySet().iterator().next();
        List<Show> runningShows = (List<Show>) entry.getValue();

        //choose the show

        Show chosenShow = runningShows.get(0);

        //4.choose seats
        // I want 50th seat
        int mySeatChoice = 50;
        List<Integer> bookedSeatIds = chosenShow.getBookedSeatsIds();
        if (!bookedSeatIds.contains(mySeatChoice)) {


            bookedSeatIds.add(50);
            List<Seat> myBookedSeats = new ArrayList<>();
            for (Seat seat : chosenShow.getScreen().getSeats()) {
                if (seat.getId() == mySeatChoice) {
                    myBookedSeats.add(seat);
                }
            }


            //5.create  booking

            Booking booking = new Booking();
            booking.setShow(chosenShow);
            booking.setId(1);
            booking.setSeats(myBookedSeats);
            //poulating the amount field in the bill
            booking.calculateAmount();
            booking.status = PaymentStatus.PAID;
            //6.  paybill
            Payment payment = new Payment(booking);
            payment.payBill();
            System.out.println("Booking success...");
            System.out.println("---------------------------------------");


        } else {
            System.out.println("Oops seat already taken");
        }


    }


}
