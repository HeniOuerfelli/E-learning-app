package Heni.app.elearning.Mappers;

import Heni.app.elearning.DTOs.CategoryDTO;
import Heni.app.elearning.Entities.Category;
import org.springframework.stereotype.Service;

@Service
public class CategoryMapper {
    public Category toCategory(CategoryDTO categoryDTO){
        if(categoryDTO ==null){
            throw new NullPointerException("");
        }
        Category category = new Category();
        category.setName(categoryDTO.name());
        category.setDescription(categoryDTO.description());
        return category;
    }
    public CategoryDTO toCategoryDTO(Category category){
        return new CategoryDTO(
                category.getName(),
                category.getDescription()
        );
    }
}
