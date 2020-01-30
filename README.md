# GITNORE 
# ¿Qué es?
Esta herramienta sirve para decirle a GIT que archivos o directorios debe ignorar para no subir al repositorio.

Independientemente del nivel de conocimientos de GIT, cualquiera puede utilizarla, porque, tiene una implementación sencilla. Únicamente se crea un archivo donde se especifica los elementos a ignorar.

# Implementación 

Se crea un archivo que se llama “.gitnore” en la carpeta raíz del proyecto. En este archivo se coloca un texto plano, con todas las carpetas que quieres que Git ignore.

De la siguiente manera:

example/

Estamos evitando que se procese en el control de versiones de todo el contenido de la carpeta "example ".

Si colocamos la siguiente línea:

*.java

Estaremos evitando que el sistema de control de versiones procese todos los archivos acabados de .java .
