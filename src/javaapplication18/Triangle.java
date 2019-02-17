/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Streamline
 */
public class Triangle extends Figure {

    public Triangle(ArrayList<Angle> vertices) {
        if (vertices.size() != 3) {
            this.vertices = new ArrayList<>();
        } else {
            this.vertices = vertices;
        }

    }

    /*public Triangle(Vertex ... vertices){
        this.vertices = Arrays.asList(vertices);
    }*/
    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimetr() {
        double per = 0;
        int i1 = 0;
        for (int i = 0; i < vertices.size() - 1; i++) {
            i1 = i + 1;
            if (i == 2) {
                i1 = 0;
            }
            per += Math.sqrt(Math.pow(vertices.get(i).getX(), vertices.get(i1).getX()) + Math.pow(vertices.get(i).getY(), vertices.get(i1).getY()));

        }
        return per;
    }
}
