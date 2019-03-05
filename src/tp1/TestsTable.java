/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp.Factory;

/**
 *
 * @author FADY
 */
public class TestsTable extends junit.framework.TestCase{


  public void testTableArrayList() throws Exception{
    try{
      ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        MovieLister table = ctx.getBean("table");
      table.ajouter(4);table.ajouter(2);table.ajouter(3);table.ajouter(1);
      assertEquals("[4, 2, 3, 1]",table.toString());
      try{
        table.ajouter(5);
        fail("Une exception doit être levée, la capacité de la table est atteinte...");
      }catch(Exception e){
      }
      assertEquals(Table.class,ctx.getType("table"));
        MovieLister table2 = ctx.getBean("table");
      assertSame(table, table2);
    }catch(Exception e){
      fail("Exception inattendue :" + e.getMessage());
    }
  }

  public void testTableArrayList2() throws Exception{
    try{
      ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
      Table<Integer> table = ctx.getBean("table2");
      assertEquals(Table.class,ctx.getType("table2"));
      table.ajouter(4);table.ajouter(2);table.ajouter(2);table.ajouter(1);
      assertEquals("[4, 2, 2, 1]",table.toString());
      try{
        table.ajouter(5);
        fail("Une exception doit être levée, la capacité de la table est atteinte...");
      }catch(Exception e){
      }
    }catch(Exception e){
      fail("Exception inattendue :" + e.getMessage());
    }
  }

  public void testTableSet() throws Exception{
    try{
      ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
      Table<Integer> table = ctx.getBean("tableSet");
      table.ajouter(4);table.ajouter(2);table.ajouter(2);table.ajouter(1);
      assertEquals("[1, 2, 4]",table.toString());
      try{
        table.ajouter(3);
        assertEquals("[1, 2, 3, 4]",table.toString());
        table.ajouter(6);
        fail("Une exception doit être levée, la capacité de la table est atteinte...");
      }catch(Exception e){
      }
      assertEquals(Table.class,ctx.getType("table"));
    }catch(Exception e){
      fail("Exception inattendue :" + e.getMessage());
    }
  }	

  public void testContainerContent()throws Exception{
    try{
      ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
      List<String> liste = new ArrayList<String>();
      for(String bean : ctx){ 
        liste.add(bean);
      }
      assertTrue(liste.contains("MovieLister"));
      assertTrue(liste.contains("MovieFinder"));
      assertTrue(liste.contains("table"));
    }catch(Exception e){
      fail("Exception inattendue :" + e.getMessage());
    }
  }

  public void testTabelSet2()throws Exception{
    try{
      ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
      Table<Integer> table = ctx.getBean("tableSet");
      table.ajouter(4);table.ajouter(2);table.ajouter(2);table.ajouter(1);
      assertEquals("[1, 2, 4]",table.toString());

      ApplicationContext ctx2 = Factory.createApplicationContext();
      Table<Integer> table2 = ctx2.getBean("tableSet");
      table2.ajouter(4);table2.ajouter(2);table2.ajouter(2);table2.ajouter(1);
      assertEquals("[1, 2, 4]",table2.toString());

      table.ajouter(3);
      assertEquals("[1, 2, 3, 4]",table.toString());
      assertEquals("[1, 2, 4]",table2.toString());
    }catch(Exception e){
      fail("Exception inattendue :" + e.getMessage());
    }
  }

    private void assertEquals(String _2_3_1, String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void fail(String une_exception_doit_être_levée_la_capacité) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertSame(MovieLister table, MovieLister table2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
