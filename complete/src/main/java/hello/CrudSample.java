/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.ArrayList;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author luciano
 */
@RestController
@RequestMapping("/crudsample")
public class CrudSample {
    
    @Autowired
    private GreetingRepository greetingRepository;
    
  
    @RequestMapping(value = "/list/", method = RequestMethod.GET)
    public @ResponseBody Iterable<Greeting> listAllUsers() {
        Greeting g = new Greeting();
        g.setContent("Teste");
        greetingRepository.save(g);
        return greetingRepository.findAll();
    }
    
    
    
    
    
}
