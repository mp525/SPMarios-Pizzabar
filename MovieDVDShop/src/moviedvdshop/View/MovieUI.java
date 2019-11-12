package moviedvdshop.View;

import java.sql.SQLException;
import moviedvdshop.Model.MainMovieList;
import moviedvdshop.Model.Movie;



public class MovieUI {
    public static void viewMovieList(MainMovieList movieList){
        for (Movie m : movieList.getMovieList()) {
            System.out.println("Title: " + m.getMovie_title());
        }
    }
    public static void viewMovieById(int movieID) throws ClassNotFoundException, SQLException{
        Movie movie = null;
        movie = MainMovieList.getMovieFromDBByID(movieID);
        System.out.println("Movie: " + movie);
    }

}
