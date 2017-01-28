package hmtsks.oop2.task9.airline;

import hmtsks.oop2.task9.airline.plane.Plane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Eugen
 */
public class Airline {

    private ArrayList<Plane> planes;

    public Airline(ArrayList<Plane> planes) {
        this.planes = planes;
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(ArrayList<Plane> planes) {
        this.planes = planes;
    }
//------------------------------------------------------------------------------

    public int totalCapacity() {
        int totalCapacity = 0;
        for (Plane plane : planes) {
            totalCapacity += plane.getCapacity();
        }
        return totalCapacity;
    }
//------------------------------------------------------------------------------

    public int totalLoad() {
        int totalLoad = 0;
        for (Plane plane : planes) {
            totalLoad += plane.getLoad();
        }
        return totalLoad;
    }
//------------------------------------------------------------------------------

    public ArrayList<Plane> searchPlane() {
        ArrayList<Plane> foundPlanes = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter min fuel level");
        int min = in.nextInt();
        System.out.println("Enter max fuel level");
        int max = in.nextInt();
        for (Plane plane : planes) {
            if (plane.getFuel() >= min && plane.getFuel() <= max) {
                foundPlanes.add(plane);
            }
        }
        return foundPlanes;
    }
//------------------------------------------------------------------------------

    public void sort() {
        Collections.sort(planes);
    }
//------------------------------------------------------------------------------

    public void printSort() {
        System.out.println("After sorting");
        for (Plane plane : planes) {
            System.out.println(plane);
        }

    }

}
