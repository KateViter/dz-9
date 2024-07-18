package dz_11;

import org.example.Man;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTest {
    @Test(testName = "test constructor")
    public void testConstructor() {
        Man man = new Man("Sergey", "Lukyanenko", 37, "Luiza");
        Assert.assertEquals(man.getFirstName(), "Sergey", "first name is not valid");
        Assert.assertEquals(man.getLastName(), "Lukyanenko", "last name is not valid");
        Assert.assertEquals(man.getAge(), 37, "age is not valid");
        Assert.assertEquals(man.getPartner(), "Luiza", "partner is not valid");
    }
    @Test(testName = "test retirement")
    public void testRetirement()  {
        Man man = new Man("Sergey", "Lukyanenko", 66, "Luiza");
        Assert.assertTrue(man.isRetired(), "wrong calculated retirement when old");
        man.setAge(65);
        Assert.assertFalse(man.isRetired(), "wrong calculated retirement when young");
    }

    @Test(testName = "test first name", groups = "setters")
    public void testSetterFirstName() {
        Man man = new Man("Sergey", "Lukyanenko", 37, "Luiza");
        man.setFirstName("Ivan");
        Assert.assertEquals(man.getFirstName(), "Ivan", "first name is not valid");
    }

    @Test(testName = "test last name", groups = "setters")
    public void testSetterLastName() {
        Man man = new Man("Sergey", "Lukyanenko", 37, "Luiza");
        man.setLastName("Ivanov");
        Assert.assertEquals(man.getLastName(), "Ivanov", "last name is not valid");
    }

    @Test(testName = "test age", groups = "setters")
    public void testSetterAge() {
        Man man = new Man("Sergey", "Lukyanenko", 37, "Luiza");
        man.setAge(38);
        Assert.assertEquals(man.getAge(), 38, "age is not valid");
    }

    @Test(testName = "test partner", groups = "setters")
    public void testSetterPartner() {
        Man man = new Man("Sergey", "Lukyanenko", 37, "Luiza");
        man.setPartner("Liza Ivanova");
        Assert.assertEquals(man.getPartner(), "Liza Ivanova", "partner is not valid");
    }
}
