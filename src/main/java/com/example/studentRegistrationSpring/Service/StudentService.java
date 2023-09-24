package com.example.studentRegistrationSpring.Service;


import com.example.studentRegistrationSpring.Entity.StudentEntity;
import com.example.studentRegistrationSpring.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired private StudentRepo repo;


    public  Iterable<StudentEntity> listAll() {
        return repo.findAll();
    }

    public void save(StudentEntity students) {
       long admnumber = repo.count();
         admnumber++;
//        String s = new StringBuilder("R-").append(admnumber).toString();
        String formattedAdmNumber = String.format("R-%03d", admnumber);
        students.setAdmissionNumber(formattedAdmNumber);
         repo.save(students);
    }
}
