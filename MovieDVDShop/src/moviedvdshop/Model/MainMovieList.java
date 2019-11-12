package moviedvdshop.Model;

import java.sql.SQLException;
import java.util.ArrayList;
import moviedvdshop.DataMapper.MovieMapper;
import moviedvdshop.Model.Movie;

public class MainMovieList {

    ArrayList<Movie> movies;

    public MainMovieList() throws SQLException, ClassNotFoundException {
        movies = new ArrayList<>();
        fillListFromDB();
    }

    public ArrayList<Movie> getMovieList() {
        return movies;
    }
    public static Movie getMovieFromDBByID(int id) throws ClassNotFoundException, SQLException{
        Movie movie = null;
        movie = MovieMapper.getMovieFromDBByID(id);
        return movie;
    }

    public void fillListFromDB() throws SQLException, ClassNotFoundException {
        movies = MovieMapper.movieList();
    }
    public void fillListFromFile(){
        movies = null;
    }
    
    
}
