import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomSentence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();


        //EACH LIST SHOULD HAVE BETWEEN 3 TO 10 ENTRIES
        int verbLength = random.nextInt(7) + 3;
        int subjectLength = random.nextInt(7) + 3;
        int objectLength = random.nextInt(7) + 3;

//        System.out.println(subjectLength);
//        System.out.println(verbLength);
//        System.out.println(objectLength);



        //        SUBJECT
        String [] subjectArray = new String[subjectLength];
        System.out.printf("Enter %d subjects \n", subjectLength);
        String subject = "";
        //FILL SUBJECT ARRAY
        for (int i = 0; i < subjectLength; i++){
            System.out.printf("Subject # %d :\n", i+1);
            subject = input.nextLine();
            subjectArray[i] = subject;
        }
        System.out.println(Arrays.toString(subjectArray));


        //        VERBS
        String [] verbArray = new String[verbLength];
        System.out.printf("Enter %d verbs \n", verbLength);
        String verb = "";
        //FILL VERB ARRAY
        for (int i = 0; i < verbLength; i++){
            System.out.printf("Verb # %d :\n", i+1);
            verb = input.nextLine();
            verbArray[i] = verb;
        }
        System.out.println(Arrays.toString(verbArray));


        //        OBJECTS
        String [] objectArray = new String[objectLength];
        System.out.printf("Enter %d objects \n", objectLength);
        String object = "";
        //FILL OBJECT ARRAY
        for (int i = 0; i < objectLength; i++){
            System.out.printf("Object # %d :\n", i+1);
            object = input.nextLine();
            objectArray[i] = object;
        }
        System.out.println(Arrays.toString(objectArray));




//        MAKING SENTENCES
        int subjectNum, verbNum, objectNum = 0;
        String userContinue = "";
        System.out.println("Do you want to create a random sentence? (y/n)");
        userContinue = input.nextLine();

        while (!userContinue.equalsIgnoreCase("n")) {
            subjectNum = random.nextInt(subjectLength);
            verbNum = random.nextInt(verbLength);
            objectNum = random.nextInt(objectLength);

            System.out.println(subjectArray[subjectNum] + " " + verbArray [verbNum]+ " " + objectArray[objectNum]);
            System.out.println("Do you want to create another random sentence? (y/n)");
            userContinue = input.nextLine();
        }

        System.out.println("Thank you for playing!");


    }
}
