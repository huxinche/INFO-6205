class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < asteroids.length; i++) {
            if (stack.isEmpty() || asteroids[i] > 0) {
                stack.push(asteroids[i]);
                continue;
            }
            while (true) {
                int prev = stack.peek();
                if (prev < 0) {
                    stack.push(asteroids[i]);
                    break;
                }
                if (prev == -asteroids[i]) {
                    stack.pop();
                    break;
                }
                if (prev > -asteroids[i]) {
                    break;
                }
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(asteroids[i]);
                    break;
                }
            }
        }
        int size=stack.size();
        int[] result = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}

