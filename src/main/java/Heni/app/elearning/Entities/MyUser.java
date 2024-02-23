package Heni.app.elearning.Entities;

import Heni.app.elearning.enums.ROLE;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class MyUser {
    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String firstname;
    private String lastname;
    private ROLE role;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @OneToMany(mappedBy = "myUser")
    private List<Course> courses;

    @OneToMany(mappedBy = "myUser")
    private List<Enrollment> enrollments;
}
