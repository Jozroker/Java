package mainPackage.javaCore4.lesson;

public class Main {
    public static void main(String[] args) {
        Robot simpleRobot = new Robot();
        CoffeeRobot robotCoffee = new CoffeeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCoocker robotCoocker = new RobotCoocker();

        simpleRobot.work();
        robotCoffee.work();
        robotDancer.work();
        robotCoocker.work();

        System.out.println("------------");

        Robot[] robotArr = {simpleRobot, robotCoffee, robotCoocker, robotDancer};
        for (int i = 0; i < robotArr.length; i++){
            robotArr[i].work();
        }
    }
}
