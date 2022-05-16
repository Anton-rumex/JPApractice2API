package com.jpatraining.jpadata.webberexternal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;



//    static List<Menu> topics = new ArrayList<>( Arrays.asList(
//            new Menu("spring","Spring Framework", "Spring Framework Description"),
//                new Menu("java","Core Java", "Core Java Description"),
//                new Menu("javascript","Javascript", "Javascript Description")
//
//        ));

        public List<Course> getallCourses( String menuId) {
//        return topics;
            List<Course> courses = new ArrayList<>();

            courseRepository.findByMenuId(menuId)
                    .forEach(courses::add);
            return courses;
        }
    public Optional<Course> getCourse(String id){
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return courseRepository.findById(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }


    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
            courseRepository.deleteById(id);

    }
}

