package com.jpatraining.jpadata.webberexternal;

import com.jpatraining.jpadata.webberinternal.Menu;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {

    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private Menu menu;


    public Course() {

    }

    public Course(String id, String name, String description, String menuId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.menu = new Menu(menuId,"","");
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
