package dz_11;

import org.example.Man;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTest {
    private static final String manName = "Sergey";
    private static final String manLastName = "Lukyanenko";
    private static final String manPartner = "Luiza";
    private static final int manAge = 37;

    private static final int retirementAge = 66;
    private static final String ChangedName = "Ivan";
    private static final String ChangedLastName = "Ivanov";
    private static final String ChangedPartner = "Natalia";

    @Test(testName = "test constructor")
    public void testConstructor() {
        Man man = new Man(manName, manLastName, manAge, manPartner);
        Assert.assertEquals(man.getFirstName(), manName, "first name is not valid");
        Assert.assertEquals(man.getLastName(), manLastName, "last name is not valid");
        Assert.assertEquals(man.getAge(), manAge, "age is not valid");
        Assert.assertEquals(man.getPartner(), manPartner, "partner is not valid");
    }
    @Test(testName = "test retirement")
    public void testRetirement()  {
        Man man = new Man(manName, manLastName, manAge, manPartner);
        Assert.assertFalse(man.isRetired(), "wrong calculated retirement when young");
        man.setAge(retirementAge);
        Assert.assertTrue(man.isRetired(), "wrong calculated retirement when old");

    }

    @Test(testName = "test first name", groups = "setters")
    public void testSetterFirstName() {
        Man man = new Man(manName, manLastName, manAge, manPartner);
        man.setFirstName(ChangedName);
        Assert.assertEquals(man.getFirstName(), ChangedName, "first name is not valid");
    }

    @Test(testName = "test last name", groups = "setters")
    public void testSetterLastName() {
        Man man = new Man(manName, manLastName, manAge, manPartner);
        man.setLastName(ChangedLastName);
        Assert.assertEquals(man.getLastName(), ChangedLastName, "last name is not valid");
    }

    @Test(testName = "test age", groups = "setters")
    public void testSetterAge() {
        Man man = new Man(manName, manLastName, manAge, manPartner);
        man.setAge(retirementAge);
        Assert.assertEquals(man.getAge(), retirementAge, "age is not valid");
    }

    @Test(testName = "test partner", groups = "setters")
    public void testSetterPartner() {
        Man man = new Man(manName, manLastName, manAge, manPartner);
        man.setPartner(ChangedPartner);
        Assert.assertEquals(man.getPartner(), ChangedPartner, "partner is not valid");
    }
}
