public class FactorialCalculate {
    public static long factorial (int x) {
        if (x < 0){
            throw new IllegalArgumentException("Отрицательные числа недопустимы");
        }
        long result = 1;
        for (int y = 1; y <= x; y++) {
            result *=y;
        }
        return result;
    }

}
