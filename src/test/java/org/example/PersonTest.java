package org.example;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void test_getName() {
        Person person = new Person("John Doe");
        Assert.assertEquals("John Doe", person.name());
    }
}
