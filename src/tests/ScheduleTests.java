package tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import gameplay.Schedule;

public class ScheduleTests {
	static Schedule schedule;

	@BeforeClass
	public static void init(){
		schedule = new Schedule();
	}

	@Test
	public void test() {
		//first num
		assertEquals(schedule.getBinary().get(0),"0");
		assertEquals(schedule.getDecimal().get(0), new Integer(0));
		//second num
		assertEquals(schedule.getBinary().get(1),"0");
		assertEquals(schedule.getDecimal().get(1), new Integer(0));
		//third num
		assertEquals(schedule.getBinary().get(2),"0");
		assertEquals(schedule.getDecimal().get(2), new Integer(0));
		//forth num
		assertEquals(schedule.getBinary().get(3),"0");
		assertEquals(schedule.getDecimal().get(3), new Integer(0));
		//fifth num
		assertEquals(schedule.getBinary().get(4),"0");
		assertEquals(schedule.getDecimal().get(4), new Integer(0));
		//sixth num
		assertEquals(schedule.getBinary().get(5),"0");
		assertEquals(schedule.getDecimal().get(5), new Integer(0));
		//seventh num
		assertEquals(schedule.getBinary().get(6),"0");
		assertEquals(schedule.getDecimal().get(6), new Integer(0));
	}

}
