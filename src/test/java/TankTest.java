import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TankTest {

    Tank tank;

    @Before
    public void before(){
        tank = new Tank("armored", 200);
    }

    @Test
    public void canGetType(){
        assertEquals("armored", tank.getType());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(200, tank.getHealthValue());
    }

    @Test
    public void canPewPew(){
        assertEquals(60, tank.shoot(60));
    }

    @Test
    public void canBoomBoom(){
        assertEquals(50, tank.granade());
    }

}