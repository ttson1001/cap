package elderlysitter.capstone.UserServicesImpl;

import elderlysitter.capstone.UserServices.UserServices;
import elderlysitter.capstone.entities.User;
import elderlysitter.capstone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        return  userRepository.findByUsername((username));
    }
}
