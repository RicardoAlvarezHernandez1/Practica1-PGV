# Aplicación Contadora de Vocales

Esta aplicación lee el contenido de un archivo de texto, cuenta las coincidencias de vocales en el texto y guarda los resultados en archivos de salida separados.

## Tabla de Contenidos

- [Requisitos Previos](#requisitos-previos)
- [Uso](#uso)
- [Resumen del Código](#resumen-del-código)
- [Licencia](#licencia)

## Requisitos Previos

- Un archivo de texto con contenido (por ejemplo, "lorem_ipsum.txt")

## Uso

**Salida**:

- El programa generará archivos de salida separados para cada vocal.
- Y mostrará los resultados de cada vocal y el total de vocales por consola.

## Resumen del Código

- [`App.java`](App.java): La aplicación principal en Java que realiza las siguientes tareas:
  - Lee el contenido de un archivo de texto y lo almacena en la variable 'contenido'.
  - Inicializa una lista para hacer un seguimiento de los procesos iniciados posteriormente.
  - Define un array de cadenas de caracteres que representan las vocales "A," "E," "I," "O," y "U."
  - Inicializa un contador para el número total de vocales.
  - Itera a través de las cadenas de vocales.
  - Define un nombre de archivo de salida basado en la vocal actual y ejecuta el contador de vocales en un proceso separado.
  - Espera a que todos los procesos terminen.
  - Imprime el contenido del archivo de texto y muestra los resultados de cada contador de vocales en la consola.
  - Calcula el número total de vocales en el archivo y lo muestra en la consola.
