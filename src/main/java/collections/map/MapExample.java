package collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));
        languages.put("Java", "this course is about Java");
        System.out.println(languages.get("Java"));

//        languages.remove("Lisp");
      //  languages.replace("Lisp", "a functional programming language");
        languages.replace("Lisp","That will not work" ,"a functional programming language");
      //  languages.replace("Lisp","Therein lies madness" ,"a functional programming language"); //that will work

        for(String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
