# Java Original – Estructuras de Datos

Este módulo contiene implementaciones en **Java puro** de estructuras de datos clásicas, desarrolladas con fines educativos y de práctica.

## 📂 Estructura del módulo
java-original/
│── AppListaL.java
│── ListaCircular.java
│── Nodo.java
│── README.md

## 🧩 Descripción de archivos

### `Nodo.java`
Define la estructura básica de un nodo:
- Almacena el dato
- Referencia al siguiente nodo

Es la base para la implementación de las listas.

### `ListaCircular.java`
Implementación de una **lista circular enlazada**, incluyendo operaciones como:
- Inserción de elementos
- Recorrido de la lista
- Manejo del enlace circular

### `AppListaL.java`
Clase principal de ejecución:
- Contiene el método `main`
- Permite probar el funcionamiento de la lista circular
- Simula operaciones básicas desde consola

## ▶️ Cómo ejecutar

Desde la carpeta `java-original`:

```bash
javac *.java
java AppListaL
```

### `🎯 Objetivo del módulo` 
-   Comprender el funcionamiento interno de listas enlazadas
-   Practicar lógica de punteros y referencias
-   Servir como base para comparaciones con implementaciones en otros lenguajes (JavaScript, Python)

### `📝 Notas`
-   No se utilizan frameworks ni librerías externas
-   Código orientado a aprendizaje y claridad