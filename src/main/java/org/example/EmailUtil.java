package org.example;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class EmailUtil {

    public static String getEmailHostName(Email email) {
        return email.getHostName();
    }

    public static Email setEmailHostName(Email email, String hostName) throws Exception {
        email.setHostName(hostName);
        return email;
    }
}