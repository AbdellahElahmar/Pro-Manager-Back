package El.Ahmar.Abdellah.Pro_Manager.Users.web;


import El.Ahmar.Abdellah.Pro_Manager.Users.service.UserService;
import El.Ahmar.Abdellah.Pro_Manager.Users.web.request.CreateUserRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserRestController {

    private final UserService userService;


    @PostMapping("/user")
    public void addUser(@RequestBody CreateUserRequest request) {
        this.userService.addNewUser(request);
    }

}
