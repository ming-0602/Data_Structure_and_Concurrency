package Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "src/Lab1/hamlet.txt";

        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
//                    System.out.println( word);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        tryhash();
        System.out.println();
//        trytree();
        System.out.println();
        trymap();
    }

    public static void trytree(){
        String fileName = "src/Lab1/hamlet.txt";
        Set<String> treelist = new TreeSet<>();
        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
//                    System.out.println( word);
                    treelist.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Iterator<String> treeiterator = treelist.iterator();
        while(treeiterator.hasNext()){
            System.out.println(treeiterator.next());
        }
    }

    public static void tryhash(){
        String fileName = "src/Lab1/hamlet.txt";
        Set<String> hashlist = new HashSet<>();
        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
//                    System.out.println( word);
                    hashlist.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Iterator<String> hashiterator = hashlist.iterator();
        while(hashiterator.hasNext()){
            System.out.println(hashiterator.next());
        }
    }


    public static void trymap(){

        String fileName = "src/Lab1/hamlet.txt";
        Map<String, Set<Integer>> storage = new TreeMap<>();

        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();

                    if(storage.containsKey(word)){
                        storage.get(word).add(lineNumber);
                    }else{
                        Set<Integer> tem = new HashSet<>();
                        tem.add(lineNumber);
                        storage.put(word, tem);
                    }


//                    storage.put(word, lineNumber.add);
                }
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Set<String> keySet = storage.keySet();
        for (String key: keySet) {
            System.out.println(key + " : " + storage.get(key));
        }


        String searchword = "dsad";

        if (storage.containsKey(searchword)){
            System.out.println(searchword + " value is " + storage.get(searchword));
        }else {
            System.out.println(searchword + " does not exist");
        }

    }
}
