package Heni.app.elearning.Mappers;

import Heni.app.elearning.DTOs.ModuleDTO;
import Heni.app.elearning.Entities.Course;
import Heni.app.elearning.Entities.Module;
import org.springframework.stereotype.Service;

@Service
public class ModuleMapper {
    public Module toModule(ModuleDTO moduleDTO){
        Module module = new Module();
        module.setTitle(moduleDTO.title());
        Course course = new Course();
        course.setId(moduleDTO.id_course());
        module.setCourse(course);
        return module;
    }
    public ModuleDTO toModuleDTO(Module module){
        return new ModuleDTO(
                module.getTitle(),
                module.getCourse().getId()
        );
    }
}
