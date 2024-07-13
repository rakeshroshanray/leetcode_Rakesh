import java.util.*;

class Solution {
    class Tuple {
        int position;
        int health;
        int index;
        char direction;

        Tuple(int position, int health, int index, char direction) {
            this.position = position;
            this.health = health;
            this.index = index;
            this.direction = direction;
        }
    }

    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        ArrayList<Tuple> robotList = new ArrayList<>();
        ArrayList<Tuple> aliveRobots = new ArrayList<>();
        
        for (int i = 0; i < positions.length; i++) {
            robotList.add(new Tuple(positions[i], healths[i], i, directions.charAt(i)));
        }
        robotList.sort(Comparator.comparingInt(r -> r.position));

        Stack<Tuple> stack = new Stack<>();

        for (Tuple robot : robotList) {
            if (robot.direction == 'R') {
                stack.push(robot);
            } else {
                while (!stack.isEmpty() && stack.peek().health < robot.health) {
                    robot.health--;
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek().health == robot.health) {
                    stack.pop();
                    robot.health--;
                } else if (!stack.isEmpty()) {
                    stack.peek().health--;
                    if (stack.peek().health == 0) {
                        stack.pop();
                    }
                } else {
                    aliveRobots.add(robot);
                }
            }
        }

        while (!stack.isEmpty()) {
            aliveRobots.add(stack.pop());
        }

        aliveRobots.sort(Comparator.comparingInt(a -> a.index));

        ArrayList<Integer> survivedRoboHealth = new ArrayList<>();
        for (Tuple robot : aliveRobots) {
            if (robot.health > 0) {
                survivedRoboHealth.add(robot.health);
            }
        }
        return survivedRoboHealth;
    }
}
