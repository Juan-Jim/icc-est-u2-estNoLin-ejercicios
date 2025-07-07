# Práctica: Estructuras no lineales Árboles 

- **Título:** Práctica de Árboles Binarios: Inserción, Inversión, Listado por Niveles y Profundidad  
- **Asignatura:** Estructura de Datos  
- **Carrera:** Computación  
- **Estudiante:** Juan Jimenez 
- **Fecha:** 6/07/2025  
- **Profesor:** Ing. Pablo Torres  

---

## Descripción

Esta práctica implementa cuatro ejercicios fundamentales sobre árboles binarios. Cada uno aborda una operación esencial en estructuras jerárquicas: inserción, inversión, recorrido por niveles y cálculo de profundidad. Se utiliza una clase `Node` como base para representar cada nodo del árbol, ubicada en `Materia.Models`.

---

## Estructura del Proyecto

```
src/
|__ Main
   ├── Materia/
   │   └── Models/
   │       └── Node.java
   ├── Ejercicio_01_insert/
   │   └── InsertBSTTest.java
   ├── Ejercicio_02_invert/
   │   └── InvertBinaryTree.java
   ├── Ejercicio_03_listLeves/
   │   └── ListLevels.java
   ├── Ejercicio_04_depth/
      └── Depth.java
   
```

---

## Detalle de Ejercicios y Métodos

###  Ejercicio 1: `InsertBSTTest.java` – Inserción en ABB

**Método:**  
```java
public Node insert(Node root, int value)
```

**Descripción:**  
Inserta un nodo con un valor dado respetando las propiedades de un árbol binario de búsqueda (ABB):
- Si el valor es menor al nodo actual, se inserta en el subárbol izquierdo.
- Si el valor es mayor, se inserta en el subárbol derecho.
- La inserción se realiza de forma recursiva hasta encontrar un lugar nulo, donde se crea el nuevo nodo.

**Retorno:**  
Devuelve el nodo raíz actualizado luego de la inserción.

---

###  Ejercicio 2: `InvertBinaryTree.java` – Invertir el árbol binario

**Método:**  
```java
public Node invertTree(Node root)
```

**Descripción:**  
Invierte el árbol binario recursivamente:
- Intercambia el hijo izquierdo y derecho de cada nodo.
- Llama recursivamente a los hijos ya intercambiados.
- Al finalizar, el árbol es una imagen reflejada respecto a su eje vertical.

**Retorno:**  
Devuelve el nuevo nodo raíz del árbol invertido.

---

###  Ejercicio 3: `ListLevels.java` – Listar nodos por niveles

**Método:**  
```java
public List<List<Node>> listLevels(Node root)
```

**Descripción:**  
Realiza un recorrido por niveles (BFS):
- Utiliza una cola (`Queue`) para almacenar los nodos por nivel.
- Cada iteración representa un nivel del árbol.
- Almacena los nodos de cada nivel en una lista interna y luego los agrupa en una lista principal.

**Retorno:**  
Una lista de listas, donde cada sublista contiene los nodos de un nivel específico.

---

###  Ejercicio 4: `Depth.java` – Calcular profundidad del árbol

**Método:**  
```java
public int maxDepth(Node root)
```

**Descripción:**  
Calcula la profundidad máxima (altura) del árbol de forma recursiva:
- Evalúa recursivamente las profundidades del subárbol izquierdo y derecho.
- Toma el mayor de los dos y le suma 1 (por el nodo actual).
- El caso base es cuando el nodo es nulo, retornando 0.

**Retorno:**  
Un entero que representa la altura máxima del árbol.

---

## Ejemplo de Ejecución

1. Se insertan los valores: `10, 5, 15, 3, 7, 12, 18`.
2. Se invierte el árbol generado.
3. Se listan los nodos por niveles:
   ```
   10  
   15 → 5  
   18 → 12 → 7 → 3
   ```
4. Se calcula e imprime la profundidad del árbol (valor esperado: `3`).

---

## Recomendaciones

- Verifica que el archivo `student.env` esté completo con tu nombre y correo institucional.
- Usa nombres de clases y métodos tal como lo exige la práctica.
- Escribe comentarios para explicar el código donde sea necesario.
- Usa ejemplos claros para probar cada ejercicio.

---

## Evaluación

- Informe completo con explicación de métodos: **3 pts**
- Código funcional y probado: **7 pts**
- Total: **10 pts**

---
