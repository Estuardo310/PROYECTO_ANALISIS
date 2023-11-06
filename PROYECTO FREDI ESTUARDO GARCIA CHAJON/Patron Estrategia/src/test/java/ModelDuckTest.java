import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ModelDuckTest {
    private Duck d;
    private  ByteArrayOutputStream out;
    @Before
    public void before() throws Exception {
        d = new ModelDuck();
        out = new ByteArrayOutputStream();
        System.setOut( new PrintStream( out ) );
    }

    @Test
    public void testFly(){
        d.performFly();
        assertTrue( out.toString().toLowerCase().contains( ":(" ) );
    }
// es igual pero difente en la de arriba debe contener y en la de abajo debe contener  exactamente el mismo
    @Test
    public  void testSound(){
        d.performSound();
        String esperado = "<< mute >>";
        String obtenido = out.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testDisplay() {
        d.display();
        assertTrue( out.toString().toLowerCase().contains( "un" ) );
    }

    @Test
    public void testToString() {
        String esperado = "modelduck{flybehavior=flynoway{}, soundbehavior=mute{}}";
        String obtenido = d.toString().toLowerCase();
        assertEquals( esperado, obtenido );
    }
}