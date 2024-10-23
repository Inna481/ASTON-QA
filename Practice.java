public class Practice {
    public static void main(String args[]) {
        //printThreeWords();
        //checkSummSign();
        //printColor();
        //compareNumbers();
        //boundsChecking(1,15);
        //integer();
        //method7(8);
        //method8();
        //year();
        //method10();
        //method11();
        //method12();
        //method13();
        //method14();
    }

    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    static void checkSummSign() {
        int a = 8;
        int b = 15;
        if (a + b >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    static void printColor() {
        int value = 121;
        if (value <= 0) {
            System.out.println("\nКрасный");
        } else if (value <= 100) {
            System.out.println("\nЖелтый");
        } else {
            System.out.println("\nЗеленый");
        }
    }

    static void compareNumbers() {
        int a = 2, b = 55;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

    }

    static boolean boundsChecking(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }
    static void integer () {
        int a = 25;
        if (a>=0) {
            System.out.println("Положительное");
        }else {
            System.out.println("Отрицательное");
        }
    }
    static boolean method7 (int a) {
            if (a<=0) {
                return true;
            } else {
                return false;
            }
    }
    static void method8() {
        int a = 55;
        String b = "\nНам надо больше практики";
        System.out.println("b :" + b.repeat(a));
    }

    static boolean year() {
        int year = 100;
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }
    static void method10() {
        int[] arr = new int[]{0, 1, 0, 1, 0, 1, 0, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void method11() {
        int[] arr = new int[100];

        for (int i = 0, j = 0; i < arr.length; i++, j += 1) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
    }
    static void method12() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }
    static void method13() {
        int a = 5;
        int twoD[][] = new int[a][a];

        for (int i = 0; i < a; i++) {
            twoD[i][i] = 1;
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++)
                System.out.printf("%3d", twoD[i][j]);
            System.out.println();
        }
    }
    static int[] method14(int len, int initialValue) {

        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;

        }
        return arr;
    }
}

