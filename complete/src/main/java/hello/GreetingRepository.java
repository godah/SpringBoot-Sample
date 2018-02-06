/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author luciano
 */
public interface GreetingRepository extends CrudRepository<Greeting, Serializable>{
    
}
