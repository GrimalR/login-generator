package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LoginServiceTest {

    private String[] logins = {"21501918", "grr2267a", ""};
    private String[] logins2 = {"21501918", "grr2267a", "", "login"};
    private String[] logins3 = {"21501918"};
    private LoginService ls, ls2, ls3;

    @Before
    public void setUp() {
        ls = new LoginService(logins);
        ls2 = new LoginService(logins2);
        ls3 = new LoginService(logins3);
    }

    @Test
    public void loginExists() {
        assertTrue(ls.loginExists("grr2267a"));
    }

    @Test
    public void addLogin() {
        ls.addLogin("login");
        assertTrue(ls.findAllLogins().containsAll(ls2.findAllLogins()));
        assertTrue(ls2.findAllLogins().containsAll(ls.findAllLogins()));
    }

    @Test
    public void findAllLoginsStartingWith() {
        assertTrue(ls.findAllLoginsStartingWith("21").containsAll(ls3.findAllLogins()));
        assertTrue(ls3.findAllLogins().containsAll(ls.findAllLoginsStartingWith("21")));
    }

    @Test
    public void findAllLogins() {
        assertTrue(ls.findAllLogins().containsAll(Arrays.asList(logins)));
        assertTrue(Arrays.asList(logins).containsAll(ls.findAllLogins()));
    }
}
