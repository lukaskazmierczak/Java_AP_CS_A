import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import net.apcs.Input;

public class Dictionary {

    ArrayList<String> words = new ArrayList<String>();

    // CONSTRUCTOR
    public Dictionary() {
        Scanner infile;
        try {
            infile = new Scanner(new File("textfiles/words.txt"));
            while(infile.hasNext()) {
                String s = infile.nextLine();
                words.add(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }



    // TO STRING
    @Override
    public String toString() {
        return "Dictionary{" +
                "words=" + words +
                '}';
    }

    ///////////////////  MAIN METHOD FOR TESTING ////////////////
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        System.out.println(dictionary);
    }
    /////////////// END MAIN METHOD FOR TESTING ///////////////
}
