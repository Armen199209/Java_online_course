package Lesson7.airport.model;

public class Plane {
    private String name;
    private int releaseYear;
    private int hourInAir;
    private boolean isMilitary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getHourInAir() {
        return hourInAir;
    }

    public void setHourInAir(int hourInAir) {
        this.hourInAir = hourInAir;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setIsMilitary(boolean isMilitary) {
        this.isMilitary = isMilitary;
    }


    public void printInfo() {
        System.out.printf("Name = %s , Release year = %d, Hours in Air = %d, Is military = %s\n",
        name, releaseYear, hourInAir, isMilitary? "yes" : "no");
    }
}
