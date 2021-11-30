package api;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SMSTest {
    public static void main(String[] args) {
        String api_key = "NCS5FYK77D9LAFN2";
        String api_secret = "7LK6XQNXLUMEUAAG46LBRIUDV7SP1IDE";
        Message coolsms = new Message(api_key, api_secret);

        // 4 params(to, from, type, text) are mandatory. must be filled
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("to", "01046275401");
        params.put("from", "01046275401");
        params.put("type", "SMS");
        params.put("text", "정우야 포기는 배추썰때나 하는거란다!");
        params.put("app_version", "test app 1.2"); // application name and version

        Random rand = new Random();
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%^&*()_+{};'./,";
        String result = "";
        for (int i = 0; i < 5; i++) {
            int idx = rand.nextInt(source.length());
            result += source.charAt(idx);
        }
        System.out.println(result);

//        try {
//            JSONObject obj = (JSONObject) coolsms.send(params);
//            System.out.println(obj.toString());
//        } catch (CoolsmsException e) {
//            System.out.println(e.getMessage());
//            System.out.println(e.getCode());
//        }
    }
}
