import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot(1000, "Trevor", RankType.PILOT);

        }

    @Test
    public void pilotHasLicence() {
        assertEquals(1000, pilot.getPilotLicence());

        }
    }


