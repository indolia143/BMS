import Exceptions.SeatNotAvailableException;
import controller.*;
import model.*;
import service.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ClientDemo {

    public static void main(String[] args) {
        Theatre theatre = new Theatre(2234,"PVR","Delhi","12nfba");
        Theatre theatre1 = new Theatre(2234,"PVR","Delhi","12nfba");
        Movie movie = new Movie(900,"ABCD","2.4","2hr");
        Movie movie1 = new Movie(901,"ABCDE","3.4","2.3hr");
        Show show = new Show("2:00-3:00",345,100,2234,900);
        Set<Seat> seats = new HashSet<>();
        seats.addAll(Arrays.asList(new Seat[]{new Seat(1, 1, SeatStatus.Available, "Executive",1000)}));
        Screen screen = new Screen(100,900, seats);
        User user = new User(111,"Rana","Agra","9998898923");

        MovieService movieService = new MovieService();
        ScreenService screenService = new ScreenService();
        ShowService showService = new ShowService(movieService,screenService);
        TheatreService theatreService = new TheatreService(showService,movieService);
        SeatLockService seatLockService = new SeatLockService();
        UserService userService = new UserService();
        BookingService bookingService = new BookingService(seatLockService,userService);

        BookingController bookingController = new BookingController(bookingService);
        SearchController searchController = new SearchController(theatreService,movieService, showService);
        MovieController movieController = new MovieController(movieService);
        TheatreController theatreController = new TheatreController(theatreService);
        ShowController showController = new ShowController(showService);
        ScreenController screenController = new ScreenController(screenService);
        UserController userController = new UserController(userService);

        theatreController.addTheatre(theatre);
        theatreController.addTheatre(theatre1);

        movieController.addMovie(movie,2234);
        movieController.addMovie(movie1,2234);

        showController.addShow(show);

        screenController.addScreen(screen);
        userController.registerUser(user);


        try {
            bookingController.createBooking(345,2234,seats,111);
        } catch (SeatNotAvailableException e) {
            e.printStackTrace();
        }

        System.out.println( "Theatre: "+ theatreController.getTheatre(2234));

        System.out.println( "Theatres: " +searchController.getAllTheatreByCityName("Delhi"));

        System.out.println( "Movies: " + movieController.getAllMoviesForATheatre(2234));

        System.out.println("user bookings: "+ userController.getAllUserBookings(111));


    }
}
