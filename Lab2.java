public class Lab2 {
    public static void main(String[] args) {
        //C = A+B; тип значеннь = char; Обчислити суму найбільших елементів в рядках матриці з парними номерами та найменших елементів в рядках матриці з непарними номерами
        //Оголошення матриць
        int n = 5;
        int[][] MatrixA = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char x = (char) (Math.random() * 9);
                MatrixA[i][j] = x;
            }
        }
        System.out.println("Matrix A");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", MatrixA[i][j]);
            }
            System.out.println();
        }
        int[][] MatrixB = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char y = (char) (Math.random() * 9);
                MatrixB[i][j] = y;
            }
        }
        System.out.println("Matrix B");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", MatrixB[i][j]);
            }
            System.out.println();
        }
        //сума матриць
        int[][] MatrixC = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                MatrixC[i][j] = MatrixA[i][j] + MatrixB[i][j];

            }
        }
        System.out.println("Матриця С");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", MatrixC[i][j]);
            }
            System.out.println();
        }
        //Пошук найбільших та найменших елементів
        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            int min = MatrixC[0][i];
            for (int j = 0; j < n; j++) {
                if (min > MatrixC[j][i]) {
                    min = MatrixC[j][i];
                }
            }
            System.out.println(i + 1 + "Стовпець найменший член:" + min);
            sum = sum + min;

        }
        System.out.println("Сума найменших елементів непарних стовпців=" + sum);
        int MaxSum = 0;
        for (int i = 1; i < n; i += 2) {
            int max = MatrixC[0][i];
            for (int j = 0; j < n; j++) {
                if (max < MatrixC[j][i]) {
                    max = MatrixC[j][i];
                }
            }
            System.out.println(i + 1 + "Стовпець найбільший член:" + max);
            MaxSum = MaxSum + max;
        }
        System.out.println("Сума найбільших елементів парних стовпців=" + MaxSum);
    }
}