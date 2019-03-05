/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.Collection;

/**
 *
 * @author FADY
 */
public class Table<T>{
  private Collection<T> liste;
  private int capacite;
  
  public Table(){}
  public void setListe(Collection<T> liste){
    this.liste = liste;
  }
  public void setCapacite(int capacite){
    this.capacite = capacite;
  }
  public void ajouter(T t){
    if(liste.size()==capacite) throw new RuntimeException("capacity reached");
    liste.add(t);
  }
  public String toString(){
    return liste.toString();
  }
}
