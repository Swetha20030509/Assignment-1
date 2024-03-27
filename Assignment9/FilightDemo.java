package Assignment9;

import java.util.Scanner;

class Flight
{
    private static int totalFlight;
    private int flightNumber;
    private String arrivalPlace;
    private String departurePlace;
    private byte arrivalTime;
    private byte depatureTime;

    public void setArrivalPlace(String arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public void setArrivalTime(byte arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDepatureTime(byte depatureTime) {
        this.depatureTime = depatureTime;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public static void settotalFlights() {
        Flight.totalFlight++;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public byte getArrivalTime() {
        return arrivalTime;
    }

    public byte getDepatureTime() {
        return depatureTime;
    }

    public String getArrivalPlace() {
        return arrivalPlace;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public  int getTotalFlight() {
        return totalFlight;
    }
}
public class FilightDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter flight Number");
        int flightNumber= sc.nextInt();
        System.out.println("Enter the arrival place");
        String arrivalPlace= sc.nextLine();
        System.out.println("Enter the departure place");
        String departurePlace=sc.nextLine();
        System.out.println("Enter the arrival Time");
        byte arrivalTime=sc.nextByte();
        System.out.println("Enter the departure time");
        byte departureTime= sc.nextByte();
        Flight flight=new Flight();
        flight.setFlightNumber(flightNumber);
        flight.setArrivalPlace(arrivalPlace);
        flight.setDeparturePlace(departurePlace);
        flight.setArrivalTime(arrivalTime);
        flight.setDepatureTime(departureTime);
        System.out.println("************FLIGHT DETAIL************");
        System.out.println("Flight Number :"+flight.getFlightNumber());
        System.out.println("Arrival place :"+flight.getArrivalPlace());
        System.out.println("Depature place :"+flight.getDeparturePlace());
        System.out.println("Arrival Time :"+flight.getArrivalTime());
        System.out.println("Depature Time :"+flight.getDepatureTime());
        System.out.println("Total Flight"+flight.getTotalFlight());
        System.out.println("*******************************sabari************");
    }
}
