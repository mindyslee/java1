import java.util.Scanner;

class DistFormula {

    public static void main (String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        double dist = 0;

        //get user input
        System.out.println("Distance Calculator");
        System.out.println("-------------------");
        System.out.println("");
        System.out.print("Enter the x coordinate of point 1: ");
        x1 = sc.nextDouble();
        System.out.print("Enter the y coordinate of point 1: ");
        y1 = sc.nextDouble();
        System.out.print("Enter the x coordinate of point 2: ");
        x2 = sc.nextDouble();
        System.out.print("Enter the y coordinate of point 2: ");
        y2 = sc.nextDouble();

        //calculations/ displaying distance
        dist = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        System.out.println("The distance between those points is " + dist + " units.");
    }

}