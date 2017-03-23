import java.io.*;
import java.util.*;

// add new class here
public class LargeWordPred implements Predicate{

    public int threshold;

    public LargeWordPred(int num) {

        threshold = num;
    }

    public boolean predicate(Map.Entry<String,Integer> item){

        if(item.getKey().length()>=threshold){
            return true;
        }
        return false;
    }
}
