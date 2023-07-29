import java.util.Scanner;


public class Homework3 {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;

        // Массив вопросов
        String[] questions = {
                "Сколько букв в русском алфавите?",
                "Кто бы первым президентов России?",
                "В каком году вышла первая версия JAVA?"
        };

        // Массив вариантов ответов
        String[][] answerOptions = {
                {"33", "56", "31", "45"},
                {"Медведев Д.А.", "Брежнев Л.И", "Ельцин Б.Н.", "Путин В.В."},
                {"2001", "1996", "1990", "1994"}
        };

        // Массив правильных ответов
        int[] correctAnswers = {0, 2, 1};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answerOptions[i].length; j++) {
                System.out.println(j + 1 + ") " + answerOptions[i][j]);
            }


            while (true) {
                System.out.print("Ваш ответ (введите цифру правильного варианта ответа): ");
                if (scanner.hasNextInt()) {
                    break;
                } else {
                    String line = scanner.nextLine();
                }
            }
            int userAnswer = scanner.nextInt();

            if ((userAnswer - 1) == correctAnswers[i]) {
                correctCount++;
            } else {
                wrongCount++;
            }


            System.out.println();
        }

        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}