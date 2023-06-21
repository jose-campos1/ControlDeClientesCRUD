/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josea
 */

package vzla.revo.revo.dao;

import org.springframework.data.repository.CrudRepository;
import vzla.revo.revo.persona.Persona;


public interface IPersonaDao extends CrudRepository<Persona, Long> {
        
}
