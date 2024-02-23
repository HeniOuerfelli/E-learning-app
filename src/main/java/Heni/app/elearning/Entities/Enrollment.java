package Heni.app.elearning.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Enrollment {
    @Id
    @GeneratedValue
    private Integer id;
    private String progress;
    private LocalDate startedAt;
    private LocalDate completedAt;

    @ManyToOne()
    @JoinColumn(name = "id_user")
    private MyUser myUser;

    @OneToOne()
    private Course course;
}
