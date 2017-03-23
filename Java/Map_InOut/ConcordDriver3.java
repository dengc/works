import java.util.Scanner;
import java.util.Map;
import java.io.*;

/**
 * Finds frequency of each word in a file.
 * (Version for Exercise 3.)
 *
 * Optional command line argument is the threshold for the number of
 * letters a word must have to be printed with its number of occurrences.
 *
 * If argument isn't given, prints all words and number of occurrences.
 *
 */

public class ConcordDriver3 {


    public static void main(String[] args) throws IOException{

	int threshold = 0;

	if (args.length > 0) {
	    threshold = Integer.parseInt(args[0]);
	}


    Concord concord = new Concord();
    File newF = new File("t1");
    Scanner in = new Scanner(newF);

    concord.addData(in);

	// add code here to print out the selected entries
    concord.printSatisfying(System.out, new LargeWordPred(5));


    }

}


// add new class here
// public class LargeWordPred implements Predicate{
//
//     public int threshold;
//
//     public LargeWordPred(int num) {
//
//         threshold = num;
//     }
//
//     public boolean predicate(Map.Entry<String,Integer> item){
//
//         if(item.getKey().length()>=threshold){
//             return true;
//         }
//         return false;
//     }
// }
