package tests;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.testng.annotations.Test;
import pages.CRUDBoard;
import variables.Var;
import pages.CRUDCard;

public class TestInOnePage extends CRUDCard {

    @Test
    public void TestCases(){

        String id = CreateBoard_T1();
        CreateCard_T1(id);
        CreateCard_T1(id);
        UpdateCard_T3(id);
        DeleteCard_T2(id);
        DeleteBoard_T3();

    }
}
