import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    Pilot pilot;

    Passenger passenger;

    Plane plane;

    CabinCrewMember cabinCrewMember;



    Rank rank;

    @Before
    public void before() {

        CabinCrewMember cabinCrewMember1 = new CabinCrewMember("Anne", Rank.FLIGHT_ATTENDANT);
        CabinCrewMember cabinCrewMember2 = new CabinCrewMember("Joseph", Rank.PURSER);
        pilot = new Pilot("James", Rank.FIRST_OFFICER, "12345FA");

        ArrayList<CabinCrewMember> cabinCrewMembers = new ArrayList<>();

        cabinCrewMembers.add(cabinCrewMember1);
        cabinCrewMembers.add(cabinCrewMember2);
        cabinCrewMembers.add(pilot);

        ArrayList<Passenger>passengers = new ArrayList<>();

        flight = new Flight("JA7579", "EDI", "ORY", "11:00", plane.AIRBUS_A_380, pilot, cabinCrewMembers, passengers);

    }

    @Test
    public void flightHasNumber () {
        assertEquals("JA7579", flight.getFlightNumber());
    }

    @Test
    public void flightHasDepartureAirport() {
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDestinationAirport() {
        assertEquals("ORY", flight.getDestinationAirport());
    }

    @Test
    public void flightHasDepartureTime() {
        assertEquals("11:00", flight.getDepartureTime());
    }

    @Test
    public void flightHasPlaneType() {
        assertEquals(plane.AIRBUS_A_380, flight.getPlaneType());
    }

    @Test
    public void flightHasCapacity() {
        assertEquals(500, flight.getPlaneType().getCapaCity());
    }

    @Test
    public void flightHasWeight() {
        assertEquals(290000, flight.getPlaneType().getTotalWeight(),0.0);
    }

    @Test
    public void flightHasAPilot() {
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void flightHasCabinCrewMembers() {
        assertEquals(3, flight.crewMemberCount());
    }

    @Test
    public void flightHasPassengers() {
        assertEquals(0, flight.getPassengerCount());
    }

    @Test
    public void flightHasAvailableSeats() {
        flight.bookPassenger();
        assertEquals(499, flight.getAvailableSeats());
    }

    @Test
    public void flightBooksPassenger() {
        flight.bookPassenger();
        flight.bookPassenger();
        flight.bookPassenger();
        assertEquals(497, flight.getAvailableSeats());
        assertEquals(3, flight.getPassengerCount());
    }




}
