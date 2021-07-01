package pages;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.testng.annotations.Test;
import variables.Var;


public class CRUDCard extends CRUDBoard {





    public void CreateCard_T1(String id ){
        String ID = CreateBoard_T1();
        HttpResponse<String> response = Unirest
                .post(Var.apiUrl+"/1/cards")
                .queryString("key", Var.key)
                .queryString("token", Var.token)
                .queryString("idList",id)
                .asString();

        System.out.println(response.getBody());

    }


    public void DeleteCard_T2(String Id){
        String ID = CreateBoard_T1();
        HttpResponse<String> response = Unirest
                .delete(Var.apiUrl+"/1/cards")
                .queryString("key", Var.key)
                .queryString("token", Var.token)
                .queryString("idList","60d80fcd0abcc46d0f4667fe")
                .asString();

        System.out.println(response.getBody());

    }

    public void UpdateCard_T3(String Id){
        String ID = CreateBoard_T1();
        HttpResponse<String> response = Unirest
                .put(Var.apiUrl+"/1/cards")
                .header("Accept", "application/json")
                .queryString("key", Var.key)
                .queryString("token", Var.token)
                .queryString("idList","60d80fcd0abcc46d0f4667fe")
                .asString();

        System.out.println(response.getBody());

    }

    public void GetCard_T3(String Id){
        String ID = CreateBoard_T1();
        HttpResponse<String> response = Unirest
                .get(Var.apiUrl+"/1/cards")
                .header("Accept", "application/json")
                .queryString("key", Var.key)
                .queryString("token", Var.token)
                .queryString("idList","60d80fcd0abcc46d0f4667fe")
                .asString();

        System.out.println(response.getBody());

    }
}
