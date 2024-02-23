package Heni.app.elearning.DTOs;

import org.springframework.stereotype.Service;


public record UserDTO(
    String firstname,
    String lastname,
    String email
) {
}
