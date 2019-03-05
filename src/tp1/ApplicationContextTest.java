/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp.Factory;
import java.util.*;

/**
 *
 * @author FADY
 */
public class ApplicationContextTest extends junit.framework.TestCase{

  public void testWithOurContainer() throws Exception{
    ApplicationContext ctx = Factory.createApplicationContext();
    MovieLister lister = ctx.getBean("MovieLister");
    List<Movie> movies = lister.moviesDirectedBy("Sergio Leone");
    assertEquals("Once Upon a Time in the West",movies.get(0).getTitle()); {
    
}

    private void assertEquals(String once_Upon_a_Time_in_the_West, String title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
