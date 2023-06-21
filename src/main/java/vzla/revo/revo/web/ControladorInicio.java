/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vzla.revo.revo.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import vzla.revo.revo.persona.Persona;
import vzla.revo.revo.personaService.PersonaService;

/**
 *
 * @author josea
 */

@Controller
@Slf4j
public class ControladorInicio {
       
        @Autowired
        private PersonaService personaService;
        
        @GetMapping("/")
       public String inicio(Model model){
           var personas = personaService.listarPersona();
           log.info("Ejecutando controlador Spring MVC!!");
           model.addAttribute("personas",personas);
           return "index";
       }

       @GetMapping("/agregar")
       public String agregarPersona(Persona persona){
            return "modificar";
       }

       /* Aca se aplica el metodo post que guarda el objeto persona con los datos que se han proporcionado en modificar */

       @PostMapping("/guardar")
       public String guardar(Persona persona){
        personaService.guardar(persona);
        return "redirect:/";
       }

       /*Hasta aca tenemos todo el flujo para agregar un objeto de tipo persona ⬆ */

       /*Aca estamos pasando el path variable que debe ser el mismo objeto que estamos inicializando y se regresa un mismo objeto de tipo persona por lo que utilizamnos el mismo y no creamos otra variable ej: persona = personaService, sin embargo al modificar este objeto se guardara como uno nuevo porque no hemos especificado el ID de las personas  */

       @GetMapping("/editar/{idPersona}")
       public String editar(Persona persona, Model model){
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona",persona);
        return "modificar";
       }

       /*   En el delete estamos utilizando query params por lo que no es necesario colocar el idPersona en el Get */
       @GetMapping("/eliminar")
       public String eliminar(Persona persona){
        personaService.eliminar(persona);
        return "redirect:/";
       }

}

/*Hasta aqui hemos manejado en la arquitectura Spring multicapas la capa de presentacion la capa de negocios y la capa de datos:
 * Thymeleaf MVC presentacion de vista es archivo HTML con el modelo de persona que estamos trabajando
 * Spring DI/AOP Negocio conceptos transaccionales
 * Jpa/hibernate Datos con clases de Entidad nos conectamos a traves de JPA a la base de datos de MySQL
 * Con los metodos CRUD
 */
