package Lesson7.airport.sevice;


import Lesson7.airport.model.Plane;

import java.util.Scanner;

public class AirportService {

    public Plane createPlane() {
        Plane plane = new Plane();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name of the plane : ");
        plane.setName(s.next());

        System.out.println("Enter hours in air : ");
        plane.setHourInAir(s.nextInt());

        System.out.println("Enter release year : ");
        plane.setReleaseYear(s.nextInt());

        System.out.println("is Military plane? Y/N");
        String m = s.next().toUpperCase();
        plane.setIsMilitary(m.charAt(0) == 'Y');

        return plane;
    }

    public void printNameAndReleaseDate(Plane plane) {
        System.out.println(plane.getName() + ", " + plane.getReleaseYear());
    }

    public void printNameOrHours(Plane plane) {
//        if (plane.getReleaseYear() > 2000) {
//            System.out.println(plane.getName());
//        } else {
//            System.out.println(plane.getHourInAir());
//        }

        System.out.println(plane.getReleaseYear() > 2000 ? plane.getName() : plane.getHourInAir());

    }


    public String nameOfPlaneWithBiggerTime(Plane plane, Plane plane1) {
//        if (plane.getHourInAir() > plane1.getHourInAir()) {
//            return plane.getName();
//        } else {
//            return plane1.getName();
//        }
        return plane.getHourInAir() > plane1.getHourInAir() ? plane.getName() : plane1.getName();
    }

    public Plane returnTheLongerNameOfPlane(Plane plane, Plane plane1) {
        return plane.getName().length() > plane1.getName().length() ? plane : plane1;
    }

    public void printPlanes(Plane[] planes) {
        for (Plane p : planes) {
            p.printInfo();
        }
    }

    public void printPlanesWhichReleaseAfter2010AnsMilitary(Plane[] planes) {
        for (Plane s : planes) {
            if (s.getReleaseYear() > 2010 && s.isMilitary()) {
                s.printInfo();
            }
        }
    }

    public Plane returnMaxTimeSpentInAir(Plane[] planes) {
        Plane max = planes[0];
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].getHourInAir() > max.getHourInAir()) {
                max = planes[i];
            }
        }
        return max;
    }


    public void printTheOldestPlane(Plane[] planes) {
        Plane old = planes[0];
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].getReleaseYear() > old.getReleaseYear()) {
                old = planes[i];
            }
        }
        old.printInfo();
    }

    public void printTheNewestMilitary(Plane[] planes) {
        Plane newest = planes[0];
        int indexOfMilitary = 0;
        for (int j = 0; j < planes.length; j++) {
            if (planes[j].isMilitary()) {
                newest = planes[j];
                indexOfMilitary = j;
                break;
            }
        }

        for (int i = indexOfMilitary + 1; i < planes.length; i++) {
            if (planes[i].isMilitary() && planes[i].getReleaseYear() > newest.getReleaseYear()) {
                newest = planes[i];
            }
        }
        newest.printInfo();
    }


}
