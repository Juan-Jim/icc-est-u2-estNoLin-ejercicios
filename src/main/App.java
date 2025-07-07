package main;

import java.util.List;

import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
      //  var estudiante = StudentValidator.validarDatos();
       // System.out.println("👤 Estudiante: " + estudiante.nombre());
        //System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        System.out.println("==== Ejercicio 01: Insertar en BST ====");
        InsertBST insertTest = new InsertBST();
        Node root = null;
        root = insertTest.insert(root, 5);
        root = insertTest.insert(root, 3);
        root = insertTest.insert(root, 7);


        System.out.println("\n==== Ejercicio 02: Invertir Árbol Binario ====");
        InvertBinaryTree invertTest = new InvertBinaryTree();
        Node invertedRoot = invertTest.invertTree(root);
        

        System.out.println("\n==== Ejercicio 03: Listar Niveles del Árbol ====");
        ListLevels levelsTest = new ListLevels();
        List<List<Node>> levels = levelsTest.listLevels(invertedRoot);
        

        System.out.println("\n==== Ejercicio 04: Calcular Profundidad Máxima ====");
        Depth depthTest = new Depth();
        int maxDepth = depthTest.maxDepth(invertedRoot);
        System.out.println("Profundidad máxima: " + maxDepth);
    
    }

}
