# JPA-2-Relacionar-2-tablas
relacionamos dos tablas con las anotaciones @OneToMay y @ManyToOne


RELACION DE UNO A MUCHOS, UN EMPLEADO MUCHOS TELEFONOS *** ejemplos de peticiones HTTP *** :

Crear un Teléfono,  (que incluya el id del Empleado):

POST http://localhost:8080/telefonos

Ejemplo JSON para crear un teléfono:
{
    "numero": "123456789",

}


Crear un empleado con teléfonos (POST a /empleados):


POST http://localhost:8080/empleados


{
  "nombreEmpleado": “pepita perez”,
  "direccion": "Av. Nunca Jamas 45",
  "edad": 27,
  "puesto": “Scrum manager”,
  "telefonos": [
    {
      "numero": "555123456"
    },
    {
      "numero": "885987654"
    }
  ]
}


*** desde WorkBench: ***


Consulta completa con JOIN para mostrar empleados con sus telefonos agrupados:

SELECT 
  empleado.nombre AS nombre,
  GROUP_CONCAT(telefono.numero SEPARATOR ', ') AS telefonos
FROM empleado
JOIN telefono ON telefono.empleado_id = empleado.id
GROUP BY empleado.id;



Simplificada (sin teléfonos agrupados):

SELECT 
  empleado.nombre, 
  telefono.numero
FROM empleado
JOIN telefono ON telefono.empleado_id = empleado.id;
