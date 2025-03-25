package com.project.shopapp.exceptions;

import org.springframework.beans.factory.annotation.Autowired;


public class DataNotFoundException extends Exception{

    public DataNotFoundException(String message) {
        super(message);
    }
}
