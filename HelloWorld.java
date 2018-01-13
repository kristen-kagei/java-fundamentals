//HelloWorld is a class
//You cannot run a function without it belonging to a class
//Your File name should be the same as your class name
public class HelloWorld {
    //main is a method. 
    //main is required for any file intended to be run
    //main is an entry point for an executable Java file
    public static void main(String[] args) {
        //System.out.println("") is the console.log() or print() of Java
        System.out.println("Hello WOrld");
    }
}

/* Important shit to remember: 
1. Java is case sentitive
2. Class names are written in PascalCase/UpperCamelCase
3. Method (function) names are written with a lower case letter
and only use capitals if there is more than one word in the method
4. Methods usually use verbs for method names
5. Program filename must match class name EXACTLY with .java
6. Every Java class has to have a mandatory main() method
7. Every application begins with class definition. 
8. A class can contain multiple methods 
9. public: access modifier. Any public method is accessible from any
other class or method in the project 
10. static: method belongs to/ called from class itself, not an instance of
11. void: main() doesn't return anything
12. Compiling a java program means: javac FileName, adds a .class file 