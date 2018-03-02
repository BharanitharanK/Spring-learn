package com.student.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import com.student.model.Student;
public class StudDao{

    JdbcTemplate template;

    
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Transactional
    public void save(Student s) {
        String sql="insert into Student(id,name,address,std,grade) values('"+s.getId()+"','"+s.getName()+"','"+s.getAddress()+"','"+s.getStd()+"','"+s.getGrade()+"')";
        template.update(sql);
    }

    @Transactional
    public List<Student> viewAll() {
        return template.query("select * from Student",new RowMapper<Student>(){  
            public Student mapRow(ResultSet rs, int row) throws SQLException {  
                Student s=new Student();  
                s.setId(rs.getInt(1));  
                s.setName(rs.getString(2));  
                s.setAddress(rs.getString(3));  
                s.setStd(rs.getInt(4));  
                s.setGrade(rs.getString(5));
                return s;  
            }  
        });  
    }

}
