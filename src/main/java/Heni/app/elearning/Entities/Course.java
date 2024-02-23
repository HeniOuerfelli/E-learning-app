package Heni.app.elearning.Entities;

import Heni.app.elearning.enums.DifficultyLevel;
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
public class Course {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String Description;
    private DifficultyLevel difficultyLevel;
    private String rating;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @ManyToOne()
    @JoinColumn(name = "id_user")
    private MyUser myUser;

    @ManyToOne()
    @JoinColumn(name = "id_category")
    private Category category;

    @OneToMany(mappedBy = "course")
    private List<Module> modules;

    @OneToOne()
    private Enrollment enrollment;
}
