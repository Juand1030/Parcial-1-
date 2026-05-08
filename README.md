Sistema de Gestión de Turnos - Banco Popular
Este proyecto es una aplicación de consola desarrollada en Java que simula la gestión de una cola de espera en una sucursal bancaria. Utiliza una estructura de datos FIFO (First-In, First-Out) para garantizar que los clientes sean atendidos en el estricto orden en que llegaron.

📋 Características
El sistema permite realizar las siguientes operaciones:

Registro de Clientes: Captura nombre, ID, tipo de trámite y si el cliente pertenece a un grupo prioritario.

Atención FIFO: Desencola al primer cliente en la fila para ser atendido por el cajero.

Consulta de Próximo: Permite visualizar quién es la siguiente persona en la fila sin retirarla.

Visualización General: Muestra la lista completa de personas esperando con sus respectivos datos.

Contador de Espera: Informa cuántas personas faltan por atender.

Protocolo de Emergencia: Permite vaciar la cola completamente en caso de ser necesario.

Validación de Entradas: Manejo de errores para evitar que el programa se cierre por ingresos de datos inválidos.
Tecnologías Utilizadas
Lenguaje: Java (JDK 11 o superior recomendado).

Estructuras de Datos: java.util.Queue y java.util.LinkedList.

Manejo de Tiempo: java.time.LocalTime para registrar la hora exacta de llegada.

📂 Estructura del Código
El proyecto consta de 4 clases principales ubicadas en la raíz del directorio (sin paquetes para facilitar la ejecución rápida):
Archivo,Descripción
Main.java,Punto de entrada de la aplicación.
MenuBanco.java,Lógica de interfaz de usuario y captura de datos por consola.
GestionCola.java,Controlador que gestiona la cola y las operaciones lógicas.
Cliente.java,Clase modelo con los atributos y validaciones del cliente.
Instalación y Ejecución
Requisitos previos
Tener instalado el JDK (Java Development Kit).

Un editor de texto o IDE (VS Code, IntelliJ, Eclipse).

Pasos para ejecutar en Visual Studio Code
Copia los 4 archivos de código en una carpeta local.

Abre esa carpeta en VS Code.

Asegúrate de que no existan errores de sintaxis (subrayados rojos).

Abre el archivo Main.java.

Presiona el botón Run situado sobre el método main o presiona F5.

Ejecución desde Terminal
Si prefieres usar la terminal de comandos:
  # Compilar todos los archivos
javac *.java

# Ejecutar la clase principal
java Main

Ejemplo de Uso
Al iniciar el programa, verás un menú como este:
--- CAJERO POPULAR: GESTIÓN DE TURNOS ---
1. Agregar cliente a la fila
2. Atender siguiente cliente
3. Ver quién sigue en espera
...
Seleccione una opción:


Juan David Velasquez Silva
