package com.gtm.service;

import com.gtm.pojo.Lecturer;
import com.gtm.pojo.Student;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ReadExcelService {
    public List<Student> getStudentsFromFile(MultipartFile file);
    public List<Lecturer> getLecturersFromFile(MultipartFile file);
}
