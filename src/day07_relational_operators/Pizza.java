package day07_relational_operators;

public class Pizza {
    public static void main(String[] args) {

        String pizzaType = "Pepperoni";
        int numOfSlices = 16;
        int numOfPeople = 3;

        int slicePerPerson = numOfSlices / numOfPeople;
        int slicesLeft = numOfSlices % numOfPeople;

        System.out.println(slicesLeft);

        String result = "We bought " + pizzaType + " pizza. It has " + numOfSlices + " slices. We are " + numOfPeople + " people and each of us will eat " + slicePerPerson + " slices and there will " + slicesLeft + " slices left over";

        System.out.println(result);

    }
}
