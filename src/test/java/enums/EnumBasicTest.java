package enums;

import org.junit.Test;

import enums.EnumBasic.Farm;
import junit.framework.TestCase;

public class EnumBasicTest extends TestCase {
    @Test
    public void testNothing() {
        final String testVal = "nothing";
        assertTrue("nothing".equals(testVal));
    }

    @Test
    public void testEnumFromDb() {
        Farm cow = EnumBasic.getAnimalFromFarm("cow");
        assertTrue(cow.getDb().equals("cow"));
    }
    
    @Test
    public void testEnumForSound() { 
        Farm cow = EnumBasic.getAnimalFromFarm("cow");
        assertTrue(cow.getSound().equals("moo"));
    }
}