public class myApp {

    static void taskWithIf(double number) {

        if (number <= 33) {
            System.out.println("Wylosowana liczba mieści się w zakresie od 0 do 33 --> " + number);
        }
        else if (number > 33 && number <= 66) {
            System.out.println("Wylosowana liczba mieści się w zakresie od 33 do 66 --> " + number);
        }
        else {
            System.out.println("Wylosowana liczba mieści się w zakresie od 66 do 100 --> " + number);
        }
    }

    static void taskWithSwitch(int number) {

        switch (number) {
            case 1 -> System.out.println(number + " month is January");
            case 2 -> System.out.println(number + " month is February");
            case 3 -> System.out.println(number + " month is March");
            case 4 -> System.out.println(number + " month is April");
            case 5 -> System.out.println(number + " month is May");
            case 6 -> System.out.println(number + " month is Jun");
            case 7 -> System.out.println(number + " month is July");
            case 8 -> System.out.println(number + " month is August");
            case 9 -> System.out.println(number + " month is September");
            case 10 -> System.out.println(number + " month is October");
            case 11 -> System.out.println(number + " month is November");
            case 12 -> System.out.println(number + " month is December");
            default -> System.out.println("You didn't choose number between 1 and 12");
        }

    }

    static void taskWithFor(double[] arrayOfNumbers) {

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = Math.random() * 100;
            System.out.println("Liczba " + (i + 1) + ": " + arrayOfNumbers[i]);
        }
    }

    static int taskWithForEach(int[] arrayOfNumbers) {

        int result = 0;
        for (int numbers : arrayOfNumbers) {
            result += numbers;
        }
        return result;
    }

    static void taskWithWhile() {

        int counter = 0;
        while (counter < 4) {

            if (counter == 0) {
                System.out.println("Wiosna!");
                counter++;
            } else if (counter == 1) {
                System.out.println("Lato!");
                counter++;
            } else if (counter == 2) {
                System.out.println("Jesień!");
                counter++;
            } else {
                System.out.println("Zima!");
                counter++;
            }
        }
    }

    static int taskWithWhile2(int[] array) {

        int length = array.length;
        int counter = 0;
        int sum = 0;

        while (counter < length) {

            if (array[counter] % 2 == 0) {
                counter++;
                continue;

            } else {
                sum += array[counter];
                counter++;
            }
        }
        return sum;
    }

    static int taskWithFor2(int[] array) {
        int sum = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                continue;
            } else {
                sum += number;
            }
        }
        return sum;
    }

    static void taskWithDoWhile(int number) {

        do {
            if (number < 0){
                System.out.println("Podaj liczbę większą od 0!");
                break;
            }
            else if (number > 0) {
                System.out.println("Odliczamy!: " + number);
                number--;
            } else {
                System.out.println("Koniec!: " + number);
                number--;
            }
        }

        while (number >= 0);
    }

        public static void main(String[] args){

            double randomNumber = Math.random()*100;
            double[] randomArray = new double[10];
            int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            int[] integerArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            //System.out.println("Wylosowana liczba: "+randomNumber);

            System.out.println("\tTest instrukcji If-else: ");
            System.out.println("Sprawdza czy liczba mieści się w 1 z 3 zakresów. 0-33, 34-66, 67-100");
            taskWithIf(randomNumber);
            System.out.println();

            System.out.println("\tTest instrukcji Switch: ");
            System.out.println("Na podstawie podanej liczby wyświetla nazwę miesiąca");
            taskWithSwitch(2);
            taskWithSwitch(13);
            System.out.println();

            System.out.println("\tTest pętli For: ");
            System.out.println("Losuje 10 liczb (double) z zakresu 0 do 100");
            taskWithFor(randomArray);
            System.out.println();

            System.out.println("\tTest pętli For each: ");
            System.out.println("Sumuje liczby całkowite z zadanej tablicy");
            int result = taskWithForEach(integerArray);
            System.out.println("Suma liczba od 1 do 12: "+result);
            System.out.println();

            System.out.println("\tTest pętli While: ");
            System.out.println("Wyświetla po kolei pory roku na podstawie rosnacego licznika");
            taskWithWhile();
            System.out.println();

            System.out.println("\tTest pętli Do While: ");
            System.out.println("odlicza od podanej liczby do 0");
            taskWithDoWhile(5);
            System.out.println();
            taskWithDoWhile(-2);
            System.out.println();

            System.out.println("\tTest pętli While2: ");
            int result2=taskWithWhile2(integerArray2);
            System.out.println("Zlicza sumę liczb nieparzystych z tablicy: "+result2);
            System.out.println();

            System.out.println("\tTest pętli For2: ");
            int result3=taskWithFor2(integerArray2);
            System.out.println("Zlicza sumę liczb nieparzystych z tablicy: "+result3);
            System.out.println();


    }
}
