import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApprenticeTest {

    @Test
    void generateStudent() {
        Apprentice apprentice = new Apprentice("mathe", "Niel");
        assertEquals("Niel", apprentice.getName());
    }
}