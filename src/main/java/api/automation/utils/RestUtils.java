package api.automation.utils;
import api.automation.pojo.CoursePojo;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.Map;

import static api.automation.utils.CommonUtils.readPropertyFile;

public class RestUtils {

     String basePath;

    {
        try {
            basePath = readPropertyFile("config.properties").getProperty("basePath");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Response getAllCourses(String url){
        System.out.println(basePath);
        return  RestAssured.given()
                .header("content-type","application/json")
                .baseUri(basePath)
                .log().all()
                .get(url);

    }

    public Response getCourseWithParam(String path, Map map){
        return  RestAssured.given()
                .header("content-type","application/json")
                .baseUri(basePath)
                .queryParams(map)
                .log().all()
                .get(path);

    }
    public Response addCourse(String path){
        CoursePojo pojo=new CoursePojo();
        pojo.setId(16);
        pojo.setTitle("c programming");
        pojo.setDescription("c is a good programing language ");
        Gson gson = new Gson();
        gson.toJson(gson);

        return RestAssured.given()
                .header("content-type","application/json")
                .baseUri(basePath)
                .body(pojo)
                .log()
                .all()
                .post(path);

    }

    public Response updateCourse(String path){
        CoursePojo pojo=new CoursePojo();
        pojo.setTitle("advance java");
        pojo.setDescription("this course contains advance of java");


        return RestAssured.given()
                .header("content-type","application/json")
                .baseUri(path)
                .body(pojo)
                .log().all()
                .put(path);
    }


}
