CRUD de Estudiantes con Java Spring Boot

Este proyecto es un CRUD de estudiantes desarrollado utilizando Java Spring Boot. El objetivo principal es crear una aplicación que permita realizar todas las operaciones básicas de un CRUD (Create, Read, Update, Delete) en una base de datos para gestionar información de estudiantes.


Características principales

Utiliza Java Spring Boot para facilitar la configuración y el desarrollo rápido de la aplicación.
Utiliza Java Persistence API (JPA) para interactuar con la base de datos y realizar operaciones CRUD.
Implementa el patrón de diseño de inyección de dependencias para mantener un código modular y de fácil mantenimiento.
Sigue los principios de la programación orientada a objetos (POO) para mantener un código limpio y estructurado.
Utiliza anotaciones para configurar las rutas y controladores del modelo-vista-controlador (MVC) en la aplicación.

Requisitos

Java JDK 8 o superior instalado en el sistema.
Maven instalado en el sistema para gestionar las dependencias y compilar el proyecto.
Una base de datos compatible con JPA configurada en el archivo application.properties.

Instalación y configuración

Clona el repositorio de GitHub en tu máquina local.
Abre el proyecto en tu IDE de preferencia.
Configura las propiedades de la base de datos en el archivo application.properties.
Ejecuta mvn clean install para compilar y construir el proyecto.
Ejecuta mvn spring-boot:run para iniciar la aplicación.

Uso

Una vez que la aplicación se haya iniciado correctamente, podrás acceder a las siguientes rutas para interactuar con el CRUD de estudiantes:


GET /estudiantes: Obtiene todos los estudiantes.
GET /estudiantes/{id}: Obtiene un estudiante específico por su ID.
POST /estudiantes: Crea un nuevo estudiante.
PUT /estudiantes/{id}: Actualiza un estudiante existente por su ID.
DELETE /estudiantes/{id}: Elimina un estudiante existente por su ID.

Asegúrate de utilizar un cliente REST, como Postman, para realizar las solicitudes a la API.
