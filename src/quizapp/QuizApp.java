package quizapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;
import static quizapp.CategoryQuestions.category;
import static quizapp.GeneralQuestions.general;

class QuizApp {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int choice;

        QuestionGeneration question[] = new QuestionGeneration[10];

        TheTimer t = new TheTimer();

        t.setTime1();


        System.out.print("Press '1' for Category Quiz '2' For Random Quiz : ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Category : ");
                String category = scanner.next();

                question = category(category);

                t.getTime1();
                for (int i = 0; i < question.length; i++) {
                    System.out.println("\nQuestion " + (i + 1) + question[i]);
                }
                int iii = scanner.nextInt();
                t.setTime2();
                t.getTime2();

                System.out.println("Minutes : " + t.getMinutes() + " Seconds : " + t.getSeconds());
                break;

            case 2:
                question = general();
                t.getTime1();

                for (int i = 0; i < question.length; i++) {
                    System.out.println("\nQuestion " + (i + 1) + question[i]);
                }
                int iiii = scanner.nextInt();
                t.setTime2();
                t.getTime2();

                System.out.println("Minutes : " + t.getMinutes() + " Seconds : " + t.getSeconds());
                break;
        }

        /*
         System.out.println("Enter Category in which questions are to be added from file");
         String cat = scanner.next();
         AddQuestionFromFile.add(cat);
         AddQuestion.add(cat);

         */
        /*
         System.out.println("Enter The Categories : ");
         String st = br.readLine();
         question = MultipleCategoryQuestions.multipleCategory(st);

         for (int i = 0; i < question.length; i++) {
         System.out.println("\nQuestion " + (i + 1) + question[i]);
         }
         */
        /*
         System.out.println("Press '1' to add a tabel '2' to delete :");
         choice = scanner.nextInt();
         switch (choice) {
         case 1:
         System.out.println("Enter The Table Name To Be Created : ");
         s = scanner.next();
         DatabaseResult.tableOperations(s, choice);
         break;

         case 2:
         System.out.println("Enter The Table Name To Be Deleted : ");
         s = scanner.next();
         DatabaseResult.tableOperations(s, choice);
         break;
         }*/
        /* TO ADD INTO THE HALL OF FAME TABLE IN DATABASE  */
        // HallOfFame.feedData("Topper", 100, 3.2);

        /* THE ARRAY RECIEVED CONTAINS TOP 10   */
        /* HallOfFame res[] = HallOfFame.getData();
         for (int i = 0; i < res.length; i++) {
         System.out.println("Rank " + (i + 1) + "  " + res[i]);
         }*/

    }
}
