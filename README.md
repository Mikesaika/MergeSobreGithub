# MergeSobreGithub

## Descripción del Proyecto (`fishgold`)

**Fishgold** es una aplicación de escritorio en **Java** (interfaz gráfica **Swing** y gestión de dependencias con **Maven**) bajo el patrón arquitectónico **MVC + DAO** con persistencia en **MySQL** (`fishgold_db`). Su propósito es centralizar la operación de faenas pesqueras: desde la planificación de viajes y el control de asistencia de la tripulación hasta la liquidación económica de las capturas.

### Tecnologías y Requisitos

- **Lenguaje:** Java (configurado con `maven.compiler.release` `25` en `pom.xml`)
- **Construcción:** Apache Maven
- **Interfaz Gráfica:** Java Swing (`javax.swing`)
- **Base de Datos:** MySQL (`mysql-connector-j` `8.3.0`)

### Módulos Principales

- **Autenticación y Control de Acceso:** Inicio de sesión con roles de usuario (`Administrador`, `Capitan`, `Digitador`) sobre la tabla `usuarios`.
- **Dashboard:** Vista general con indicadores y métricas operativas del sistema (`DashboardController`, `DashboardPanel`).
- **Gestión de Trabajadores:** Registro y administración de personal y tripulación (`trabajadores`, `TrabajadorController`).
- **Planificación de Faenas:** Programación de viajes por embarcación, destino/ruta, fecha de salida y meta de peso en kg (`planificaciones`, `PlanificacionController`).
- **Asistencia en Faena:** Control de asistencia de trabajadores por viaje (`Presente`, `Ausente`, `Justificado` en `faena_asistencia`).
- **Liquidación de Capturas:** Registro del peso total capturado y cálculo del monto final al cierre de cada viaje (`liquidacion_captura`, `LiquidacionCalculo`).
- **Configuración de Pago:** Parámetro central del precio base por kilogramo (`configuracion_pago`, `ConfiguracionController`).

### Estructura Básica y Base de Datos

- `src/main/java/com/mycompany/fishgold/`: Punto de entrada (`Fishgold.java`), paquetes `controllers`, `models`, `views` y `util`.
- `database.sql`: Script de creación de la base de datos `fishgold_db`, tablas e inserción de datos iniciales.
- `database_migracion.sql`: Script de migración incremental sobre una instancia existente de `fishgold_db`.

### Compilación rápida

```bash
mvn clean compile
```
