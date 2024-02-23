package Heni.app.elearning.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Module {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String description;

    @ManyToOne()
    @JoinColumn(name = "id_course")
    private Course course;

    @OneToMany(mappedBy = "module")
    private List<Lesson> lessons;
}
