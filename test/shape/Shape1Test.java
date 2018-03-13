/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elvia
 */
public class Shape1Test {
    
    public Shape1Test() {
    }
    //-- Las pruebas positivas---
    @Test
    public void testSquare() {
        System.out.println("Square");
        Shape1 instance = new Shape1(1,2);
        double expResult = 4.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testCircle() {
        System.out.println("Circle");
        Shape1 instance = new Shape1(2,4);
        double expResult = Math.PI*16;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testRight_triangle() {
        System.out.println("Right_triangle");
        Shape1 instance = new Shape1(3,2);
        double expResult = 2.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    //--- las pruebas de fallos---
     @Test
    public void testFallo() {
        System.out.println("opcion no valida");
        Shape1 instance = new Shape1(6,2);//opcion no valida
        double expResult = 4.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testFalloSquare() {
        System.out.println("resultado Square erroneo");
        Shape1 instance = new Shape1(1,2);//opcion no valida
        double expResult = 5.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
