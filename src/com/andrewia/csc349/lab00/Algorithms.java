package com.andrewia.csc349.lab00;

/**
 * Created by Andrew LeDawson on 1/8/2018.
 */
public class Algorithms {
    public static void linearAlgorithm(long N){
        for(long i = 0; i < N; i++){
            int x = 1;
        }
    }

    public static void quadraticAlgorithm(long N){
        for(long i = 0; i < N; i++){
            for(long j = 0; j < N; j++){
                int x = 1;
            }
        }
    }

    public static void cubicAlgorithm(long N){
        for(long i = 0; i < N; i++){
            for(long j = 0; j < N; j++){
                for(long k = 0; k < N; k++) {
                    int x = 1;
                }
            }
        }
    }

    public static void logarithmicAlgorithm(long N){
        for(long i = N; i > 1; i /= 2){
            int x = 1;
        }
    }

    public static void NlogNAlgorithm(long N){
        for(long i = 1; i < N; i++){
            for(long j = N; j > 1; j /= 2){
                int x = 1;
            }
        }
    }
}
