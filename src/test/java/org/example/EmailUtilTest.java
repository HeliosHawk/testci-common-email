package org.example;

import org.apache.commons.mail.SimpleEmail;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmailUtilTest {

    @Test
    public void testSetHostName() throws Exception {
        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        assertEquals("smtp.gmail.com", email.getHostName());
    }

    @Test
    public void testGetHostName() throws Exception {
        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.yahoo.com");
        String result = EmailUtil.getEmailHostName(email);
        assertEquals("smtp.yahoo.com", result);
    }
}