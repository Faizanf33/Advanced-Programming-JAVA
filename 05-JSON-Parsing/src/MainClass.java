
/*
    To run with external libraries:
    $ javac filename.java -cp file.jar
*/
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MainClass {
    public static void main(String[] args) throws ParseException {
        String string1 = "[1,2,3,4,5,6,7,8,9,10]";
        String string2 = "{\"name\" : \"Faizan Ahmad\", \"roll-no\" : \"17P-6020\", \"cgpa\" : \"2.43\"}";
        String string3 = "[{\"name\" : \"Ali Ghulam\", \"marks\" : \"61.5\"}, {\"name\" : \"Faizan Ahmad\", \"marks\" : \"68.2\"}, {\"name\" : \"Muhammad Hafeez Ullah\", \"marks\" : \"48.8\"}]";
        JSONParser parser = new JSONParser();

        // Working with string1
        Object object = parser.parse(string1);
        JSONArray jArray = (JSONArray) object; // Typecasting to JSONArray
        jArray.stream().forEach(var -> System.out.print(var + " "));

        System.out.println();

        // Working with string2
        object = parser.parse(string2);

        JSONObject jObject = (JSONObject) object; // Typecasting to JSONObject
        System.out.println(jObject.get("name"));
        System.out.println(jObject.get("roll-no"));
        System.out.println(jObject.get("cgpa"));

        // Working with string3
        object = parser.parse(string3);
        jArray = (JSONArray) object; // Typecasting to JSONArray
        jArray.stream().forEach(var -> {
            JSONObject obj = (JSONObject) var;

            String name = obj.get("name").toString();
            Double marks = Double.parseDouble(obj.get("marks").toString());

            if (marks >= 50.0)
                System.out.println(name + " passed with " + marks + " marks");

            else
                System.out.println(name + " passed with " + marks + " marks");
        });

    }
}
