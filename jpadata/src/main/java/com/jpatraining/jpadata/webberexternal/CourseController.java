package com.jpatraining.jpadata.webberexternal;

import com.jpatraining.jpadata.webberinternal.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService CS1;

    @RequestMapping ("/Menu/{menuId}/Course")
    public List<Course> allCourses(@PathVariable String menuid){
        return CS1.getallCourses(menuid);
    }

    @RequestMapping("/Menu/{menuId}/Course/{id}")
    public Optional<Course> getCourse(@PathVariable String id){ // noneed to define path
                                                          // variable if it is the same name
        return CS1.getCourse(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/Menu/{menuId}/Course")
    public void addCourse(@RequestBody Course course, @PathVariable String menuId){
        course.setMenu(new Menu(menuId, "", ""));
        CS1.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Menu/{menuId}/Course/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String menuId, @PathVariable String id){
        course.setMenu(new Menu(menuId, "", ""));
        CS1.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/Menu/{menuId}/Course/{id}")
    public void deleteCourse(@PathVariable String id){
        CS1.deleteCourse(id);
    }

}
