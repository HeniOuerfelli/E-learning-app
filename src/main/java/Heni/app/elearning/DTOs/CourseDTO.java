package Heni.app.elearning.DTOs;

import Heni.app.elearning.enums.DifficultyLevel;

public record CourseDTO(
        Integer id_user,
        Integer id_category,
        String title,
        DifficultyLevel difficultyLevel,
        String rating
) {
}
