package Heni.app.elearning.Mappers;

import Heni.app.elearning.DTOs.UserDTO;
import Heni.app.elearning.Entities.MyUser;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {
    public MyUser toUser(UserDTO userDTO){
        if(userDTO == null){
            throw new NullPointerException("u passed a null userDTO");
        }
        MyUser myUser = new MyUser();
        myUser.setFirstname(userDTO.firstname());
        myUser.setLastname(userDTO.lastname());
        myUser.setEmail(userDTO.email());
        return myUser;
    }
    public UserDTO toUserDTO(MyUser myUser){
        return new UserDTO(
                myUser.getFirstname(),
                myUser.getLastname(),
                myUser.getEmail()
        );
    }
}
