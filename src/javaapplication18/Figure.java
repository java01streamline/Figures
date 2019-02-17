
package javaapplication18;

import java.util.ArrayList;

public abstract class Figure implements FigureInterface{
    
    public ArrayList<Angle> vertices;
    
    /*public Figure(ArrayList<Vertex> vertices) {
        this.vertices = vertices;
    }*/
    
    @Override
    public String className(){
        return Figure.class.getName();
    }
}
