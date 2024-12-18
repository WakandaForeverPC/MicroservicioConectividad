# Microservicio de Conectividad (no implementada lógica)

## Descripción

Este proyecto es un microservicio de conectividad desarrollado con Spring Boot. Su objetivo es proporcionar servicios relacionados con la conectividad, como obtener y crear información de conectividad. El microservicio se registra en un servidor Eureka y utiliza un servidor de configuración para gestionar sus propiedades.

## Estructura del Proyecto

### `MicroservicioConectividadApplication.java`

Esta es la clase principal del microservicio. Contiene el método `main` que inicia la aplicación Spring Boot.

### `ConectividadController.java`

Este controlador maneja las solicitudes HTTP relacionadas con la conectividad.

- **`@GetMapping`**: Maneja las solicitudes GET para obtener información de conectividad.
- **`@PostMapping`**: Maneja las solicitudes POST para crear nueva información de conectividad.

### `application.properties`

Este archivo contiene la configuración de la aplicación, incluyendo el nombre del servicio, el puerto del servidor, la URL del servidor Eureka y la configuración de Prometheus.

### `pom.xml`

Este archivo define las dependencias y plugins necesarios para construir y ejecutar el proyecto. Incluye dependencias para Spring Boot, Spring Cloud, Eureka Client, Spring Boot DevTools, y Prometheus.

### `index.html`

Este archivo HTML es una plantilla básica que puede ser utilizada para la interfaz de usuario del microservicio.

### `HELP.md`

Este archivo proporciona documentación adicional y enlaces a recursos útiles para trabajar con el proyecto, como la documentación de Maven y Spring Boot.

## Dependencias

- **Spring Boot Starter Web**: Para construir aplicaciones web RESTful.
- **Spring Cloud Netflix Eureka Client**: Para el registro y descubrimiento de servicios.
- **Spring Cloud Config**: Para la configuración centralizada.
- **Spring Boot DevTools**: Para el desarrollo rápido.
- **Spring Boot Starter Test**: Para pruebas unitarias y de integración.
- **Micrometer Registry Prometheus**: Para la monitorización y métricas.
- **Spring Boot Starter Actuator**: Para exponer información operativa sobre la aplicación.

## Configuración

- **`spring.application.name`**: Nombre del microservicio.
- **`server.port`**: Puerto en el que se ejecuta el servidor.
- **`eureka.client.service-url.defaultZone`**: URL del servidor Eureka.
- **`spring.cloud.config.uri`**: URL del servidor de configuración.
- **`management.endpoints.web.exposure.include`**: Endpoints expuestos para Prometheus, health e info.
- **`management.endpoint.prometheus.enabled`**: Habilita el endpoint de Prometheus.

## Ejecución

Para ejecutar el microservicio, utiliza el siguiente comando de Maven:

```sh
mvn spring-boot:run
