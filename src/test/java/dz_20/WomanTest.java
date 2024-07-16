package dz_20;

import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTest {

    @Test(testName = "test constructor")
    public void testConstructor() {
        Woman man = new Woman("Agni", "Barto", 19, "Kolin");
        Assert.assertEquals(man.getFirstName(), "Agni", "first name is not valid");
        Assert.assertEquals(man.getLastName(), "Barto", "last name is not valid");
        Assert.assertEquals(man.getAge(), 19, "age is not valid");
        Assert.assertEquals(man.getPartner(), "Kolin", "partner is not valid");
    }

    @Test(testName = "test retirement")
    public void testRetirement()  {
        Woman man = new Woman("Agni", "Barto", 61, "Kolin");
        Assert.assertTrue(man.isRetired(), "wrong calculated retirement when old");
        man.setAge(60);
        Assert.assertFalse(man.isRetired(), "wrong calculated retirement when young");
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
        Woman man = new Woman("Agni", "Barto", 19, "Kolin");
        man.setFirstName("Sofi");
        Assert.assertEquals(man.getFirstName(), "Sofi", "first name is not valid");
    }

    @Test(testName = "test last name", groups = "setters")
    public void testSetterLastName() {
        Woman man = new Woman("Agni", "Barto", 19, "Kolin");
        man.setLastName("Lauren");
        Assert.assertEquals(man.getLastName(), "Lauren", "last name is not valid");
    }

    @Test(testName = "test age", groups = "setters")
    public void testSetterAge() {
        Woman man = new Woman("Agni", "Barto", 19, "Kolin");
        man.setAge(21);
        Assert.assertEquals(man.getAge(), 21, "age is not valid");
    }

    @Test(testName = "test partner", groups = "setters")
    public void testSetterPartner() {
        Woman man = new Woman("Agni", "Barto", 19, "Kolin");
        man.setPartner("Stefan");
        Assert.assertEquals(man.getPartner(), "Stefan", "partner is not valid");
    }
}