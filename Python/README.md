# 📘 README -- Lista Circular en Python (Semana 2)

## 📌 Descripción

Este proyecto corresponde a la implementación de una **Lista Circular
Simple** en Python, desarrollada como parte de la **Semana 2** del
laboratorio de Estructuras de Datos.

La implementación se basa en la **traducción de un proyecto legacy en
Java**, manteniendo el comportamiento lógico original de la estructura,
pero adaptando la sintaxis y convenciones al lenguaje Python.

------------------------------------------------------------------------

## 🧱 Estructura del proyecto

``` text
Python/
│
├── src/
│   ├── ListaCircular.py
│   └── __init__.py
│
├── tests/
│   ├── test_list_circular.py
│   └── __init__.py
│
└── README.md
```

------------------------------------------------------------------------

## 🧠 Estructuras implementadas

### 🔹 Clase `Node`

Representa un nodo de la lista circular.

**Atributos:** - `data`: valor almacenado en el nodo - `next`:
referencia al siguiente nodo

------------------------------------------------------------------------

### 🔹 Clase `CircularLinkedList`

Implementa la lógica de una lista circular simple.

**Métodos disponibles:** - `is_empty()` → verifica si la lista está
vacía - `insertLast(data)` → inserta un elemento al final de la lista -
`insertByPosition(position, data)` → inserta un elemento en una posición
específica - `remove(data)` → elimina un elemento por valor - `size()` →
retorna el tamaño de la lista - `display()` → muestra los elementos de
la lista

------------------------------------------------------------------------

## 🧪 Pruebas unitarias

Las pruebas fueron desarrolladas utilizando **pytest**, validando tanto
el funcionamiento normal como los casos límite de la estructura.

### ✔ Casos cubiertos

-   Creación de una lista vacía
-   Inserción de múltiples elementos
-   Inserción por posición (inicio, intermedia y fuera de rango)
-   Eliminación de elementos existentes
-   Eliminación progresiva hasta vaciar la lista
-   Eliminación en lista vacía
-   Eliminación de un único nodo
-   Manejo de elementos inexistentes
-   Llamadas a métodos en orden incorrecto

------------------------------------------------------------------------

## ▶️ Ejecución de pruebas

Desde la raíz del proyecto, ejecutar:

``` bash
pytest -v
```

------------------------------------------------------------------------

## 📊 Cobertura de código

La cobertura fue medida utilizando **pytest-cov**.

### Comando utilizado:

``` bash
pytest --cov=src
```

### Resultado:

-   **Cobertura total: 83%**

Las líneas no cubiertas corresponden principalmente a ramas defensivas y
escenarios poco frecuentes, lo cual es esperable en estructuras de datos
enlazadas.

------------------------------------------------------------------------

## ✅ Verificación de requerimientos -- Semana 2

  Requerimiento                        Estado
  ------------------------------------ -------------
  Implementar clase(s)                 ✅ Cumplido
  Probar con scripts simples           ✅ Cumplido
  Simular errores                      ✅ Cumplido
  Insertar muchos elementos            ✅ Cumplido
  Eliminar hasta vaciar                ✅ Cumplido
  Llamar métodos en orden incorrecto   ✅ Cumplido
  Pruebas automatizadas                ✅ Cumplido
  Medición de cobertura                ✅ Cumplido

------------------------------------------------------------------------

## 🏁 Conclusión

La versión Python de la lista circular cumple completamente con los
requerimientos planteados para la Semana 2.\
La estructura fue validada mediante pruebas unitarias, incluyendo casos
borde y simulación de errores, garantizando la correcta manipulación de
referencias y la integridad de la lista circular.

------------------------------------------------------------------------

### ✅ Estado final del proyecto


