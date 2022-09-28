import java.util.HashMap;
import java.util.Scanner;

public class Database {

    private int range;

    HashMap<Integer, Double> database = new HashMap<Integer, Double>();

    ExponentialDistribution distribution = new ExponentialDistribution(1.0);

    public int getRange() {
        return range;
    }

    public void setRange() {
        Scanner takeData = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности: ");
        this.range = takeData.nextInt();
    }

    private double[] emptyValuesArray(){
        return new double[getRange()];
    }

    public void createValuesArray() {
        distribution.generateExponentialDistribution(emptyValuesArray());
    }

}
