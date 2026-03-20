# 🔄 Lista Circular
 
Implementación comparativa de una **Lista Circular** en Java, JavaScript y Python. Proyecto educativo y de portafolio con interfaz visual en HTML/CSS y pruebas automatizadas.
 
[![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white)](https://www.java.com/)
[![JavaScript](https://img.shields.io/badge/JavaScript-ES6-F7DF1E?logo=javascript&logoColor=black)](https://developer.mozilla.org/es/docs/Web/JavaScript)
[![Python](https://img.shields.io/badge/Python-3.14-3776AB?logo=python&logoColor=white)](https://python.org/)
 
---
 
## 📌 ¿Qué es una Lista Circular?
 
Una **Lista Circular** es una estructura de datos lineal donde el último nodo apunta de vuelta al primero, formando un ciclo. A diferencia de una lista enlazada simple, no existe un nodo final con puntero nulo.
 
Sus principales ventajas son la navegación continua entre elementos y el aprovechamiento eficiente de memoria en ciertos contextos como buffers circulares y sistemas de turnos.
 
---
 
## 🛠️ Implementaciones
 
### ☕ Java (`java-original/`)
- Implementación base con nodos enlazados
- Operaciones: insertar, eliminar, recorrer
- Punto de referencia conceptual del proyecto
 
### 🌐 JavaScript (`javascript/`)
- Implementación en ES6
- Interfaz visual con HTML y CSS
- Pruebas automatizadas con Jest
 
### 🐍 Python (`Python/`)
- Implementación equivalente a Java
- Pruebas automatizadas con Pytest
- Enfoque en claridad y validación lógica
 
---
 
## 📁 Estructura del proyecto
 
```
Lista-Circular/
├── java-original/               # Implementación en Java
│   ├── AppListaLab1.java
│   ├── ListaCircular.java
│   └── Nodo.java
├── javascript/                  # Implementación en JS + UI + tests
│   ├── public/
│   ├── src/
│   │   ├── CircularLinkedList.js
│   │   └── view.js
│   ├── styles/
│   ├── tests/
│   │   └── CircularLinkedList.test.js
│   └── package.json
├── Python/                      # Implementación en Python + pytest
│   ├── src/
│   │   └── ListaCircular.py
│   └── tests/
└── README.md
```
 
---
 
## 🧪 Pruebas automatizadas
 
### JavaScript
```bash
cd javascript
npm install
npm test
```
 
### Python
```bash
cd Python
pytest
```
 
---
 
## 🎯 Objetivos del proyecto
 
- Comparar implementaciones de la misma estructura en distintos lenguajes
- Validar el comportamiento lógico mediante pruebas automatizadas
- Aplicar buenas prácticas de organización y testing
- Servir como material de estudio y portafolio
 
---
 
## 👨‍💻 Autor
 
**Eduardo Garay**
- 📍 Quilicura, Santiago, Chile
- 🔗 [LinkedIn](https://www.linkedin.com/in/eduardo-garay-9b067b16b)
- 🐙 [GitHub](https://github.com/EduardoGaray57)
 
