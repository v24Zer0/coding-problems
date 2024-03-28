package asteroid_collision;

// We are given an array asteroids of integers representing asteroids in a row.

// For each asteroid, the absolute value represents its size,
// and the sign represents its direction (positive meaning right, negative meaning left).
// Each asteroid moves at the same speed.

// Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode.
// If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

import java.util.Stack;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < asteroids.length; i++) {
            boolean isDestroyed = false;

            if(asteroids[i] < 0) {
                int absVal = Math.abs(asteroids[i]);

                while(!stack.isEmpty() && stack.peek() > 0) {
                    int stackTop = stack.peek();

                    if(absVal > stackTop) {
                        stack.pop();
                    } else if(absVal < stackTop) {
                        isDestroyed = true;
                        break;
                    } else {
                        stack.pop();
                        isDestroyed = true;
                        break;
                    }
                }

                if(!isDestroyed) {
                    stack.add(asteroids[i]);
                }
            } else {
                stack.add(asteroids[i]);
            }
        }

        int[] finalAsteroids = new int[stack.size()];
        for(int i = stack.size() - 1; i >= 0; i--) {
            finalAsteroids[i] = stack.pop();
        }

        return finalAsteroids;
    }
}
