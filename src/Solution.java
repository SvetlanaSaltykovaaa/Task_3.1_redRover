public class Solution {

    // Задача №1
    static void toCheckIntegers(int first, int second) {
        boolean firstIsLess = first < second;
        boolean secondIsLess = second < first;
        boolean isEquals = first == second;
        if (isEquals) System.out.println("first == second");
        if (firstIsLess) System.out.println(" first < second");
        if (secondIsLess) System.out.println(" second < first");
    }
    // Задача № 2
    static void toCheckEvenSum(int first, int second) {
        if ((first + second) % 2 == 0) {
            System.out.println("maybe a and b are even!");
        } else {
            System.out.println("some variable is odd!");
        }
    }
    // Задача № 3
    static void toCheckInteger(int number) {
        boolean isNumberMoreThen10 = number > 10;
        boolean isNumberLessThen100 = number < 100;
        boolean isDivisionBy2IsMoreThen20 = number / 2 > 20;
        boolean isNumberLessThen40AndMoreThen5 = number >= 5 && number <= 40;
        boolean isNumberLessThe5AndMoreThen40 = number < 5 || number > 40;
        if (isNumberMoreThen10) System.out.println("больше 10");
        if (isNumberLessThen100) System.out.println("меньше 100");
        if (isDivisionBy2IsMoreThen20) System.out.println("результат деления на 2 больше 20");
        if (isNumberLessThen40AndMoreThen5) System.out.println("значение переменной между 5 и 40 включительно");
        if (isNumberLessThe5AndMoreThen40) System.out.println("значение переменной меньше 5 или больше 40");
    }
    public static void main(String[] args) {
        toCheckIntegers(3, 3);
        toCheckEvenSum(5, 6);
        toCheckInteger(10);

    }
}
