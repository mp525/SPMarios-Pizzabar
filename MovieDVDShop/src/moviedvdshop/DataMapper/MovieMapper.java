package moviedvdshop.DataMapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import moviedvdshop.Model.Movie;
import moviedvdshop.Util.DBConnector;

public class MovieMapper {

    public static ArrayList<Movie> movieList() throws SQLException, ClassNotFoundException {
        ArrayList<Movie> returnList = new ArrayList();
        //TODO: hent fra databasen
        Connection myConnector = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        myConnector = DBConnector.getConnector();
        String query = "SELECT * FROM movies";
        statement = myConnector.createStatement();
        resultSet = statement.executeQuery(query);
        
        while (resultSet.next()) {
            String movie_title = resultSet.getString("movie_title");
            String movie_director = resultSet.getString("director");
            int movie_id = resultSet.getInt("movie_id");
            Movie tmpMovie = new Movie(movie_id, movie_title, movie_director, "2001");
            returnList.add(tmpMovie);
        }

        //Lukker efter sig
        resultSet.close();
        statement.close();
        myConnector.close();

        return returnList;
    }
    public static Movie getMovieFromDBByID(int id) throws ClassNotFoundException, SQLException{
        Movie retMovie = null;
        //TODO: get movie from DB
        Connection myConnector = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        
        String query = "SELECT * FROM movies where movie_id = ?";        
        myConnector = DBConnector.getConnector();
        pstmt = myConnector.prepareStatement(query);
        pstmt.setInt(1, id);
        resultSet = pstmt.executeQuery();
        while(resultSet.next()){
            String movie_title = resultSet.getString("movie_title");
            String movie_director = resultSet.getString("director");
            int movie_id = resultSet.getInt("movie_id");
            retMovie = new Movie(movie_id, movie_title, movie_director, "2001");
            
        }
        resultSet.close();
        pstmt.close();
        myConnector.close();
        
        return retMovie;
    }
}
