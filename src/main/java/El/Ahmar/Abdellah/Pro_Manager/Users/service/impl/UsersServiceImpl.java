package El.Ahmar.Abdellah.Pro_Manager.Users.service.impl;

import El.Ahmar.Abdellah.Pro_Manager.Users.domain.User;
import El.Ahmar.Abdellah.Pro_Manager.Users.repository.UserRepository;
import El.Ahmar.Abdellah.Pro_Manager.Users.service.UserService;
import El.Ahmar.Abdellah.Pro_Manager.Users.web.request.CreateUserRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsersServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public void addNewUser(CreateUserRequest request) {
        User user = new User();
        user.setMail(request.getEMail());
        user.setPassword(request.getPassword());
        userRepository.save(user);


    }
}

