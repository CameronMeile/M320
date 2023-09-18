import V1.*;
import V1.Human;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class V1Test {
    @Test
    void generateStudent() {

        List<Human> humans = new ArrayList<>();
        humans.add(new Lehrer("Niel"));
        humans.add(new Direktor("Lars"));
        humans.add(new Lehrer("Schmid"));
        humans.add(new Schueler("Lorena"));
        humans.add(new Sozialarbeiter("Anegret"));
        humans.forEach(h -> System.out.println(h.getName()));
        assertEquals("Niel", humans.get(0).getName());

        humans.remove(0);
        System.out.println("________________________________\n");
        humans.forEach(h -> System.out.println(h.getName()));

    }
}
