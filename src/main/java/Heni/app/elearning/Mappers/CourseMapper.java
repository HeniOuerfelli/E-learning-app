package Heni.app.elearning.Mappers;

import Heni.app.elearning.DTOs.CourseDTO;
import Heni.app.elearning.Entities.Category;
import Heni.app.elearning.Entities.Course;
import Heni.app.elearning.Entities.MyUser;
import org.springframework.stereotype.Service;

@Service
public class CourseMapper {
    public Course toCourse(CourseDTO courseDTO){
        if(courseDTO == null){
            throw new NullPointerException("");
        }
        Course course = new Course();
        course.setTitle(courseDTO.title());
        course.setDifficultyLevel(courseDTO.difficultyLevel());
        course.setRating(courseDTO.rating());
        MyUser myUser = new MyUser();
        myUser.setId(courseDTO.id_user());
        Category category = new Category();
        category.setId(courseDTO.id_category());
        course.setMyUser(myUser);
        course.setCategory(category);
        return course;
    }
    public CourseDTO toCourseDTO(Course course){
        return new CourseDTO(
                course.getMyUser().getId(),
                course.getCategory().getId(),
                course.getTitle(),
                course.getDifficultyLevel(),
                course.getRating()
        );
    }
}
