import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWorkTest {

    @org.junit.jupiter.api.Test
    void sum() {
        assertEquals(6, HomeWork.sum(3, 3));
        assertEquals(-1, HomeWork.sum(-1, 0));
        assertEquals(-1, HomeWork.sum(3, Integer.MAX_VALUE));
        assertEquals(0, HomeWork.sum(3, 0));
    }
}