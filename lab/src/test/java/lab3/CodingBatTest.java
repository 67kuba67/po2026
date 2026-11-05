package lab3;

import java.util.*;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat codingBat = new CodingBat();

    @org.junit.Test
    public void sleepIn() {
        assertTrue(codingBat.sleepIn(false, false));
        assertFalse(codingBat.sleepIn(true, false));
        assertTrue(codingBat.sleepIn(false, true));
        assertTrue(codingBat.sleepIn(true, true));
    }

    @org.junit.Test
    public void loneTeen() {
        assertTrue(codingBat.loneTeen(13, 99));
        assertTrue(codingBat.loneTeen(21, 19));
        assertFalse(codingBat.loneTeen(13, 13));
        assertFalse(codingBat.loneTeen(5, 30));
    }

    @org.junit.Test
    public void helloName() {
        assertEquals("Hello Bob!", codingBat.helloName("Bob"));
        assertEquals("Hello Alice!", codingBat.helloName("Alice"));
        assertEquals("Hello X!", codingBat.helloName("X"));
    }

    @org.junit.Test
    public void firstLast6() {
        assertTrue(codingBat.firstLast6(new int[]{1, 2, 6}));
        assertTrue(codingBat.firstLast6(new int[]{6, 1, 2, 3}));
        assertFalse(codingBat.firstLast6(new int[]{13, 6, 1, 2, 3}));
    }

    @org.junit.Test
    public void mapAB3() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("c", "cake");

        Map<String, String> expected = new HashMap<>();
        expected.put("a", "aaa");
        expected.put("b", "aaa");
        expected.put("c", "cake");

        assertEquals(expected, codingBat.mapAB3(map));
    }
}