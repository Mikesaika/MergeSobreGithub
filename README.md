# FishGold - Sistema de Gestión Pesquera

Proyecto grupal desarrollado en Java (Swing + MySQL + Maven) para el control de trabajadores, planificación de faenas, asistencia y liquidación de capturas pesqueras.

## Requisitos del entorno

- **Java:** JDK 25 (`maven.compiler.release=25`)
- **Apache Maven:** 3.9.x
- **Base de datos:** MySQL 8.x (script inicial en `database.sql` y migración en `database_migracion.sql`)

## Configuración de base de datos

1. Crear la base de datos e importar `database.sql`.
2. Verificar los parámetros de conexión en `src/main/java/com/mycompany/fishgold/util/DatabaseConnection.java` (`fishgold_db`, usuario y contraseña locales).

## Comandos Maven (Compilación, Pruebas y Empaquetado)

```powershell
# Compilar el proyecto
mvn clean compile

# Ejecutar pruebas unitarias (JUnit 5)
mvn test

# Generar JAR ejecutable con dependencias (fat-JAR)
mvn clean package
```

El artefacto ejecutable se genera en `target/fishgold-1.0-SNAPSHOT.jar` y puede ejecutarse con:

```powershell
java -jar target/fishgold-1.0-SNAPSHOT.jar
```

## Integración y Despliegue Continuo (Jenkins)

El repositorio incluye un `Jenkinsfile` en la raíz con las siguientes etapas:

1. **Build:** Compilación del código fuente con Maven (`mvn clean compile`).
2. **Test:** Ejecución de pruebas unitarias con JUnit 5 (`mvn test`) y recolección de reportes Surefire.
3. **Deploy:** Empaquetado del JAR ejecutable (`mvn package -DskipTests`) y despliegue en el entorno de prueba local (`deploy_env/fishgold.jar`).
4. **Post-acciones:** Archivado de artefactos y plantilla lista para notificaciones por correo/Slack.
