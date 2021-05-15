package functionalTesting;
import api.automation.utils.RestUtils;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;

public class GetCourses {
    RestUtils restUtils=new RestUtils();

    @Test(description = "provide all valid data and get the course list",priority = 1)
    public void getRequest(){
        Response response=restUtils.getAllCourses("courses");
       System.out.println(response.prettyPrint());


    }

    @Test(description = "provide valid course id and get the details",priority = 2)
    public void getRequestWithParam(){

        Map map=new HashMap();
        map.put("courseId",12);
        Response response=restUtils.getCourseWithParam("course",map);
        System.out.println(response.prettyPrint());


    }




}
