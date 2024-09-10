package dz_11;

import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTest {

    @Test(testName = "test constructor", dataProvider = "womanSet", dataProviderClass = TestData.class)
    public void testConstructor(String womanName,String womanLastName,int womanAge,String womanPartner) {
        Woman woman = new Woman(womanName, womanLastName, womanAge, womanPartner);
        Assert.assertEquals(woman.getFirstName(), womanName, "first name is not valid");
        Assert.assertEquals(woman.getLastName(), womanLastName, "last name is not valid");
        Assert.assertEquals(woman.getAge(), womanAge, "age is not valid");
        Assert.assertEquals(woman.getPartner(), womanPartner, "partner is not valid");
    }
    @Test(testName = "test retirement", dataProvider = "womanIsRetired", dataProviderClass = TestData.class)
    public void testRetirement(Woman inputWoman,int retirementAge)  {
        Woman woman = new Woman(inputWoman.getFirstName(), inputWoman.getLastName(), inputWoman.getAge(), inputWoman.getPartner());
        Assert.assertFalse(woman.isRetired(), "wrong calculated retirement when young");
        woman.setAge(retirementAge);
        Assert.assertTrue(woman.isRetired(), "wrong calculated retirement when old");
    }

    @Test(testName = "test register partnership", dataProvider = "womanPartner", dataProviderClass = TestData.class)
    public void testRegisterPartnership(Woman inputWoman,String partnerLastName) {
        Woman woman = new Woman(inputWoman.getFirstName(), inputWoman.getLastName(), inputWoman.getAge(), inputWoman.getPartner());
        woman.registerPartnership(partnerLastName);
        Assert.assertEquals(woman.getLastName(), partnerLastName, "wrong last name after registration");
    }

    @Test(testName = "test deregisterPartnership", dataProvider = "womanPartner", dataProviderClass = TestData.class)
    public void testDeregisterPartnership(Woman inputWoman,String partnerLastName) {
        Woman woman = new Woman(inputWoman.getFirstName(), inputWoman.getLastName(), inputWoman.getAge(), inputWoman.getPartner());
        woman.registerPartnership(partnerLastName);
        woman.deregisterPartnership(true);
        Assert.assertEquals(woman.getLastName(), inputWoman.getLastName(), "wrong last name after deregistration");
    }

    @Test(testName = "test first name", groups = "setters", dataProvider = "womanFirstName", dataProviderClass = TestData.class)
    public void testSetterFirstName(Woman inputWoman,String ChangedName) {
        Woman woman = new Woman(inputWoman.getFirstName(), inputWoman.getLastName(), inputWoman.getAge(), inputWoman.getPartner());
        woman.setFirstName(ChangedName);
        Assert.assertEquals(woman.getFirstName(), ChangedName, "first name is not valid");
    }

    @Test(testName = "test last name", groups = "setters", dataProvider = "womanLastName", dataProviderClass = TestData.class)
    public void testSetterLastName(Woman inputWoman,String ChangedLastName) {
        Woman woman = new Woman(inputWoman.getFirstName(), inputWoman.getLastName(), inputWoman.getAge(), inputWoman.getPartner());
        woman.setLastName(ChangedLastName);
        Assert.assertEquals(woman.getLastName(), ChangedLastName, "last name is not valid");
    }

    @Test(testName = "test age", groups = "setters", dataProvider = "womanIsRetired", dataProviderClass = TestData.class)
    public void testSetterAge(Woman inputWoman,int retirementAge) {
        Woman woman = new Woman(inputWoman.getFirstName(), inputWoman.getLastName(), inputWoman.getAge(), inputWoman.getPartner());
        woman.setAge(retirementAge);
        Assert.assertEquals(woman.getAge(), retirementAge, "age is not valid");
    }

    @Test(testName = "test partner", groups = "setters", dataProvider = "womanPartner", dataProviderClass = TestData.class)
    public void testSetterPartner(Woman inputWoman,String ChangedPartner) {
        Woman woman = new Woman(inputWoman.getFirstName(), inputWoman.getLastName(), inputWoman.getAge(), inputWoman.getPartner());
        woman.setPartner(ChangedPartner);
        Assert.assertEquals(woman.getPartner(), ChangedPartner, "partner is not valid");
    }

}
