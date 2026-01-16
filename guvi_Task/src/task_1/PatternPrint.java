package task_1;

public class PatternPrint {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {          // rows
            int value = n;
            for (int j = 0; j < n; j++) {      // columns
                if (j < i) {
                    value--;
                }
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

