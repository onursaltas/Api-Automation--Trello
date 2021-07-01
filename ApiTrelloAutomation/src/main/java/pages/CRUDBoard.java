package pages;

import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.testng.Assert;
import org.testng.annotations.Test;
import variables.Var;


import static io.restassured.RestAssured.given;

public class CRUDBoard {



    public String CreateBoard_T1() {
        HttpResponse<String> response = Unirest
                .post(Var.apiUrl+"/1/boards/")
                .queryString("key", Var.key)
                .queryString("token", Var.token)
                .queryString("name", "{cagatay}")
                .asString();

        System.out.println(response.getBody());

        String OutputId=response.getBody();
        io.restassured.path.json.JsonPath js=new io.restassured.path.json.JsonPath(OutputId);
        OutputId=js.get("id");
        System.out.println(OutputId);

        return  OutputId;

    }



    public void UpdateBoard_T2() {
        HttpResponse<String> response = Unirest
                .put(Var.apiUrl+"/1/boards/60d81533ad193843efa591b9")
                .queryString("key", Var.key)
                .queryString("token", Var.token)

                .asString();

        System.out.println(response.getBody());

        String OutputId=response.getBody();
        io.restassured.path.json.JsonPath js=new io.restassured.path.json.JsonPath(OutputId);
        OutputId=js.get("id");
        System.out.println(OutputId);

    }


    public void DeleteBoard_T3() {
        HttpResponse<String> response = Unirest
                .delete(Var.apiUrl+"/1/boards/60d81533ad193843efa591b9")
                .queryString("key", Var.key)
                .queryString("token", Var.token)
                .asString();

        System.out.println(response.getBody());

    }


    public void GetBoard_T4() {
        HttpResponse<JsonNode> response = Unirest
                .get(Var.apiUrl+"/1/boards/60d81533ad193843efa591b9")
                .header("Accept", "application/json")
                .queryString("key", Var.key)
                .queryString("token", Var.token)
                .asJson();

        System.out.println(response.getBody());

    }


    public void GetMemebershipBoard_T5() {
        HttpResponse<JsonNode> response = Unirest
                .get(Var.apiUrl+"/1/boards/60d81533ad193843efa591b9/memberships")
                .header("Accept", "application/json")
                .queryString("key", Var.key)
                .queryString("token", Var.token)
                .asJson();

        System.out.println(response.getBody());


    }





}



