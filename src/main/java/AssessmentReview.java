import java.util.ArrayList;
import java.util.Arrays;


public class AssessmentReview {

    public static double cubed(int num) {
        return Math.pow(num, 3);
    }

    public static double difference(int num1, int num2) {
        return num1 - num2;
    }

    public static double difference(double num1, double num2) {
        return num1 - num2;
    }

    public static double median(int[] numbersArr) {
        Arrays.sort(numbersArr);
        double median;
        int totalElements = numbersArr.length;
        if (totalElements % 2 == 0) {
            int sumOfMidElements = numbersArr[totalElements / 2] + numbersArr[totalElements / 2 - 1];
            median = ((double) sumOfMidElements) / 2;
        } else {
            median = (double) numbersArr[numbersArr.length / 2];
        }
        return median;
    }

    public static ArrayList<Cat> uppercaseCatColor(ArrayList<Cat>catArrayList){
        for (Cat cat : catArrayList) {
            if(!cat.getColor().equals(cat.getColor().toUpperCase())) {
                String updateColor = cat.getColor().toUpperCase();
                cat.setColor(updateColor);
            }
        }
        return catArrayList;
    }

    public static void main(String[] args) {

        System.out.println(cubed(6));
        System.out.println(difference(35, 10));
        System.out.println(difference(32.0, 13.4));

        ArrayList<Cat> cats = new ArrayList<>();

        Cat blackCat = new Cat("Midnight", 4 ,true , "black");
        Cat whiteCat = new Cat("Snowball",10,false, "white");
        Cat orangeCat = new Cat("Dreamsicle", 2 ,true , "orange");

        cats.add(blackCat);
        cats.add(whiteCat);
        cats.add(orangeCat);

        cats = AssessmentReview.uppercaseCatColor(cats);

        cats.forEach(cat -> System.out.println(cat.getColor()));
    }
}
