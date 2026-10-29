package lab3;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat codingBat = new CodingBat();

    @org.junit.Test
    public void sleepIn() {
        assertArrayEquals(true, codingBat.sleepIn(false, false));
        assertArrayEquals(false, codingBat.sleepIn(true, false));
        assertArrayEquals(true, codingBat.sleepIn(true, true));
    }

    @org.junit.Test
    public void loneTeen() {
        assertArrayEquals(true, codingBat.loneTeen(false, false));
        assertArrayEquals(false, codingBat.loneTeen(, false ));
        assertArrayEquals(false, codingBat.loneTeen());
    }

    @org.junit.Test
    public void helloName() {
    }

    @org.junit.Test
    public void firstLast6() {
    }
}