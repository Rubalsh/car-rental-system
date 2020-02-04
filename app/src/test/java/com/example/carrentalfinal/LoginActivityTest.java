package com.example.carrentalfinal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoginActivityTest {

    LoginActivity loginActivity = null;

    @Before
    public void setUp() throws Exception {
        loginActivity = new LoginActivity();
    }

    @After
    public void tearDown() throws Exception {
        loginActivity = null;
    }

    @Test
    public void adduserintofirebase() {
        loginActivity.adduserintofirebase("subash");
        assertEquals("subash","subash");
    }
}