package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    PasswordGeneration passwordGen;

    @Before
    public void setUp() {
        passwordGen = new PasswordGeneration();
    }

    @Test
    public void getRandomPassword() {
        assertEquals(8, passwordGen.getRandomPassword().length());
    }
}
