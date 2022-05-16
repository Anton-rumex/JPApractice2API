package com.jpatraining.jpadata.webberinternal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class web1controller {

    @Autowired
    private webService WS1;

    @RequestMapping ("/Menu")
    public List<Menu> alltopics(){
        return WS1.getallTopics();
    }

    @RequestMapping("/Menu/{num}")
    public Optional<Menu> getMenu(@PathVariable("num") String id){ // noneed to define path
                                                          // variable if it is the same name
        return WS1.getMenu(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/Menu")
    public void addMenu(@RequestBody Menu topic){
        WS1.addtopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Menu/{id}")
    public void updateMenu(@RequestBody Menu topic, @PathVariable String id){
        WS1.updatetopic(topic,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/Menu/{id}")
    public void deleteMenu(@PathVariable String id){
        WS1.deleteMenu(id);
    }

}
