/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author FADY
 */
public class MovieLister{
  private MovieFinder finder;   

  
  public MovieLister() {
  }
  
  public void setFinder(MovieFinder finder) {
    this.finder = finder;
  }
  
  public List<Movie> moviesDirectedBy(String arg) {
    List<Movie> allMovies = finder.findAll();
    for (Iterator<Movie> it = allMovies.iterator(); it.hasNext();) {
        Movie movie = it.next();
        if (!movie.getDirector().equals(arg)) it.remove();
    }
    return allMovies;
  }

    void ajouter(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public interface MovieFinder {
    List<Movie> findAll();
}
