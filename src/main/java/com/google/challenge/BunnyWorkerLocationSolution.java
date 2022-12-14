package com.google.challenge;
/*
Bunny Worker Locations
======================

Keeping track of Commander Lambda's many bunny workers is starting to get tricky. You've been tasked with writing a program to match bunny worker IDs to cell locations.

The LAMBCHOP doomsday device takes up much of the interior of Commander Lambda's space station, and as a result the work areas have an unusual layout. They are stacked in a triangular shape, and the bunny workers are given numerical IDs starting from the corner, as follows:

| 7
| 4 8
| 2 5 9
| 1 3 6 10

Each cell can be represented as points (x, y), with x being the distance from the vertical wall, and y being the height from the ground.

For example, the bunny worker at (1, 1) has ID 1, the bunny worker at (3, 2) has ID 9, and the bunny worker at (2,3) has ID 8. This pattern of numbering continues indefinitely (Commander Lambda has been adding a LOT of workers).

Write a function solution(x, y) which returns the worker ID of the bunny at location (x, y). Each value of x and y will be at least 1 and no greater than 100,000. Since the worker ID can be very large, return your solution as a string representation of the number.

Languages
=========

To provide a Java solution, edit Solution.java
To provide a Python solution, edit solution.py

Test cases
==========
Your code should pass the following test cases.
Note that it may also be run against hidden test cases not shown here.

-- Java cases --
Input:
Solution.solution(3, 2)
Output:
    9

Input:
Solution.solution(5, 10)
Output:
    96

-- Python cases --
Input:
solution.solution(5, 10)
Output:
    96

Input:
solution.solution(3, 2)
Output:
    9
 */
public class BunnyWorkerLocationSolution {

    public static void main(String [] args){
        System.out.println(solution(3,2)); // Output 9
        System.out.println(solution(5,10)); // Output 96
        System.out.println(solution(1,1)); // Output 1
    }

    /*
        diagonal = x+y-1
    Sum = int((diagonal*(diagonal+1)/2)) - (y-1)
    return (str(Sum))
     */
    public static String solution(int x, int y){
        if ((x>=1 && x<100000) && (y>=1 && y<100000)) {
            if (x == 1) {
                int cellX = 1;
                int xCordinate = 0;
                for (int i = 0; i < x; i++) {
                    cellX = cellX + i;
                    xCordinate = i + 1;
                }
                int celly = cellX;
                for (int i = 0; i < y - 1; i++) {
                    celly = celly + xCordinate + i;
                }
                return String.valueOf(celly);
            } else {
                int cellX = 1;
                int xCordinate = 0;
                for (int i = 2; i <= x; i++) {
                    cellX = cellX + i;
                    xCordinate = i;
                }
                int celly = cellX;
                for (int i = 0; i < y - 1; i++) {
                    celly = celly + xCordinate + i;
                }
                return String.valueOf(celly);
            }
        }else{
            return null;
        }
    }
}
