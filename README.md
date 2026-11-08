# MMEYact1_t4 - Mi primer proyecto con Spring Boot

Proyecto de la Actividad 1 del Tema 4. Es una API sencilla hecha con Java 21 y Spring Boot (Spring Web), siguiendo los videos 1 al 7 del curso.

**Alumno:** Mendoza Martínez Eduardo Yael

## Proyecto en el VPS
Corre en el puerto **8082**: http://194.195.86.95:8082/nombre

## Controladores y endpoints

| Controlador | Endpoint | Qué regresa | Link |
|---|---|---|---|
| MiInfoController | `/nombre` | Texto con mi nombre e iniciales | http://194.195.86.95:8082/nombre |
| MiInfoController | `/materias` | Lista de mis materias (JSON) | http://194.195.86.95:8082/materias |
| MiInfoController | `/materias/total` | Número de materias | http://194.195.86.95:8082/materias/total |
| EjemploRestController | `/detalles_info2` | Objeto con datos del servidor (JSON) | http://194.195.86.95:8082/detalles_info2 |
| EjemploController | `/detalles_info` | Página HTML con datos del servidor | http://194.195.86.95:8082/detalles_info |

## Cómo correrlo en tu compu
    ./mvnw spring-boot:run

Luego abre http://localhost:8082/nombre

## Cómo generar el .jar
    ./mvnw clean package

El archivo queda en `target/mmeyact1_t4-0.0.1-SNAPSHOT.jar`.