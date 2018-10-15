/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.ArrayList;

/**
 *
 * @author Benutzer1
 */
public class Hackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hackerrank h = new Hackerrank();
        Solution loesung = new Solution();
        // initialize your new task here
        h.gradingStudents(loesung);
    }
    
    // create the task inside a new method here
    public void gradingStudents(Solution loesung) {
        
//        Function Description
//          Complete the function gradingStudents in the editor below. It should return an integer array consisting of rounded grades.
//          gradingStudents has the following parameter(s):
//          grades: an array of integers representing grades before rounding

        int[] grades = new int[5];
        
        grades[0] = 4;      
        grades[1] = 73;
        grades[2] = 67;
        grades[3] = 38;
        grades[4] = 33;
        
        int[] ergebnis = loesung.gradingStudents(grades);
        
        for(int i =  0; i < (grades[0]); i++)
        {
            System.out.println(ergebnis[i]);
        }
    }
    
    public void stockMaximize(Solution loesung) {
//        int[] prices = new int[3];
        int[] testcase1 = new int[3];
        testcase1[0] = 5;
        testcase1[1] = 3;
        testcase1[2] = 2;
        
        int[] testcase2 = new int[3];
        testcase2[0] = 1;
        testcase2[1] = 2;
        testcase2[2] = 100;
        
        int[] testcase3 = new int[4];
        testcase3[0] = 1;
        testcase3[1] = 3;
        testcase3[2] = 1;
        testcase3[3] = 2;
        
        int ergebnis = loesung.stockMaximize(testcase3);
        System.out.println("Loesung stockMaximize: " + ergebnis);
    }
}

