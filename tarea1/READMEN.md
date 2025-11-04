# Mi Primer Proyecto Spring Boot

## Información del Proyecto

- **Nombre:** demo1
- **Versión de Spring Boot:** 3.5.6
- **Java:** 17
- **Build Tool:** Maven

## Estructura del Proyecto

Explica brevemente cada directorio/archivo:

### src/main/java/dev/mmiranda/demo1/
- `PrimerSpringApplication.java`: Este es el archivo principal que arranca la aplicación Spring Boot. Contiene el método `main` que invoca `SpringApplication.run(...)` para inicializar el contexto de Spring y levantar el servidor embebido.

### src/main/resources/
- `application.properties`: Contiene la configuración de la aplicación, como el puerto del servidor, las credenciales de la base de datos, el nivel de logging y otras propiedades necesarias para ejecutar la aplicación correctamente.

### src/test/
- Contiene los tests unitarios e integrados de la aplicación. Aquí se crean pruebas automáticas para verificar que los componentes de la aplicación funcionan como se espera.

### pom.xml
- Archivo de configuración de Maven. Define las dependencias, plugins y propiedades del proyecto. Permite compilar, construir y ejecutar la aplicación, además de manejar las versiones de librerías externas.

### target/
- Directorio generado por Maven donde se almacenan los archivos compilados, empaquetados y listos para ejecutar, como `.jar` o `.war`. Este directorio se crea automáticamente al construir el proyecto.

## Cómo Ejecutar

```bash
mvn spring-boot:run
Este comando compila el proyecto y arranca la aplicación Spring Boot en el puerto configurado (por defecto 8080).

Dependencias Principales
Lista las dependencias en pom.xml y explica brevemente cada una:

spring-boot-starter-web: Proporciona todas las dependencias necesarias para crear aplicaciones web, incluyendo el servidor embebido Tomcat y Spring MVC para manejar peticiones HTTP.

spring-boot-starter-test: Incluye librerías necesarias para realizar pruebas unitarias y de integración, como JUnit, Mockito y AssertJ.

Conceptos Aprendidos
¿Qué es Spring Boot?
Es un framework que simplifica la creación de aplicaciones Java. Permite iniciar proyectos rápidamente, con configuración automática de dependencias y un servidor embebido listo para servir aplicaciones web o microservicios.

¿Qué es Maven?
Es una herramienta de construcción y gestión de dependencias para proyectos Java. Permite compilar, ejecutar pruebas, empaquetar la aplicación y manejar versiones de librerías de manera centralizada.

¿Qué significa "Tomcat started on port 8080"?
Indica que el servidor embebido Tomcat se ha iniciado correctamente y que la aplicación está lista para recibir peticiones HTTP en el puerto 8080.

¿Para qué sirve la anotación @SpringBootApplication?
Marca la clase principal de la aplicación Spring Boot. Activa la configuración automática de Spring, escanea los componentes del proyecto y permite arrancar la aplicación desde el método main.

Autor
Monica Miranda Ari - Curso Spring Boot & Kafka
