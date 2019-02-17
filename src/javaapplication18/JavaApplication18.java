
package javaapplication18;

import java.util.ArrayList;

public class JavaApplication18 {

    public static void main(String[] args) {
        ArrayList<Angle> data = new ArrayList<>();
        data.add(new Angle(2, 0));
        data.add(new Angle(4, 0));
        data.add(new Angle(6, 0));
        
        Triangle tr = new Triangle(data);
        
        System.out.println(tr.perimetr());
        System.out.println(tr.area());
    }
    
}
