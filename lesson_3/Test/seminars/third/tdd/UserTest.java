package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    @Test
    void authenticateTest() {
        User user = new User("Alex", "ALEX", false);
        assertTrue(user.authenticate("Alex", "ALEX"));
    }
}