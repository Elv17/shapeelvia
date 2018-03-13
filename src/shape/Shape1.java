/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Elvia
 */
public class Shape1 {
    
    public static final int SQUARE=1;
    public static final int CIRCLE=2;
    public static final int RIGHT_TRIANGLE=3;
    
    private int shapeType;
    private double size;
    public Shape1(int shapeType, double size){
        this.shapeType=shapeType;
        this.size=size;
    }
    
    //---otros metodos---
    
    public double area(){
        switch(shapeType){
            case SQUARE: return size*size;
            case CIRCLE: return Math.PI*(size*size);
            case RIGHT_TRIANGLE: return size*size/2.0;
        }
        return 0;
    }
}
