package org.dwimara.basics.variables;

/*
 * Variable : A variable is a container which holds the value while the Java program is executed.
 *            A variable is assigned with a data type.
 *
 * Variable is a name of memory location. There are three types of variables in java: local, instance and static.
 */
public class Variable {

    String college = "DWIMARA"; // Instance Variable
    static int m = 10;  // Static variable

    void method(){
        int n = 90;   // Local variable
    }

    public static void main(String[] args) {
        int data = 50;    // Instance variable
    }

}


/**
 *
 * Static Variable:
 * A variable that is declared as static is called a static variable.
 * It cannot be local. You can create a single copy of the static variable and share it among all the instances of the class.
 * Memory allocation for static variables happens only once when the class is loaded in the memory.
 *
 *
 * Local Variable :
 * A variable declared inside the body of the method is called local variable.
 * You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
 * A local variable cannot be defined with "static" keyword.
 *
 *
 * Instance Variable:
 * A variable declared inside the class but outside the body of the method, is called an instance variable.
 * It is not declared as static.
 * It is called an instance variable because its value is instance-specific and is not shared among instances.
 */