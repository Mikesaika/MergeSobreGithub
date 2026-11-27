# MergeSobreGithub

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
