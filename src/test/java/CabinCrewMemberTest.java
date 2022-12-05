import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {


    CabinCrewMember cabinCrewMember;

    @Before
        public void before() {cabinCrewMember = new CabinCrewMember("Elvis", RankType.FLIGHT_ATTENDANT); }

    @Test
        public void talkToPassenger() {
        assertEquals("Crew ready for takeoff", cabinCrewMember.talkToPassenger());
    }

    @Test
        public void crewMemberHasName() {
        assertEquals("Elvis", cabinCrewMember.getName());
    }

    @Test
        public void crewMemberHasRank() {
        assertEquals(RankType.FLIGHT_ATTENDANT, cabinCrewMember.getRankType());
    }

}

