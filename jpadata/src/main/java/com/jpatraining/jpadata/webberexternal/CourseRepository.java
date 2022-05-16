package com.jpatraining.jpadata.webberexternal;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByMenuId(String menuId);


}
