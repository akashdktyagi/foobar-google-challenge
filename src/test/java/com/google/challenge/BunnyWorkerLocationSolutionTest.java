package com.google.challenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class BunnyWorkerLocationSolutionTest {
/*
   4 | 7
   3 | 4 8
   2 | 2 5 9
   1 | 1 3 6 10
       1 2 3 4
 */
    @ParameterizedTest
    @CsvSource({"1,1,1", "1,2,2", "1,3,4","1,4,7","2,1,3","2,2,5","2,2,5","2,3,8","3,1,6","3,2,9","4,1,10","100000,100000,1"})
//    @CsvSource({"2,1,3","2,2,5","2,2,5","2,3,8"})
    //    @CsvSource({"2,1,3","2,2,5","2,2,5","2,3,8"})
    public void templateTest(int x, int y, String expected){
        Assertions.assertEquals(expected,BunnyWorkerLocationSolution.solution(x,y));
    }

}