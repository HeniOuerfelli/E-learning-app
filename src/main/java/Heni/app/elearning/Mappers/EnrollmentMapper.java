package Heni.app.elearning.Mappers;

import Heni.app.elearning.DTOs.EnrollmentDTO;
import Heni.app.elearning.Entities.Enrollment;
import Heni.app.elearning.Entities.MyUser;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentMapper {
    public Enrollment toEnrollment(EnrollmentDTO enrollmentDTO){
        Enrollment enrollment = new Enrollment();
        MyUser myUser = new MyUser();
        myUser.setId(enrollmentDTO.id_user());
        enrollment.setProgress(enrollmentDTO.progress());
        enrollment.setMyUser(myUser);
        return enrollment;
    }
    public EnrollmentDTO toEnrollmentDTO(Enrollment enrollment){
        return new EnrollmentDTO(
                enrollment.getMyUser().getId(),
                enrollment.getProgress()
        );
    }
}
