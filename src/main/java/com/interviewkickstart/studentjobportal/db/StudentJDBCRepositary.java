package com.interviewkickstart.studentjobportal.db;

import com.interviewkickstart.studentjobportal.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class StudentJDBCRepositary {

    private static final String INSERT_NEW_STUDENT_SQL = "insert into `Student` (`id`,`name`,`age`,`experience`,`contactNum`,`college`,`city`,`createdDate`,`updatedDate`) values " +
            "(?,?,?,?,?,?,?,?,?)";

    @Autowired
    JdbcTemplate jdbcTemplate;


    class StudentRowMapper implements RowMapper<Student> {
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student student = new Student();
            student.setId(rs.getString("id"));
            student.setName(rs.getString("name"));
            student.setExperience(rs.getInt("experience"));
            student.setContactNum(rs.getString("contactNum"));
            student.setCollege(rs.getString("college"));
            student.setCity(rs.getString("city"));
            student.setCreatedDate(rs.getTimestamp("createdDate"));
            student.setUpdatedDate(rs.getTimestamp("updatedDate"));

            return student;
        }

    }

    public int insert(Student student) {
        return jdbcTemplate.update(INSERT_NEW_STUDENT_SQL, new Object[] { student.getId(), student.getName(), student.getAge(), student.getExperience(), student.getContactNum(), student.getCollege(), student.getCity(), student.getCreatedDate(), student.getUpdatedDate() });
    }
}
