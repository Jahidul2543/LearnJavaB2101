package restapi;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import okhttp3.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

import static io.restassured.RestAssured.given;

public class TokenAPI {

    public static void main(String[] args) throws IOException {
        submitTest();
    }

    public static String getToken() throws IOException {

        /**
         * 1. Get Token /oauth2/token
         * 2. Submit /test/submit
         * What do we need to make a call to get Token?
         * a. Host Name
         * b. End Point
         * c. Body
         * d. Authorization -->
         * e. Send headers Content-Type, Authorization
         * f. What type call POST
         * Processing the response
         * a. Validated Status Code
         * b. Get access_token and store in a variable
         *
         * */

        String token = null;

        String hostName = "https://izaan-test.auth.us-east-1.amazoncognito.com";
        String endpoint = "/oauth2/token";
        String url = hostName + endpoint;

        OkHttpClient client = new OkHttpClient.Builder().build();
        // Defining what type of information we are sending in the body
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        // Define Content/Body
        RequestBody body = RequestBody.create(mediaType, "scope=izaan_test/post_info&grant_type=client_credentials");
        // Encode username and password
        String encoding = Base64.getEncoder().encodeToString(("1u5io4va9sr45n79fceg2damjf:1qbkthvp7lbc7aavuhhmfg8f2crekor9h2h7abu2oru1nlpj71fe").getBytes("UTF-8"));
        String authorization = "Basic " + encoding;
        System.out.println(authorization);
//        int myString = authorization.split(" ")[0].length();
//        System.out.println(myString);
        // Define complete request
        Request request = new Request.Builder()
                .url(url)
                .method("POST", body)
                .addHeader("Authorization", authorization)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response);
        // Convert responseBody as String
        String responseBody = response.body().string();
        System.out.println(responseBody);
        // Convert String jsonbody to JsonPath object
        JsonPath jsonPath = new JsonPath(responseBody);

        token = jsonPath.get("access_token");
        System.out.println(token);

        token = "Bearer " + token;
        client.connectionPool().evictAll();
        return token;
    }

    public static void submitTest() throws IOException {
        // /Users/jahidul/IdeaProjects/APIAutomatinByRestAssured/payloads/submit.json
        String url = "https://5x9m5ed0tj.execute-api.us-east-1.amazonaws.com/test/submit";
        String submitPayload = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+ "/payloads/submit.json")));

        RequestSpecification requestSpecification = given().body(submitPayload);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.header("Authorization", getToken());
        io.restassured.response.Response response = requestSpecification.post(url);

        String responseBody = response.asString();
        System.out.println(responseBody);
        JsonPath jsonPath = new JsonPath(responseBody);
        String message = jsonPath.get("message");

        System.out.println(message);
        //Assert.assertEquals(actualUserName, "123JohnJohn");

    }
}
