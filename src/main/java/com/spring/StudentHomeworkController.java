package com.spring;


import com.spring.core.StudentHomework;
import com.spring.jdbc.StudentHomeworkJdbc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/list")
public class StudentHomeworkController {

    @RequestMapping(method = RequestMethod.GET,value = "/student")
    public String student(HttpServletRequest request, HttpServletResponse response){


        StudentHomeworkJdbc studenthomework=new StudentHomeworkJdbc();
        List<StudentHomework> list= studenthomework.selectAll();
        request.setAttribute("list",list);

        return "student";
    }

    @RequestMapping(method = RequestMethod.POST,value = "/add")
    public String add(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");

        StudentHomework sh=new StudentHomework();
        StudentHomeworkJdbc studenthomework=new StudentHomeworkJdbc();
        /**
         * 赋值
         **/

        sh.setStuid(Integer.parseInt(request.getParameter("stuid")));
        sh.setHomeworkid(Integer.parseInt(request.getParameter("homeworkid")));
        sh.setHomeworktitle(request.getParameter("homeworktitle"));
        sh.setHomeworkContent(request.getParameter("homeworkContent"));
        studenthomework.add(sh);
        //response.sendRedirect("list");
        System.out.println(Integer.parseInt(request.getParameter("stuid")));

        return "redirect:student";
    }
}
