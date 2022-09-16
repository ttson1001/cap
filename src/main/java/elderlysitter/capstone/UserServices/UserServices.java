package elderlysitter.capstone.UserServices;

import elderlysitter.capstone.entities.User;

public interface UserServices {
    User findByUsername(String username);
}
