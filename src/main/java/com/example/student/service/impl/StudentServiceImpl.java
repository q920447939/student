/**
 * @Project:
 * @Author: liming
 * @Date: 2018年07月03日
 */
package com.example.student.service.impl;

import com.example.student.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * ClassName: StudentServiceImpl
 * @Description:
 * @author liming
 * @date 2018年07月03日
 */
@Service(value = "StudentService")
public class StudentServiceImpl implements StudentService {

    @Override
    public String getStudentById(Long id) {
        //模拟数据库查询
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "student";
    }
}
