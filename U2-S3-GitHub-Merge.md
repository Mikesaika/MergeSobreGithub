# Actividad Grupal: Manejo de Merge en GitHub (U2-S3)
## Universidad de Guayaquil — Facultad de Ciencias Matemáticas y Físicas
**Carrera:** Software  
**Proyecto Base:** `fishgold` (Sistema de Gestión Pesquera en Java Maven / MySQL)  
**Repositorio Oficial en GitHub:** [https://github.com/Mikesaika/MergeSobreGithub.git](https://github.com/Mikesaika/MergeSobreGithub.git)  
**Rama Base Principal:** `main`  
**Equipo de Trabajo:** 6 Integrantes

---

## 1. Organización del Equipo y Asignación de Ramas (6 Integrantes)

Cada integrante tiene una rama dedicada ya creada en el repositorio. Para la actividad, enriqueceremos colaborativamente el archivo `README.md` del proyecto `fishgold` y documentaremos los módulos del sistema.

| # | Integrante | Rama Creada | Módulo / Sección Asignada | Rol en la Demostración |
| :-: | :--- | :--- | :--- | :--- |
| **1** | **Castro** | `feature/castro` | **Descripción General y Arquitectura**<br>Encabezado del sistema, arquitectura MVC y resumen. | Merge Limpio (Paso Inicial) |
| **2** | **Martínez** | `feature/martinez` | **Requisitos y Dependencias del Entorno**<br>Versiones de Java JDK, Maven, conector MySQL JDBC. | Merge Limpio |
| **3** | **Merchán** | `feature/merchan` | **Base de Datos y Persistencia**<br>Explicación de `database.sql` y `database_migracion.sql`. | Merge Limpio |
| **4** | **Núñez** | `feature/nunez` | **Módulo de Faenas y Liquidación de Capturas**<br>Control de salidas marítimas y cálculo salarial. | Merge Limpio |
| **5** | **Orrala** | `feature/orrala` | **Guía de Instalación y Ejecución**<br>Pasos para clonar, compilar y ejecutar con `mvn`. | Merge Limpio |
| **6** | **Reyes** | `feature/reyes` | **Configuración, Usuarios y Conflicto Intencional**<br>Edita la cabecera y añade seguridad/roles. | **Generación y Resolución de Conflicto** |

---

## 2. Contenido Exacto a Añadir por Cada Integrante

### Integrante 1: Castro (`feature/castro`)
Edita `README.md` y añade la introducción y arquitectura:
```markdown
# Sistema de Gestión Pesquera Fishgold

## 1. Descripción del Proyecto
Fishgold es una aplicación empresarial de escritorio desarrollada en Java con persistencia en MySQL, diseñada para automatizar el control de faenas pesqueras, la asistencia de tripulación y el cálculo de liquidaciones por captura marítima.

## 2. Arquitectura de Software
El sistema sigue el patrón de diseño Modelo-Vista-Controlador (MVC):
- **Modelos (DAO):** Gestión de entidades y persistencia (`TrabajadorDAO`, `LiquidacionCapturaDAO`, `FaenaAsistenciaDAO`).
- **Controladores:** Lógica de negocio y validación (`LoginController`, `LiquidacionCapturaController`).
- **Vistas:** Interfaz gráfica basada en Java Swing (`MainView`, `DashboardPanel`).
```

---

### Integrante 2: Martínez (`feature/martinez`)
Edita `README.md` añadiendo los requisitos técnicos:
```markdown
## 3. Requisitos del Entorno de Desarrollo
Para compilar y ejecutar Fishgold se requiere:
- **Java Development Kit (JDK):** Versión 17 o 21 LTS recomendada.
- **Apache Maven:** 3.8.0 o superior.
- **Motor de Base de Datos:** MySQL Server 8.0 o MariaDB 10.5+.
- **Driver de Conexión:** `mysql-connector-j` versión 8.3.0 (gestionado vía `pom.xml`).
```

---

### Integrante 3: Merchán (`feature/merchan`)
Edita `README.md` documentando la base de datos:
```markdown
## 4. Estructura de la Base de Datos
El proyecto cuenta con scripts DDL/DML incluidos en la raíz:
- `database.sql`: Crea el esquema relacional inicial con tablas de trabajadores, usuarios, barcos y faenas.
- `database_migracion.sql`: Modificaciones estructurales y campos de auditoría para liquidaciones históricas.
```

---

### Integrante 4: Núñez (`feature/nunez`)
Edita `README.md` documentando las operaciones de pesca:
```markdown
## 5. Módulos Operativos Principales
- **Control de Trabajadores:** Registro de pescadores, cargos a bordo y datos personales.
- **Asistencia y Faenas:** Registro de embarques, fechas de zarpe y retorno de naves.
- **Liquidación de Capturas:** Cálculo automático de ingresos brutos por especie marina y descuentos salariales.
- **Dashboard Estadístico:** Visualización de métricas de captura mensual y eficiencia operativa.
```

---

### Integrante 5: Orrala (`feature/orrala`)
Edita `README.md` añadiendo la guía de arranque:
```markdown
## 6. Guía de Instalación y Ejecución Local
1. Clonar el repositorio oficial:
   ```bash
   git clone https://github.com/Mikesaika/MergeSobreGithub.git
   cd MergeSobreGithub
   ```
2. Importar el script `database.sql` en MySQL Workbench o CLI.
3. Configurar credenciales en `src/main/java/com/mycompany/fishgold/util/DatabaseConnection.java`.
4. Compilar y ejecutar la aplicación:
   ```bash
   mvn clean compile exec:java
   ```
```

---

### Integrante 6: Reyes (`feature/reyes`) — **GENERADOR DEL CONFLICTO**
> [!WARNING]
> Para generar el conflicto exigido en la rúbrica, Reyes modifica el encabezado principal del archivo (la misma sección que modificó Castro):

```markdown
# Fishgold Software - Plataforma de Automatización Marítima y Pesca

## 1. Descripción de la Plataforma
Sistema centralizado para naves industriales y artesanales con gestión de roles administrativos y marineros.

## 7. Módulo de Seguridad y Usuarios
- Autenticación segura de administradores, supervisores y operadores de muelle.
- Encriptación de contraseñas y permisos granulares de liquidación.
```

---

## 3. Protocolo de Ejecución: Commits, Pull Requests y Resolución de Conflictos

### Fase A: Commits y Subida de Cada Rama
Cada integrante realiza en su rama:
```bash
git checkout feature/[apellido]
# Editar README.md con la sección asignada
git add README.md
git commit -m "docs([apellido]): documentar modulo correspondiente en README"
git push origin feature/[apellido]
```

---

### Fase B: Apertura de Pull Requests en GitHub
En [https://github.com/Mikesaika/MergeSobreGithub/pulls](https://github.com/Mikesaika/MergeSobreGithub/pulls), se abren los 6 Pull Requests hacia `main`:
1. `feature/castro` $\rightarrow$ `main`
2. `feature/martinez` $\rightarrow$ `main`
3. `feature/merchan` $\rightarrow$ `main`
4. `feature/nunez` $\rightarrow$ `main`
5. `feature/orrala` $\rightarrow$ `main`
6. `feature/reyes` $\rightarrow$ `main`

---

### Fase C: Secuencia de Merges y Demostración del Conflicto

1. **Aprobación de los primeros 5 PRs (Merge Limpio):**
   - Aprobar y fusionar uno por uno los PRs de Castro, Martínez, Merchán, Núñez y Orrala.
   - En GitHub cada uno mostrará: *"This branch has no conflicts with the base branch"* $\rightarrow$ Hacer clic en **Confirm merge**.

2. **Detección del Conflicto en el PR 6 (Reyes):**
   - Al abrir el PR de **Reyes** (`feature/reyes`), GitHub detectará que Castro ya integró cambios en la sección `# Sistema de Gestión Pesquera Fishgold`.
   - Aparecerá el aviso:
     > **"This branch has conflicts that must be resolved"**.

3. **Resolución del Conflicto (Punto clave de la calificación):**
   - Hacer clic en el botón **Resolve conflicts** en GitHub.
   - GitHub resaltará el conflicto:
     ```text
     <<<<<<< feature/reyes
     # Fishgold Software - Plataforma de Automatización Marítima y Pesca
     =======
     # Sistema de Gestión Pesquera Fishgold
     >>>>>>> main
     ```
   - Explicar en el video que se unifican ambos aportes: se conserva el título completo y se añade la sección de seguridad de Reyes al final del archivo.
   - Eliminar los delimitadores (`<<<<<<<`, `=======`, `>>>>>>>`).
   - Hacer clic en **Mark as resolved** $\rightarrow$ **Commit merge**.
   - Presionar **Merge pull request** y **Confirm merge**.

---

### Fase D: Sincronización Local Final
Todos los integrantes actualizan su copia local:
```bash
git checkout main
git pull origin main
```
Comprobar que el `README.md` final contiene los aportes de los 6 integrantes consolidados.

---

## 4. Guion Cronológico para la Grabación del Video (3 a 5 minutos)

| Tiempo | Integrante(s) | Contenido en Pantalla | Diálogo / Explicación |
| :---: | :--- | :--- | :--- |
| **0:00 - 0:40** | **Castro / Todo el Grupo** | Portada del video y repositorio en GitHub | Presentación del grupo de 6 estudiantes, carrera de Software, Universidad de Guayaquil, y objetivo de la práctica: trabajo colaborativo con ramas, PRs y resolución de conflictos. |
| **0:40 - 1:30** | **Castro, Martínez, Merchán** | Terminal / Visual Studio Code | Muestran las ramas creadas (`feature/castro`, `feature/martinez`, `feature/merchan`) y los commits realizados en el `README.md`. |
| **1:30 - 2:15** | **Núñez, Orrala** | Terminal y pestaña Pull Requests | Muestran sus ramas (`feature/nunez`, `feature/orrala`) y la apertura de los Pull Requests hacia `main` en GitHub. |
| **2:15 - 3:00** | **Martínez / Castro** | Pestaña Pull Requests de GitHub | Aprobación y merge de las primeras ramas demostrando cómo se integran sin conflictos. |
| **3:00 - 4:15** | **Reyes / Todo el equipo** | **Pantalla de Resolución de Conflictos** | **Momento Cumbre:** Muestran el conflicto en el PR de Reyes. Explican qué líneas colisionaron, por qué ocurrió el conflicto y cómo se resuelve unificando aportes. Confirman el merge. |
| **4:15 - 5:00** | **Líder / Grupo** | Terminal (`git pull`) e Insights > Network | Muestran la actualización local final en la terminal y el gráfico de ramas y merges en GitHub Network. Conclusiones y cierre. |

---

## 5. Rúbrica de Evaluación
- **Correcta aplicación de conceptos de GitHub (50%):** Ramas independientes, PRs bien documentados, conflicto intencional y resolución limpia.
- **Calidad de la explicación en el video (30%):** Buena dicción, fluidez y demostración visual clara en 3-5 minutos.
- **Trabajo colaborativo demostrado (20%):** Participación coordinada de los 6 integrantes.
