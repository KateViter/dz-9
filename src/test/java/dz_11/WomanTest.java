package dz_11;

import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTest {
    @Test(testName = "test constructor")
    public void testConstructor() {
        Woman woman = new Woman("Agni", "Barto", 19, "Kolin");
        Assert.assertEquals(woman.getFirstName(), "Agni", "first name is not valid");
        Assert.assertEquals(woman.getLastName(), "Barto", "last name is not valid");
        Assert.assertEquals(woman.getAge(), 19, "age is not valid");
        Assert.assertEquals(woman.getPartner(), "Kolin", "partner is not valid");
    }
    @Test(testName = "test retirement")
    public void testRetirement()  {
        Woman woman = new Woman("Agni", "Barto", 61, "Kolin");
        Assert.assertTrue(woman.isRetired(), "wrong calculated retirement when old");
        woman.setAge(60);
        Assert.assertFalse(woman.isRetired(), "wrong calculated retirement when young");
    }

    @Test()
    public void testRegisterPartnership() {
        Woman woman = new Woman("Agni", "Barto", 19, "Kolin");
        woman.registerPartnership("Bridgerton");
        Assert.assertEquals(woman.getLastName(), "Bridgerton", "wrong last name after registration");
    }

    @Test(testName = "test deregisterPartnership")
    public void testDeregisterPartnership() {
        Woman woman = new Woman("Agni", "Barto", 19, "Kolin");
        woman.registerPartnership("Bridgerton");
        woman.deregisterPartnership(true);
        Assert.assertEquals(woman.getLastName(), "Barto", "wrong last name after deregistration");
    }

    @Test(testName = "test first name", groups = "setters")
    public void testSetterFirstName() {
        Woman woman = new Woman("Agni", "Barto", 19, "Kolin");
        woman.setFirstName("Sofi");
        Assert.assertEquals(woman.getFirstName(), "Sofi", "first name is not valid");
    }

    @Test(testName = "test last name", groups = "setters")
    public void testSetterLastName() {
        Woman woman = new Woman("Agni", "Barto", 19, "Kolin");
        woman.setLastName("Lauren");
        Assert.assertEquals(woman.getLastName(), "Lauren", "last name is not valid");
    }

    @Test(testName = "test age", groups = "setters")
    public void testSetterAge() {
        Woman woman = new Woman("Agni", "Barto", 19, "Kolin");
        woman.setAge(21);
        Assert.assertEquals(woman.getAge(), 21, "age is not valid");
    }

    @Test(testName = "test partner", groups = "setters")
    public void testSetterPartner() {
        Woman woman = new Woman("Agni", "Barto", 19, "Kolin");
        woman.setPartner("Stefan");
        Assert.assertEquals(woman.getPartner(), "Stefan", "partner is not valid");
    }

}
