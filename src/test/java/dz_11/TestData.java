package dz_11;

import org.example.Woman;
import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "womanSet")
    public Object[][] inputData(){
        return new Object[][]{
                {"Agni","Barto",19,"Nelson"},
                {"Nino","Black",36,"Wagner"},
                {"Luiza","Stout",107,"Koch"}
        };
    }

    @DataProvider(name = "womanIsRetired")
    public Object[][] isRetired() {
        Woman woman = new Woman("Agni","Barto",19,"Kolin");
        return new Object[][]{
                {woman,61},
                {woman,90},
                {woman,104}
        };
    }

    @DataProvider(name = "womanFirstName")
    public Object[][] firstName() {
        Woman woman = new Woman("Agni","Barto",19,"Kolin");
        return new Object[][]{
                {woman,"Sofie"},
                {woman,"Agatha"}
        };
    }

    @DataProvider(name = "womanLastName")
    public Object[][] lastName() {
        Woman woman = new Woman("Agni","Barto",19,"Kolin");
        return new Object[][]{
                {woman,"Lauren"},
                {woman,"Christie"},
                {woman,"Ol"}
        };
    }

    @DataProvider(name = "womanPartner")
    public Object[][] partner() {
        Woman woman = new Woman("Agni","Barto",19,"Kolin");
        return new Object[][]{
                {woman,"Custo"},
                {woman,"Finn"},
                {woman,"Beenhouwer"},
                {woman,"Zimmermann"}
        };
    }
}
