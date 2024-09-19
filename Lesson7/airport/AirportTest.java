package Lesson7.airport;

import Lesson7.airport.model.Plane;
import Lesson7.airport.sevice.AirportService;

public class AirportTest {
    public static void main(String[] args) {
        AirportService service = new AirportService();
        Plane plane = service.createPlane();
        Plane plane1 = service.createPlane();
        Plane plane2 = service.createPlane();
        Plane[] planes = {plane, plane1, plane2};



//        System.out.println("--------------------------------------------------------------------------");
//        service.printNameAndReleaseDate(plane);
//        System.out.println("--------------------------------------------------------------------------");
//        service.printNameOrHours(plane);
//        System.out.println("--------------------------------------------------------------------------");
//        System.out.println(service.nameOfPlaneWithBiggerTime(plane, plane1));
//        System.out.println("--------------------------------------------------------------------------");
//        service.returnTheLongerNameOfPlane(plane, plane1).printInfo();
//        System.out.println("--------------------------------------------------------------------------");
//        service.printPlanes(planes);
//        System.out.println("--------------------------------------------------------------------------");
//        service.printPlanesWhichReleaseAfter2010AnsMilitary(planes);
//        System.out.println("--------------------------------------------------------------------------");
//        service.returnMaxTimeSpentInAir(planes).printInfo();
//        System.out.println("--------------------------------------------------------------------------");
        service.printTheOldestPlane(planes);

    }
}
