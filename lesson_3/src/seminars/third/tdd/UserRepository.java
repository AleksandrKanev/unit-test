package seminars.third.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (findByName(user.name)) {
            if (user.authenticate(user.name, user.password)) {
                data.add(user);
            }
        }
    }

    public boolean findByName(String username) {
        if(data.size() == 0){return true;}
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

}