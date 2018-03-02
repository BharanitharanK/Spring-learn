package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.student.model.Student;
import com.student.service.StudDao;
@Controller
@Service
public class studController {

    @Autowired
    private StudDao dao;

    @RequestMapping(value = "/stdform")
    public ModelAndView stdform() {
        return new ModelAndView("stdform", "command", new Student());
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("student") Student student) {
        dao.save(student);
        return new ModelAndView("redirect:/viewform");
    }

    @RequestMapping(value = "/viewform")
    public ModelAndView viewAll() {
        List<Student> list = dao.viewAll();
        return new ModelAndView("viewform", "list", list);
    }
}
