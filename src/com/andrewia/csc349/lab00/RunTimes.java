package com.andrewia.csc349.lab00;

/**
 * Created by Andrew LeDawson on 1/8/2018.
 */
public class RunTimes {
    static void main(){
        System.out.println("Logarithmic algorithm's running times: ");
        for(long N = 1000; N < 100000000; N *= 2) {
            long startTime = System.nanoTime();
            Algorithms.logarithmicAlgorithm(N);
            long endTime = System.nanoTime();
            System.out.println("T(" + N + ") = " + (endTime - startTime) / 1000000);
        }
        System.out.println();

        System.out.println("Linear algorithm's running times: ");
        for(long N = 1000; N < 100000000; N *= 2) {
            long startTime = System.nanoTime();
            Algorithms.linearAlgorithm(N);
            long endTime = System.nanoTime();
            System.out.println("T(" + N + ") = " + (endTime - startTime) / 1000000);
        }
        System.out.println();

        System.out.println("NlogN algorithm's running times: ");
        for(long N = 1000; N < 100000000; N *= 2) {
            long startTime = System.nanoTime();
            Algorithms.NlogNAlgorithm(N);
            long endTime = System.nanoTime();
            System.out.println("T(" + N + ") = " + (endTime - startTime) / 1000000);
        }
        System.out.println();

        System.out.println("Quadratic algorithm's running times: ");
        for(long N = 1000; N <= 512000; N *= 2) {
            long startTime = System.nanoTime();
            Algorithms.quadraticAlgorithm(N);
            long endTime = System.nanoTime();
            System.out.println("T(" + N + ") = " + (endTime - startTime) / 1000000);
        }
        System.out.println();

        System.out.println("Cubic algorithm's running times: ");
        for(long N = 1000; N <= 8000; N *= 2) {
            long startTime = System.nanoTime();
            Algorithms.cubicAlgorithm(N);
            long endTime = System.nanoTime();
            System.out.println("T(" + N + ") = " + (endTime - startTime) / 1000000);
        }
        System.out.println();
    }
}
