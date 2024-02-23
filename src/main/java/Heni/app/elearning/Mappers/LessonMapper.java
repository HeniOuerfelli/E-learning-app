package Heni.app.elearning.Mappers;

import Heni.app.elearning.DTOs.LessonDTO;
import Heni.app.elearning.Entities.Lesson;
import Heni.app.elearning.Entities.Module;
import org.springframework.stereotype.Service;

@Service
public class LessonMapper {
    public Lesson toLesson(LessonDTO lessonDTO){
        if(lessonDTO == null){
            throw new NullPointerException("");
        }
        Lesson lesson = new Lesson();
        lesson.setTitle(lessonDTO.title());
        Module module = new Module();
        module.setId(lessonDTO.id_module());
        lesson.setModule(module);
        return lesson;
    }
    public LessonDTO toLessonDTO(Lesson lesson){
        return new LessonDTO(
                lesson.getTitle(),
                lesson.getModule().getId()
        );
    }
}
