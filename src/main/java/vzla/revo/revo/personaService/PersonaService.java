package vzla.revo.revo.personaService;

import java.util.List;

import vzla.revo.revo.persona.Persona;


/*CRUD CREATE READ UPDATE DELETE */

public interface PersonaService {

    public List<Persona> listarPersona();
    
    public void guardar(Persona persona);

     public void eliminar(Persona persona);

     public Persona encontrarPersona(Persona persona);


}
