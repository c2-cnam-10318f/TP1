/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FADY
 */
public class ApplicationContextTestTest {
    
    public ApplicationContextTestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of testWithOurContainer method, of class ApplicationContextTest.
     */
    @Test
    public void testTestWithOurContainer() throws Exception {
        System.out.println("testWithOurContainer");
        ApplicationContextTest instance = new ApplicationContextTest();
        instance.testWithOurContainer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
