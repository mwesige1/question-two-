
package calculationsexam;


public class quandraticEquation {
     private double a, b, c;

    public quandraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculateRoots() {
        double determinant = b * b - 4 * a * c;
        double sqrtDet = Math.sqrt(Math.abs(determinant));

        if (determinant > 0) {
            double root1 = (-b + sqrtDet) / (2 * a);
            double root2 = (-b - sqrtDet) / (2 * a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } 
        else if (determinant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal.");
            System.out.println("Root: " + root);
        } 
        else {
            double realPart = -b / (2 * a);
            double imaginaryPart = sqrtDet / (2 * a);
            System.out.println("Roots are complex and different.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }
}



  

