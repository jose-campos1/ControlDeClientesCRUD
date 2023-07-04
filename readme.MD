![arquitectura-spring](https://github.com/jose-campos1/ControlDeClientesCRUD/assets/106594685/f13eba2a-a5df-41ae-ba64-1dda41d35aaf)

# CRUD Sring / MySql

# Index
 * [CRUD Person Service](https://github.com/jose-campos1/ControlDeClientesCRUD/blob/main/src/main/java/vzla/revo/revo/personaService/PersonaService.java)
 * [Service Implementation](https://github.com/jose-campos1/ControlDeClientesCRUD/blob/main/src/main/java/vzla/revo/revo/personaService/PersonaServiceImp.java)
 * [Person Object *Data and Entity notations*](https://github.com/jose-campos1/ControlDeClientesCRUD/blob/main/src/main/java/vzla/revo/revo/persona/Persona.java)
 * [Public interface](https://github.com/jose-campos1/ControlDeClientesCRUD/blob/main/src/main/java/vzla/revo/revo/dao/IPersonaDao.java)
 * [Controller](https://github.com/jose-campos1/ControlDeClientesCRUD/blob/main/src/main/java/vzla/revo/revo/web/ControladorInicio.java)


# Notas

  Hasta aqui hemos manejado en la arquitectura Spring multicapas la capa de presentacion la capa de negocios y la capa de datos:
 * Thymeleaf MVC presentacion de vista es archivo HTML con el modelo de persona que estamos trabajando
 * Spring DI/AOP Negocio conceptos transaccionales
 * Jpa/hibernate Datos con clases de Entidad nos conectamos a traves de JPA a la base de datos de MySQL
 * Con los metodos CRUD
 
