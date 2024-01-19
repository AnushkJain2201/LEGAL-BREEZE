package utils;

import java.io.IOException;
import java.io.InputStream;

import javax.json.Json;

public class AppUtility {
    public static boolean checkGoogleRecaptchaResponse(String recaptchaURL, String responseToken, String secretKey) throws IOException{
        boolean flag=true;
        String url = recaptchaURL+ "?secret=" + secretKey + "&response=" + responseToken;
        InputStream is = ThirdPartyServer.sendThirdPartyRequest(url);

        flag = Json.createReader(is).readObject().getBoolean("success");
        return flag;
    }
}
