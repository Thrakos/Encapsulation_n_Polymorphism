package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Stuff {

	@Test
	void test() {
		EncapsulateTheData e = new EncapsulateTheData();
		e.setItemsRecieved(-1);
		assertEquals(0, e.getItemsRecieved());
		e.setItemsRecieved(1837);
		assertEquals(1837, e.getItemsRecieved());

		e.setDegreesTurned(370);
		assertEquals(360, e.getDegreesTurned());
		e.setDegreesTurned(34);
		assertEquals(34, e.getDegreesTurned());

		e.setMemberObj(e);
		assertEquals(e, e.getMemberObj());
		e.setMemberObj(new String());
		assertEquals(true, e.getMemberObj() instanceof Object);

		e.setNomenclature("");
		assertEquals(" ", e.getNomenclature());
		e.setNomenclature("weohronflkdf");
		assertEquals("weohronflkdf", e.getNomenclature());
	}

}
