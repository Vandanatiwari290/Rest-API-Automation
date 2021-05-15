package functionalTesting;

import api.automation.utils.RestUtils;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class UpdateCourseTest {
    RestUtils restUtils=new RestUtils();


    @Test
    public void updateCourse(){
 /*       Map map=new HashMap();
        map.put("courseId",12);*/
      Response response=restUtils.updateCourse("/courses/12");
        System.out.println(response.prettyPrint());

    }


}
