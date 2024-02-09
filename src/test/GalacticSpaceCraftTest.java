package test;

import static org.junit.Assert.*;

import org.junit.Test;

import service.GalacticSpaceCraft;

public class GalacticSpaceCraftTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
    public void testMoveForward() {
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(0, 0, 0, 'N');
        spacecraft.moveForward();
        assertEquals(0, spacecraft.getX());
        assertEquals(1, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals('N', spacecraft.getDirection());
    }

    @Test
    public void testMoveBackward() {
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(0, 0, 0, 'N');
        spacecraft.moveBackward();
        assertEquals(0, spacecraft.getX());
        assertEquals(-1, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals('N', spacecraft.getDirection());
    }

    @Test
    public void testTurnLeft() {
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(0, 0, 0, 'N');
        spacecraft.turnLeft();
        assertEquals(0, spacecraft.getX());
        assertEquals(0, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals('W', spacecraft.getDirection());
    }

    @Test
    public void testTurnRight() {
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(0, 0, 0, 'N');
        spacecraft.turnRight();
        assertEquals(0, spacecraft.getX());
        assertEquals(0, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals('E', spacecraft.getDirection());
    }

    @Test
    public void testTurnUp() {
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(0, 0, 0, 'N');
        spacecraft.turnUp();
        assertEquals(0, spacecraft.getX());
        assertEquals(0, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals('U', spacecraft.getDirection());
    }

    @Test
    public void testTurnDown() {
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(0, 0, 0, 'N');
        spacecraft.turnDown();
        assertEquals(0, spacecraft.getX());
        assertEquals(0, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals('D', spacecraft.getDirection());
    }
}
