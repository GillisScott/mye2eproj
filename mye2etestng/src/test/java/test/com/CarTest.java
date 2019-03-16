/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test.com;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author thest
 */
public class CarTest {
    
    Car car;        // Declaration
    
    public CarTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        
        car = new Car();        // Instantiation
        
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void validateModel() {
        
        car.setModel("sedan");
        car.setMake("Chrysler");
        car.setPrice(22000.0);
        car.setColor("Silver");
        
        assertEquals("sedan", car.getModel());
        assertEquals("Chrysler", car.getMake());
        assertEquals(22000.0, car.getPrice());
        assertEquals("Silver", car.getColor());
        
        
    }
}
