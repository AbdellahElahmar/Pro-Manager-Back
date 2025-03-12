package El.Ahmar.Abdellah.Pro_Manager.Users.web.request;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class CreateUserRequest {
    private String firstName;
    private String lastName;
    private String eMail;
    private String password;
}
