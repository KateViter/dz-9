package dz_11;

import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTest {
    private static final String womanName = "Agni";
    private static final String womanLastName = "Barto";
    private static final String womanPartner = "Kolin";
    private static final int womanAge = 19;

    private static final int retirementAge = 61;
    private static final String ChangedName = "Sofi";
    private static final String ChangedLastName = "Lauren";
    private static final String ChangedPartner = "Stefan";
    private static final String partnerLastName = "Bridgerton";

    @Test(testName = "test constructor")
    public void testConstructor() {
        Woman woman = new Woman(womanName, womanLastName, womanAge, womanPartner);
        Assert.assertEquals(woman.getFirstName(), womanName, "first name is not valid");
        Assert.assertEquals(woman.getLastName(), womanLastName, "last name is not valid");
        Assert.assertEquals(woman.getAge(), womanAge, "age is not valid");
        Assert.assertEquals(woman.getPartner(), womanPartner, "partner is not valid");
    }
    @Test(testName = "test retirement")
    public void testRetirement()  {
        Woman woman = new Woman(womanName, womanLastName, womanAge, womanPartner);
        Assert.assertFalse(woman.isRetired(), "wrong calculated retirement when young");
        woman.setAge(retirementAge);
        Assert.assertTrue(woman.isRetired(), "wrong calculated retirement when old");
    }

    @Test()
    public void testRegisterPartnership() {
        Woman woman = new Woman(womanName, womanLastName, womanAge, womanPartner);
        woman.registerPartnership(partnerLastName);
        Assert.assertEquals(woman.getLastName(), partnerLastName, "wrong last name after registration");
    }

    @Test(testName = "test deregisterPartnership")
    public void testDeregisterPartnership() {
        Woman woman = new Woman(womanName, womanLastName, womanAge, womanPartner);
        woman.registerPartnership(partnerLastName);
        woman.deregisterPartnership(true);
        Assert.assertEquals(woman.getLastName(), womanLastName, "wrong last name after deregistration");
    }

    @Test(testName = "test first name", groups = "setters")
    public void testSetterFirstName() {
        Woman woman = new Woman(womanName, womanLastName, womanAge, womanPartner);
        woman.setFirstName(ChangedName);
        Assert.assertEquals(woman.getFirstName(), ChangedName, "first name is not valid");
    }

    @Test(testName = "test last name", groups = "setters")
    public void testSetterLastName() {
        Woman woman = new Woman(womanName, womanLastName, womanAge, womanPartner);
        woman.setLastName(ChangedLastName);
        Assert.assertEquals(woman.getLastName(), ChangedLastName, "last name is not valid");
    }

    @Test(testName = "test age", groups = "setters")
    public void testSetterAge() {
        Woman woman = new Woman(womanName, womanLastName, womanAge, womanPartner);
        woman.setAge(retirementAge);
        Assert.assertEquals(woman.getAge(), retirementAge, "age is not valid");
    }

    @Test(testName = "test partner", groups = "setters")
    public void testSetterPartner() {
        Woman woman = new Woman(womanName, womanLastName, womanAge, womanPartner);
        woman.setPartner(ChangedPartner);
        Assert.assertEquals(woman.getPartner(), ChangedPartner, "partner is not valid");
    }

}
