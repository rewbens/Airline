import java.util.ArrayList;

public class Flight {

    private String flightNumber;
    private String departureAirport;

    private String destinationAirport;

    private String departureTime;

    private Plane plane;

    private Pilot pilot;

    private Passenger passenger;

    private ArrayList<CabinCrewMember>cabinCrewMembers;

    private ArrayList<Passenger>passengers;


    public Flight(String flightNumber, String departureAirport, String destinationAirport, String departureTime, Plane plane, Pilot pilot, ArrayList<CabinCrewMember>cabinCrewMembers, ArrayList<Passenger>passengers) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.cabinCrewMembers = cabinCrewMembers;
        this.plane = plane;
        this.pilot = pilot;
        this.passengers = passengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public Plane getPlaneType() {
        return this.plane;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public int crewMemberCount() {
        return this.cabinCrewMembers.size();
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }


    public int getAvailableSeats() {
        return plane.getCapacity() - getPassengerCount();
    }

    public void bookPassenger() {
        passengers.add(passenger);
    }
}
