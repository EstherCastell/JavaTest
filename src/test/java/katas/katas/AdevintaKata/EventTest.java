package katas.katas.AdevintaKata;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;

class EventTest {
@Test
    void eventShouldHaveFields() {
    Event event = new Event("kata", "barcelona",12-10-22, 13-10-22);

    assertNotNull(event.getTitle());
    assertNotNull(event.getStartDate());
    assertNotNull(event.getEndDate());
    assertNotNull(event.getLocation());
    //assertNotNull(event.getGuestList());
}
@Test
    void shouldFailWhenStartDateIsAfterEndDate(){
    Event event = new Event();
}

}

