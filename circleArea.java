
package calculationsexam;


public class circleArea {
         final double radius;
      final double pi = 22.0 / 7.0;

    public circleArea(double radius) {
        this.radius = radius;
    }

    public double calculatecircleArea() {
        return pi * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * pi * radius;
    }
        
}

    
    

