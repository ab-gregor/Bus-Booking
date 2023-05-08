
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class busBookingTest {
	BusBooking b=new BusBooking();
	@Test
	void addtest() {
		b.busName.add("KS");
        b.busName.add("Ts");
        b.busName.add("T");
        assertEquals("Adding 3 items to List",3,b.busName.size());
	}

}
