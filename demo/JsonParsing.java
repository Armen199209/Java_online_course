package demo;
import org.json.JSONObject;

public class JsonParsing {
    public static void main(String[] args){
        String stringAsJsonFormat = "{\"answer\":\"Hello, world\"}";
        String stringAsJsonFormat2 = "{\"answer2\":\"Hello2, world2\"}";

        JSONObject obj = new JSONObject(stringAsJsonFormat);
        JSONObject obj2 = new JSONObject(stringAsJsonFormat2);

        System.out.println(obj.getString("answer"));
        System.out.println(obj2.getString("answer2"));
    }
}
