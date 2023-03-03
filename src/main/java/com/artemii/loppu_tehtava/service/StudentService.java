package com.artemii.loppu_tehtava.service;

import java.util.ArrayList;
import java.util.List;
import com.artemii.loppu_tehtava.data.student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private List<student> students = new ArrayList<>();

    public StudentService() {
        students.add(new student(1, "Nikita", "Mihali", 1));
        students.add(new student(2, "Pekka", "Mihali", 2));
        students.add(new student(3, "Jussi", "Mihali", 4));

    }

    public void Addstudent(student prod) {
        students.add(prod);
    }

    public List<student> getstudents() {
        return new ArrayList<>(students);
    }

    public student findstudent(int id) {
        for (student prod : students) {
            if (prod.getId() == id) {
                return prod;
            }
        }

        return null;
    }

    public boolean removestudent(int id) {
        student p = findstudent(id);

        if (p != null) {
            students.remove(p);
            return true;

        }

        return false;

    }
}
