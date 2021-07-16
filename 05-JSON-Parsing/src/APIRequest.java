import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class APIRequest {
    static int count, totalViews;

    public static void main(String[] args) throws UnirestException, ParseException {
        /*
         * 1. GET Request
         */

        // GET Request from https://mocki.io/fake-json-api
        // Use this website to create a fake api

        HttpResponse<String> response = Unirest.get("https://mocki.io/v1/bed3d551-661c-447c-a647-7dfef37fb299")
                .asString();

        JSONParser parser = new JSONParser();
        JSONObject object = (JSONObject) parser.parse(response.getBody());

        // System.out.println(object.get("data"));

        object = (JSONObject) object.get("data");

        // System.out.println(object.get("posts"));

        JSONArray array = (JSONArray) object.get("posts");
        // System.out.println(array);

        array.stream().forEach(post -> {
            JSONObject obj = (JSONObject) post;
            totalViews += Integer.parseInt((obj.get("views").toString()));
            count++;
        });

        System.out.println("Average views: " + totalViews / (count * 1.0));

        // GET Request from localhost
        response = Unirest.get("http://localhost:8080/api-request/link.jsp?number=5").asString();
        System.out.println(response.getBody());

        /*
         * 2. POST Request
         */

        response = Unirest.post("http://localhost:8080/api-request/link.jsp")
                .header("Content-type", "application/x-www-form-urlencoded").field("number", 4).asString();

        System.out.println(response.getBody());

    }
}
