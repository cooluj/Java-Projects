public class Equestria {

    private static final double tripLength = 21.5;
    private static final int cloudsDaleX = 14;
    private static final int cloudsDaleY = 8;

    private static final int losPegasusX = 6;
    private static final int losPegasusY = 19;

    public static final int baltimareX = 31;
    private static final int baltimareY = 16;

    private static final int canterlotX = 18;
    private static final int canterlotY = 10;

    public static void main(String[] args) {
        /*
        * Exercise 3
        * Write a program that helps Princess Luna plan a 3-stop tour of Equestria.
        * Princess Luna has specifically requested that you choose three destinations in Equestria, as defined by their x and y coordinates on the map.
        * You program should output the distance between the three.
        * You should use the distance methods you wrote for Exercise 2.
        */
        System.out.println(totalTrip(cloudsDaleX, cloudsDaleY, losPegasusX, losPegasusY, baltimareX, baltimareY));
    }
    /* Exercise 1
     * Write a method called roadTrip that (1) accepts as a parameter the diameter
     * of the circular path, and (2) returns the length of the trip.
     */
    public static double roadTrip(double diameter) {
        double pi = 3.1415;
        double length = pi * diameter;
        return length;
      }

    /* Exercise 2
     * Write a method called distance that (1) accepts four integer coordinates: x1, y1, x2, y2 as parameters,
     * (2) computes the distance between points (x1, y1) and (x2, y2) on the map, and (3) returns that distance.
     */
    public static double distance(double x1, double y1, double x2, double y2) {
        double xDiff = x2-x1;
        double yDiff = y2-y1;
        double distance = Math.sqrt(yDiff * yDiff + xDiff * xDiff);
        return distance;
    }


    /* Exercise 4
     * Write a method called totalTrip that accepts parameters for 3 locations (each containing coordinates) and returns
     * the total distance traveled by visiting all 3 locations and returning to the starting location. You should use the
     * distance methods you wrote in Exercise 2 and you can choose any 3 locations in Equestria.
     */
    public static double totalTrip(double x1, double y1, double x2, double y2, double x3, double y3) {
        double totalTrips = distance(x1,y1,x2,y2) + distance(x2, y2, x3, y3) + distance(x3, y3, x1, y1);
        return totalTrips;
    }
}