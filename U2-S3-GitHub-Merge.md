# Actividad Grupal: Manejo de Merge en GitHub (U2-S3)
## Universidad de Guayaquil — Facultad de Ciencias Matemáticas y Físicas
**Carrera:** Software  
**Proyecto Asignado:** `fishgold`  
**Repositorio GitHub:** [https://github.com/Mikesaika/fishgold.git](https://github.com/Mikesaika/fishgold.git)  
**Rama Base Principal:** `master`  
**Estado:** Documento de Contexto y Guía Operativa de Ejecución

---

## 1. Contexto del Proyecto `fishgold`

`fishgold` es un sistema de escritorio desarrollado en **Java (Maven)** con arquitectura MVC y persistencia en **MySQL**. Sus módulos principales comprenden:
- **Gestión de Personal:** Registro y control de trabajadores (`TrabajadorDAO`, `TrabajadorController`).
- **Control de Faenas:** Asistencia y registros de salida/retorno de faenas pesqueras (`FaenaAsistencia`).
- **Liquidación de Capturas:** Cálculo y balance financiero de las capturas pesqueras (`LiquidacionCaptura`, `LiquidacionCalculo`).
- **Dashboard y Configuración:** Métricas operativas, control de acceso de usuarios y parámetros del sistema.

Este repositorio servirá como entorno real para aplicar el control de versiones colaborativo, ramificación (*branching*), creación de Pull Requests (PRs), simulación de conflictos y ejecución de *merge*.

---

## 2. Organización del Equipo y Ramas

Cada integrante del equipo trabajará sobre una rama derivada directamente de `master`.

| Integrante | Rol / Módulo Asignado | Rama Feature | Archivo Objetivo de Modificación |
| :--- | :--- | :--- | :--- |
| **Integrante 1 (Líder / Miken)** | Documentación General & Arquitectura | `feature/miken` | `README.md` (Sección Descripción y Arquitectura) |
| **Integrante 2** | Guía de Instalación y Requisitos BD | `feature/integrante-2` | `README.md` (Sección Instalación y Base de Datos) |
| **Integrante 3 (Opcional)** | Módulos del Sistema y Guía de Uso | `feature/integrante-3` | `README.md` (Sección Módulos y Funcionalidades) |

> **Nota:** Para el ejercicio de resolución de conflictos, los integrantes modificarán de forma concurrente el archivo `README.md` en secciones compartidas para provocar y resolver el conflicto de forma controlada.

---

## 3. Protocolo Operativo Paso a Paso (Órdenes de Ejecución)

> [!IMPORTANT]
> Estas órdenes deben ejecutarse en el orden indicado cuando se inicie la actividad práctica.

### Paso 1: Verificación y Sincronización del Repositorio Local

1. Abrir la terminal o invocar el MCP en la raíz de `fishgold`:
   ```bash
   cd fishgold
   ```
2. Comprobar el estado y asegurar que la rama local esté en `master` y actualizada:
   ```bash
   git status
   git checkout master
   git pull origin master
   ```

---

### Paso 2: Creación de Ramas de Trabajo Individuales

Cada integrante crea y conmuta a su rama personal:
- **Integrante 1:**
  ```bash
  git checkout -b feature/miken
  ```
- **Integrante 2:**
  ```bash
  git checkout -b feature/integrante-2
  ```

---

### Paso 3: Realización de Cambios y Commits

1. Crear o editar el archivo `README.md` en la raíz de `fishgold` con la documentación del proyecto.
2. Cada integrante añade la información correspondiente a su sección asignada.
3. Registrar los cambios localmente con mensajes descriptivos:
   ```bash
   git add README.md
   git commit -m "docs: agregar documentacion del proyecto fishgold y arquitectura"
   ```

---

### Paso 4: Publicación de Ramas y Creación de Pull Requests (PR)

1. Subir la rama local al repositorio remoto en GitHub:
   ```bash
   git push origin feature/[NOMBRE]
   ```
   *(Ejemplo: `git push origin feature/miken`)*
2. Ir a GitHub ([https://github.com/Mikesaika/fishgold](https://github.com/Mikesaika/fishgold)).
3. Crear un **Pull Request (PR)**:
   - **Base:** `master`
   - **Compare:** `feature/[NOMBRE]`
   - Título y descripción clara detallando los cambios introducidos.

---

### Paso 5: Revisión, Simulación de Conflicto y Resolución de Merge

1. **Primer Merge (Limpio):**
   - El equipo revisa el PR del **Integrante 1** (`feature/miken`).
   - Se aprueba y se realiza el merge a `master` en GitHub (*Merge Pull Request* -> *Confirm merge*).

2. **Aparición del Conflicto:**
   - El **Integrante 2** actualiza su PR (`feature/integrante-2`).
   - GitHub detectará que existen modificaciones conflictivas en las mismas líneas del `README.md` y mostrará: *"This branch has conflicts that must be resolved"*.

3. **Resolución del Conflicto:**
   - **Opción A (Desde GitHub):** Utilizar el botón **Resolve conflicts**, combinar el contenido de ambos integrantes, eliminar los marcadores (`<<<<<<<`, `=======`, `>>>>>>>`), y marcar como resuelto.
   - **Opción B (Desde Local con Git / MCP):**
     ```bash
     git checkout feature/integrante-2
     git pull origin master
     # Editar README.md y resolver manualmente los marcadores de conflicto
     git add README.md
     git commit -m "fix(merge): resolver conflictos con la rama master"
     git push origin feature/integrante-2
     ```
4. Completar y aprobar el Merge final del segundo PR.

---

### Paso 6: Verificación Final y Cierre

1. Todos los integrantes actualizan su repositorio local con la rama `master` integrada:
   ```bash
   git checkout master
   git pull origin master
   ```
2. Comprobar que el `README.md` contiene la versión final unificada y que el proyecto compila correctamente:
   ```bash
   mvn clean compile
   ```

---

## 4. Requisitos del Entregable y Guion del Video (3 a 5 minutos)

El entregable final consta del enlace al repositorio y un video en YouTube demostrando el proceso:

### Estructura de Grabación del Video:
1. **0:00 - 0:45 | Introducción:** Presentación de los integrantes, materia, proyecto `fishgold` y objetivo de la práctica.
2. **0:45 - 1:45 | Creación de Ramas y Commits:** Mostrar en terminal/VS Code la creación de ramas (`feature/...`) y los commits realizados.
3. **1:45 - 2:30 | Apertura de Pull Requests:** Mostrar en GitHub los PRs abiertos por los participantes.
4. **2:30 - 3:45 | Demostración y Resolución de Conflictos:** Mostrar el conflicto detectado en GitHub, la explicación de por qué ocurrió y cómo se resolvió (conservando los aportes de ambos).
5. **3:45 - 4:30 | Verificación y Cierre:** Mostrar el historial de commits en GitHub con los merges realizados y la actualización local con `git pull origin master`.

### Criterios de Evaluación:
- **Correcta aplicación de conceptos de GitHub (50%):** Manejo de ramas, PRs, resolución de conflictos y merge.
- **Calidad de la explicación en el video (30%):** Claridad, concisión y fluidez en la demostración.
- **Trabajo colaborativo demostrado (20%):** Participación activa de los integrantes.

---

## 5. Arquitectura del MCP de Git para este Proyecto

Para que el asistente Antigravity pueda interactuar con Git en `fishgold`:

1. **Requisito Base de Sistema:** Git debe estar instalado en el sistema operativo y disponible en el `PATH` (o accesible mediante su ruta absoluta `git.exe`).
2. **Servidor MCP:** Puede implementarse vía `FastMCP` (Python) en un script dedicado (ej. `git_server.py`) o mediante el paquete estándar `mcp-server-git`.
3. **Herramientas que proveerá el MCP:**
   - `git_status`: Comprobar archivos modificados y estado del árbol de trabajo.
   - `git_branch`: Listar y crear ramas (`feature/...`).
   - `git_checkout`: Conmutar entre ramas (`master`, `feature/...`).
   - `git_add_commit`: Preparar archivos y crear commits con mensaje semántico.
   - `git_pull`: Sincronizar cambios remotos.
   - `git_push`: Publicar ramas hacia GitHub.
   - `git_merge`: Realizar integraciones y resolver conflictos locales.
4. **Registro:** El servidor se conectará en `~/.gemini/config/mcp_config.json` para que esté disponible inmediatamente.
