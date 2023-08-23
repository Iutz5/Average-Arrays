/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Tem,plates
 * and open the template in the editor.
 */
package AvergaingFuctionsLab;

/**
 *
 * @author ianut
 */
public class Main {
    public static double computeAverage(double[] grades) { // Function that takes in the array of values (assignment grades) and puts equal weight on them 
        double result = 0; // initalizing the variable result
        for ( int i=0 ; i < grades.length ; i++ ) {  // grades.length will give you the number of grades in the array
            result = result + (grades[i] / (double) (grades.length)); // loop over each grade in the array of assignment grades, divide it by the total number of grades and add it to the previous term of result
        }
    
        return result; // will return a double value
    }
   public static double computeWeightedAverage(double[] grades, double[] multipliers ) { // function that takes the array fromm computeAverage and another array of multipliers to calculate each arrays weight and add them together to get a final grade
        double gradesWeightedAverage = 0; // initalizing the variable gradesWeightedAverage
        for (int i = 0 ; i < grades.length ; i++ ) { // grades.length and multipliers.length should be the same value here so they are interchangable
            gradesWeightedAverage = gradesWeightedAverage + grades[i] * multipliers[i]; // loop over each equal average grade from the function computeAverage, multiply it by the multiplier on the ith term, and add it to the previous result of gradesWeightedAverage
        }
        return gradesWeightedAverage; // will return a double value
    }
    /**
     * @param args the command line arguments
    } */
    public static void main(String[] args) {
        double[] averages = new double[2]; // creating an empty array that will fill each assignment category ([0]=assignment grades,[1]=lab grades)
        double[] assignments = {90,100,85,90}; // chose random values for assignments and labs
        double[] labs = {97,84,91}; // made the labs array a different length than the assignments array to show that the assignments and labs arrays can be different lengths, but the averages and multipliers array lengths have to be the same
        double[] multipliers = {0.6,0.4}; // has to equal the length of the array averages (2)
       // double multiplierAssignments = 0.6;
       // double multiplierLabs = 0.4;
        averages[0] = computeAverage(assignments); // before they are weighted by their respective multiplier, they have to pass through the equal average function computeAverage
        averages[1] = computeAverage(labs); 
        
        
        double finalGrade = computeWeightedAverage(averages, multipliers);
        System.out.println(finalGrade);
        // TODO code application logic here
    }
    
}
