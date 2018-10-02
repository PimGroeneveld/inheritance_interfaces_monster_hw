import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GodzillaTest {

    Godzilla godzilla;
    People unluckyPerson1;
    People unluckyPerson2;
    People unluckyPerson3;

    @Before
    public void before(){
        godzilla = new Godzilla("Godzilla", 1000, 500);
        unluckyPerson1 = new People ("Passerby");
        unluckyPerson2 = new People ("Passerby");
        unluckyPerson3 = new People ("Passerby");
    }

    @Test
    public void canGetName(){
        assertEquals("Godzilla", godzilla.getName());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(1000, godzilla.getAttackValue());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(500, godzilla.getHealthValue());
    }

    @Test
    public void canRoar(){
        assertEquals("Roar I am a monster :D", godzilla.roar());
    }

    @Test
    public void canAttack(){
        assertEquals(1050, godzilla.attack());
    }

    @Test
    public void canMove(){
        assertEquals("I will jump on you!", godzilla.move());
    }

    @Test
    public void canEatPeople(){
        godzilla.nomNomNom(unluckyPerson1);
        godzilla.nomNomNom(unluckyPerson2);
        godzilla.nomNomNom(unluckyPerson3);
        assertEquals(3, godzilla.bellySize());
    }
}