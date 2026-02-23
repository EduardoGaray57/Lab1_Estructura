# 📌 Lista Circular Enlazada en JavaScript

Implementación de una **Lista Circular Enlazada** en JavaScript (ES6), traducida fielmente desde Python y validada mediante **tests unitarios con Jest**.

Este proyecto demuestra el manejo de **estructuras de datos**, **programación orientada a objetos**, **traducción entre lenguajes** y **buenas prácticas de testing**.

---

## 📂 Estructura del proyecto

```txt
lista-circular/
│
├── src/
│   └── CircularLinkedList.js
│
├── tests/
│   └── CircularLinkedList.test.js
│
├── package.json
└── README.md
```

---

## ⚙️ Tecnologías utilizadas

- JavaScript (ES6)
- Node.js
- Jest (testing y coverage)

---

## 🧠 Descripción de la estructura

### 🔹 Node
Representa un nodo de la lista.

**Atributos**
- `data`: valor almacenado
- `next`: referencia al siguiente nodo

---

### 🔹 CircularLinkedList
Estructura principal de la lista circular.

**Atributos**
- `first`: primer nodo
- `last`: último nodo (apunta a `first`)

---

## 🔧 Métodos implementados

| Método | Descripción |
|------|------------|
| `isEmpty()` | Verifica si la lista está vacía |
| `insertLast(data)` | Inserta un nodo al final |
| `insertByPosition(pos, data)` | Inserta un nodo en una posición específica |
| `size()` | Retorna el tamaño de la lista |
| `remove(data)` | Elimina el nodo que contiene el valor |

✔️ La circularidad se mantiene en **todas las operaciones**

---

## 🧪 Tests unitarios

Las pruebas validan:

- Inicialización correcta
- Inserciones al inicio, intermedias y al final
- Eliminación de nodos (primero, intermedio, último)
- Eliminación del único nodo
- Casos donde el valor no existe
- Mantenimiento de la circularidad

---

## ▶️ Instalación y ejecución

### 1️⃣ Instalar dependencias
```bash
npm install
```

### 2️⃣ Ejecutar tests
```bash
npm test
```

### 3️⃣ Ejecutar tests con coverage
```bash
npm run test:coverage
```

---

## 📈 Cobertura de código

El proyecto está diseñado para alcanzar **alta cobertura**, validando:

- Caminos principales
- Casos borde
- Comportamiento circular

---

## 🔁 Comparación con la versión en Python

| Aspecto | Python | JavaScript |
|------|-------|------------|
| Paradigma | OOP | OOP ES6 |
| Circularidad | `last.next = first` | `last.next = first` |
| Tests | pytest | jest |
| GC | Automático | Automático |

➡️ La traducción mantiene una **relación 1:1 en lógica y comportamiento**.

---

## 🧩 Complejidad temporal

| Operación | Complejidad |
|---------|------------|
| Inserción | O(n) |
| Eliminación | O(n) |
| Tamaño | O(n) |
| Acceso | O(n) |

---

## 🎯 Objetivo del proyecto

- Practicar estructuras de datos
- Traducir lógica entre lenguajes
- Aplicar testing automatizado
- Documentar código de forma profesional

---

## 📌 Conclusión

Este proyecto demuestra una implementación sólida de una **Lista Circular Enlazada en JavaScript**, validada con pruebas unitarias, manteniendo buenas prácticas de diseño, claridad lógica y robustez frente a casos borde.

Ideal para:
- Proyectos académicos
- Portafolio profesional
- Práctica de testing y estructuras de datos
