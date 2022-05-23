//import java.util.Arrays;

public class Arrays {
    public static void main(String[] args){
//        what are arrays?
//        length of arrays must be defined before using
//        all arrays must store the same kind of data as their elements


//        create an array with temps
//        this one is blank with 5 slots
        int[]texasTemps = new int[5];
        texasTemps[0] = 105;
        texasTemps[1] = 95;
        texasTemps[2] = 90;
        texasTemps[3] = 80;
        texasTemps[4] = 100;
        System.out.println(texasTemps[0]);
        System.out.println(texasTemps[1]);
        System.out.println(texasTemps[2]);
        System.out.println(texasTemps[3]);
        System.out.println(texasTemps[4]);
//        System.out.println(texasTemps[0,1,2,3,4]);

        String[] weatherTypes = new String[3];
        weatherTypes[0] = "Sunny";
        weatherTypes[1] = "Cloudy";
        weatherTypes[2] = "Windy";

        System.out.println(weatherTypes[0]);
        System.out.println(weatherTypes[1]);
        System.out.println(weatherTypes[2]);
//        System.out.println(weatherTypes[3]);

        Long[] dailySteps = {
                4231L,
                1098L,
                2000L
        };
        System.out.println(dailySteps[0]);

//        long[] dailySteps = {10_000L, 3_000L, 5_000L, 1_000L, 10_000L, 2_000L, 6_000L};
//        System.out.println(Arrays.toString(dailySteps));
//        int steps[] = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(Arrays.toString(steps));
    }
}
