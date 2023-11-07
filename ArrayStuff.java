import java.util.*;

public class ArrayStuff {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int dataPoints[] = new int[100];
        Random rnd = new Random(); 

        for(int e : dataPoints)
        {
            dataPoints[e] = rnd.nextInt(100) +1;
        }
        for (int e : dataPoints)
        {
            System.out.print(dataPoints[e] + " | ");
        }
        int sum = 0;
        for (int e : dataPoints)
        {
            sum += dataPoints[e];
        }
        int mean = sum / 100;
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The mean of the array is: " + mean);
        sum = 0;
        int target = SafeInput.getRangedInt(in, "Enter a number between 1 and 100", 1, 100);
        for (int e : dataPoints)
        {
            if (dataPoints[e] == target)
            {
                sum += 1;
            }
        }
        System.out.println("Matches found: " + sum);

        int min = 100;
        int minPos = 1;
        int maxPos = 1;
        int max = 0;
        for (int e : dataPoints)
        {
            if (dataPoints[e] < min)
            {
                min = dataPoints[e];
                minPos = e;
            }
            if (dataPoints[e] > max)
            {
                max = dataPoints[e];
                maxPos = e;
            }
        }
        System.out.println("The minimum value " + min + " was found at array index " + minPos);
        System.out.println("The maximum value " + max + " was found at array index " + maxPos);

        System.out.println("The average is: " + getAverage(dataPoints));

    }
    public static double getAverage(int values[])
        {
            int sum = 0;
            for (int e : values)
            {
                sum += values[e];
            }
            
            double average = sum / 100;

            return average;
        }
}