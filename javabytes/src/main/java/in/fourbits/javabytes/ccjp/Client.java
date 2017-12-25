/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.ccjp;

/**
 *
 * @author Suraj
 */

class Employee {
    public Employee() {
        System.out.println(" 1 ");
    }
}

class PermanentEmployee {
    public PermanentEmployee() {
        System.out.println(" 2 ");
    }
}

class ContractEmployee {
    public ContractEmployee() {
        System.out.println(" 3 ");
    }
}

public class Client {
    public static void main(String[] args) {
        new ContractEmployee();
    }
    
}
