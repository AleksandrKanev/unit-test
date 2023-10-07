package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRepositoryTest {
    @Test
    void addUserTest() {
        User user = new User("Alex", "ALEX", false);
        UserRepository repo = new UserRepository();
        repo.addUser(user);
        assertEquals(1, repo.data.size());

    }

    @Test
    void findByNameTest() {
        User user = new User("Alex", "ALEX", false);
        UserRepository repo = new UserRepository();
        repo.addUser(user);
        assertTrue(repo.findByName(user.name));
    }


}
