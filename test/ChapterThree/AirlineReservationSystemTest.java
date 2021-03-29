package ChapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineReservationSystemTest {
    AirlineReservationSystem airlineReservationSystem;

    @BeforeEach
    void setUp() {
        airlineReservationSystem = new AirlineReservationSystem();
    }

    @AfterEach
    void tearDown() {
        airlineReservationSystem = null;
    }

    @Test
    void systemCanAssignFirstFiveSeatToFirstClass() {
        airlineReservationSystem.assignSeatTypeFirstClass();
        airlineReservationSystem.assignSeatTypeFirstClass();
        airlineReservationSystem.assignSeatTypeFirstClass();
        airlineReservationSystem.assignSeatTypeFirstClass();
        airlineReservationSystem.assignSeatTypeFirstClass();
        airlineReservationSystem.assignSeatTypeFirstClass();
        assertTrue(airlineReservationSystem.getSeats()[0]);
        assertEquals(true, airlineReservationSystem.getSeats()[1]);
        assertEquals(true, airlineReservationSystem.getSeats()[2]);
        assertEquals(true, airlineReservationSystem.getSeats()[3]);
        assertEquals(true, airlineReservationSystem.getSeats()[4]);

    }


    @Test
    void systemCanAssignFirstSeatInSecondArrayToEconomy(){
        airlineReservationSystem.assignSeatTypeEconomy();
        airlineReservationSystem.assignSeatTypeEconomy();
        airlineReservationSystem.assignSeatTypeEconomy();
        airlineReservationSystem.assignSeatTypeEconomy();
//        airlineReservationSystem.assignSeatTypeEconomy();
        assertEquals(true, airlineReservationSystem.getSeats()[5]);
        assertEquals(true, airlineReservationSystem.getSeats()[6]);
        assertEquals(true, airlineReservationSystem.getSeats()[7]);
        assertEquals(true, airlineReservationSystem.getSeats()[8]);
//        assertEquals(true, airlineReservationSystem.getSeats()[9]);
    }

@Test
void systemCanCheckIfAllSeatsAreBooked(){
        airlineReservationSystem.seatsNotAvailable();
        assertEquals(true, airlineReservationSystem.getFreeSeats()[9]);

}

}

