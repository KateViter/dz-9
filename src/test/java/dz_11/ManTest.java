package dz_11;

import org.example.Man;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ManTest {

    @DataProvider(name = "inputData")
    public Object[][] manData() {
        return new Object[][]{
                {"Sergey","Lukyanenko","Luiza",37,"Ivan","Ivanov","Natalia",66},
                {"Paul","Kalkbrenner","Marie",42,"Roy","Belinskiy","Gorgia",99},
                {"Kristopher","Paoilini","Diana",53,"Stefan","White","Mi",112}
        };
    }

    @Test(testName = "test constructor",dataProvider = "inputData")
    public void testConstructor(String manName, String manLastName, String manPartner, int manAge,
                                String ignoredChangedName, String ignoredChangedLastName,
                                String ignoredChangedPartner, int ignoredRetirementAge) {
        Man man = new Man(manName, manLastName, manAge, manPartner);
        Assert.assertEquals(man.getFirstName(), manName, "first name is not valid");
        Assert.assertEquals(man.getLastName(), manLastName, "last name is not valid");
        Assert.assertEquals(man.getAge(), manAge, "age is not valid");
        Assert.assertEquals(man.getPartner(), manPartner, "partner is not valid");
    }
    @Test(testName = "test retirement", dataProvider = "inputData")
    public void testRetirement(String manName, String manLastName, String manPartner, int manAge,
                               String ignoredChangedName, String ignoredChangedLastName,
                               String ignoredChangedPartner, int retirementAge)  {
        Man man = new Man(manName, manLastName, manAge, manPartner);
        Assert.assertFalse(man.isRetired(), "wrong calculated retirement when young");
        man.setAge(retirementAge);
        Assert.assertTrue(man.isRetired(), "wrong calculated retirement when old");

    }

    @Test(testName = "test first name", groups = "setters", dataProvider = "inputData")
    public void testSetterFirstName(String manName, String manLastName, String manPartner, int manAge,
                                    String ChangedName, String ignoredChangedLastName,
                                    String ignoredChangedPartner, int ignoredRetirementAge) {
        Man man = new Man(manName, manLastName, manAge, manPartner);
        man.setFirstName(ChangedName);
        Assert.assertEquals(man.getFirstName(), ChangedName, "first name is not valid");
    }

    @Test(testName = "test last name", groups = "setters", dataProvider = "inputData")
    public void testSetterLastName(String manName, String manLastName, String manPartner, int manAge,
                                   String ignoredChangedName, String ChangedLastName,
                                   String ignoredChangedPartner, int ignoredRetirementAge) {
        Man man = new Man(manName, manLastName, manAge, manPartner);
        man.setLastName(ChangedLastName);
        Assert.assertEquals(man.getLastName(), ChangedLastName, "last name is not valid");
    }

    @Test(testName = "test age", groups = "setters", dataProvider = "inputData")
    public void testSetterAge(String manName, String manLastName, String manPartner, int manAge,
                              String ignoredChangedName, String ignoredChangedLastName,
                              String ignoredChangedPartner, int retirementAge) {
        Man man = new Man(manName, manLastName, manAge, manPartner);
        man.setAge(retirementAge);
        Assert.assertEquals(man.getAge(), retirementAge, "age is not valid");
    }

    @Test(testName = "test partner", groups = "setters", dataProvider = "inputData")
    public void testSetterPartner(String manName, String manLastName, String manPartner, int manAge,
                                  String ignoredChangedName, String ignoredChangedLastName,
                                  String ChangedPartner, int ignoredRetirementAge) {
        Man man = new Man(manName, manLastName, manAge, manPartner);
        man.setPartner(ChangedPartner);
        Assert.assertEquals(man.getPartner(), ChangedPartner, "partner is not valid");
    }
}
