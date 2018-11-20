package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    LoginService loginService;
    LoginGenerator loginGen;

    @Before
    public void setUp() {
        loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        loginGen = new LoginGenerator(loginService);
    }

    @Test
    public void testGenerateLoginForNomAndPrenomCT1() {
        assertEquals("PDUR", loginGen.generateLoginForNomAndPrenom("Durand", "Paul"));
    }

    @Test
    public void testGenerateLoginForNomAndPrenom() {
        assertEquals("JRAL2", loginGen.generateLoginForNomAndPrenom("Ralling", "John"));
    }

    @Test
    public void testGenerateLoginForNomAndPrenomCT2() {
        assertEquals("JROL1", loginGen.generateLoginForNomAndPrenom("Rolling", "Jean"));
    }

    @Test
    public void testGenerateLoginForNomAndPrenomCT3() {
        assertEquals("PDUR", loginGen.generateLoginForNomAndPrenom("Dùrand", "Paul"));
    }
}
