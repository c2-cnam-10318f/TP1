/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.List;

/**
 *
 * @author FADY
 */
public class ColonMovieFinder implements MovieFinder {
  private String filename;
  
  public ColonMovieFinder() {
  }
  
  public void setFilename(String filename) {
    this.filename = filename;
  }
  
  public List<Movie> findAll(){
    List<Movie> list = new ArrayList<Movie>();
    // la liste simulée extraite d'un fichier texte
    list.add(new Movie("Dans les forêts de Sibérie","NEBBOU Safy"));
    list.add(new Movie("Demain","LAURENT Mélanie / DION Cyril"));
    list.add(new Movie("Once Upon a Time in the West","Sergio Leone"));
    return list;
  }
  
  public String toString(){
    return "ColonMovieFinder";
  }
}