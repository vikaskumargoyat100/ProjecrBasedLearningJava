package MiniProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {

    @Autowired
    private StudentDAO dao;

    @Transactional
    public void addStudent(Student student) {
        dao.saveStudent(student);
    }
}
