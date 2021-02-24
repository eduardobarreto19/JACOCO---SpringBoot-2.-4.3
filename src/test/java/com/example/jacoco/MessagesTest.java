package com.example.jacoco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MessagesTest {
    @Test
    public void testNameDailyCodeBuffer()
    {
        Messages obj = new Messages();
        Assertions.assertEquals("Hello Daily Code Buffer!", obj.getMessage("Daily Code Buffer"));
    }

    @Test
    public void testNameBlank()
    {
        Messages obj = new Messages();
        Assertions.assertEquals("Please Provide a name!", obj.getMessage(""));
    }

    @Test
    public void testNameNull()
    {
        Messages obj = new Messages();
        Assertions.assertEquals("Please Provide a name!", obj.getMessage(null));
    }

}