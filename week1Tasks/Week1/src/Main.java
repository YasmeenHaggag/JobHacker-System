import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Extremely Basic problem

        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int result = input1 + input2;
        System.out.println("X = " + result);


        //Area of the circle

        double r = input.nextDouble();
        System.out.printf("A=" + String.format("%.4f", (3.14159 * r * r)));
        System.out.println();


        //Average2

        float a = input.nextFloat(), b = input.nextFloat(), c = input.nextFloat();
        float average = ((a * 2) + (b * 3) + (c * 5)) / (2 + 3 + 5);
        System.out.println("MEDIA = " + String.format("%.1f", average));


        //Distance between two points

        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();
        double resultt = Math.sqrt(Math.pow(n3 - n1, 2) + Math.pow(n4 - n2, 2));
        System.out.printf("%.4f", resultt);
        System.out.println();


        //Banknotes problem

        int num = input.nextInt();
        int arr[] = {100, 50, 20, 10, 5, 2, 1};
        System.out.println(num);
        for (int i = 0; i < 7; i++) {
            if (i == 0)
                System.out.println(num / arr[i] + " nota(s) de R$ 100,00");
            if (i == 1)
                System.out.println(num / arr[i] + " nota(s) de R$ 50,00");
            if (i == 2)
                System.out.println(num / arr[i] + " nota(s) de R$ 20,00");
            if (i == 3)
                System.out.println(num / arr[i] + " nota(s) de R$ 10,00");
            if (i == 4)
                System.out.println(num / arr[i] + " nota(s) de R$ 5,00");
            if (i == 5)
                System.out.println(num / arr[i] + " nota(s) de R$ 2,00");
            if (i == 6)
                System.out.println(num / arr[i] + " nota(s) de R$ 1,00");
            num %= arr[i];
        }

            //Multiplies problem

            int nunber1 = input.nextInt();
            int number2 = input.nextInt();
            if (n1 % n2 == 0 || n2 % n1 == 0)
                System.out.println("Sao Multiplos");
            else System.out.println("Nao sao Multiplos");

            //Even,Odd,Positive and Negative
            int Odd = 0, Even = 0, Positve = 0, Negative = 0;
            for (int s = 0; s < 5; s++) {
                int nuM = input.nextInt();
                if (nuM % 2 == 0 || nuM == 0)
                    Even++;
                else
                    Odd++;
                if (nuM > 0)
                    Positve++;
                else if (nuM < 0)
                    Negative++;
            }
            System.out.println(Even + " valor(es) par(es)");
            System.out.println(Odd + " valor(es) impar(es)");
            System.out.println(Positve + " valor(es) positivo(s)");
            System.out.println(Negative + " valor(es) negativo(s)");


            //Highest and position

            int number = 0, Max = Integer.MIN_VALUE, Position = 0;
            for (int k = 0; k < 100; k++) {
                num = input.nextInt();
                if (num > Max) {
                    Max = number;
                    Position = k + 1;
                }

            }
            System.out.println(Max);
            System.out.println(Position);




            //Squared and cubic problem

            int numberr = input.nextInt();
            for (int x = 1; x <= num; x++) {
                System.out.println(x + " " + x * x + " " + x * x * x);
            }



            // Array change 1

                int element, counter = 0, arrr[] = new int[20];
                for (int k = 0; k < 20; k++) {
                    arr[k] = input.nextInt();
                }
                for (int j = 19; j >= 0; j--) {
                    System.out.println("N[" + counter + "]" + " = " + arrr[j]);
                    counter++;
                }


                // Array Fill 11

                int T = input.nextInt();
                int ar[] = new int[1000], j = 0;
                for (int l = 0; l < 1000; l++) {
                    System.out.println("N[" + l + "] = " + j);
                    j++;
                    if (j % (T) == 0)
                        j = 0;
                }


                // Line in array problem

                int line = input.nextInt();
                double sum = 0.0;
                char operator = input.next().charAt(0);
                double array[][] = new double[12][12];
                for (int n = 0; n < 12; n++) {
                    for (int t = 0; t < 12; t++) {
                        array[n][t] = input.nextDouble();
                        if (n == line)
                            sum += array[n][t];
                    }
                }
                if (operator == 'S')
                    System.out.println(sum);
                else if (operator == 'M')
                    System.out.println(sum / 12.0);


                // Colmn in Array

                int colmn = input.nextInt();
                double sumiation = 0.0;
                char operatorr = input.next().charAt(0);
                double arrayy[][] = new double[12][12];
                for (int q = 0; q < 12; q++) {
                    for (int g = 0; g < 12; g++) {
                        arrayy[q][g] = input.nextDouble();
                        if (j == colmn)
                            sumiation += arrayy[q][g];
                    }
                }
                if (operatorr == 'S')
                    System.out.println(sumiation);
                else if (operatorr == 'M')
                    System.out.println(sumiation / 12.0);


                // Below the main diagonal

                double suM = 0.0;
                char operatoR = input.next().charAt(0);
                double arR[][] = new double[12][12];
                for (int h = 0; h < 12; h++) {
                    for (int A = 0; A < 12; A++) {
                        arR[h][A] = input.nextDouble();
                        if (A < h)
                            sum += arR[h][A];
                    }
                }
                if (operatoR == 'S')
                    System.out.println(suM);
                else if (operatoR == 'M')
                    System.out.println(suM / 12.0);

    }
}