package my_spring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ElfTest {

    @Test
    public void testInjectRandomIntIsDoingSomething() {
        Elf elf = ObjectFactory.getInstance().createObject(Elf.class);
        Assert.assertNotEquals(0,elf.getSpeed());
        Assert.assertNotEquals(0,elf.getPower());
        System.out.println("elf = " + elf);
    }
}