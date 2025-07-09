# Módulo de Inventario

Este proyecto es un sistema de gestión de inventario desarrollado con **Spring Boot** y **Gradle**. A continuación, te proporcionamos las instrucciones para compilar y ejecutar el proyecto.

## Requisitos

Antes de comenzar, asegúrate de tener lo siguiente instalado:

- **Java 21** o superior.
- **Gradle**.
- **IntelliJ IDEA** o cualquier otro editor compatible con proyectos Java.

## Pasos para una ejecución correcta:

1. En la raíz del proyecto, ejecuta el siguiente comando para limpiar cualquier archivo anterior y descargar todas las dependencias necesarias:
gradlew.bat clean build --refresh-dependencies

2. Para compilar el proyecto, ejecuta el siguiente comando:
gradlew build       

3. Una vez que el proyecto haya sido compilado correctamente, puedes ejecutar la aplicación con el siguiente comando:
gradlew.bat bootRun


Este comando iniciará el servidor de Spring Boot en el puerto predeterminado (generalmente http://localhost:8080).
