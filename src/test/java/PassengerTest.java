import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {



        Passenger passenger;

        @Before
        public void before() {
            passenger = new Passenger("Harold", 2);
        }

        @Test
        public void passengerHasbag() {
            assertEquals(2,passenger.getNum_bags());
        }
    }

