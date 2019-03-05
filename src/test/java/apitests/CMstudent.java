package apitests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class CMstudent {
    @Test
    public void studentList(){
      Response response = RestAssured.get("http://cybertekchicago.com/instructor/all");
        System.out.println(response.statusCode());
        Assert.assertEquals(response.statusCode(),200);
        System.out.println(response.asString());
        JsonPath jp = response.jsonPath();
        int b = jp.get("batch");
        System.out.println(b);
        String fn= jp.get("firstName");
        System.out.println(fn);
        String email =jp.get("contact.emailAddres");
        System.out.println(email);

    }



}
