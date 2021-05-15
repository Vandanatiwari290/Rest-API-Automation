package functionalTesting;

import api.automation.utils.RestUtils;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class CreateCourse {
RestUtils restUtils=new RestUtils();
    @Test(description = "Provide all valid data",priority = 1)
    public void createCourseTest(){
        Response response=restUtils.addCourse("addCourses");
        System.out.println(response.prettyPrint());
       System.out.println(response.statusCode());
       System.out.println(response.statusLine());


    }
}
