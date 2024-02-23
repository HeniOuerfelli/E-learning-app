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
public class Lesson {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private LocalDate duration;

    @ManyToOne()
    @JoinColumn(name = "id_module")
    private Module module;
}
