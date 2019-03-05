/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author FADY
 */
public class Movie{
    private String title;
    private String director;

  public Movie(String title, String director){
    this.title = title;
    this.director = director;
  }
  
  public String getTitle(){
    return title;
  }
  
  public String getDirector(){
    return director;
  }
}
