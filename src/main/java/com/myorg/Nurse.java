package com.myorg;

import org.springframework.stereotype.Component;

@Component
public class Nurse implements  Staff{
    public void assist(){
        System.out.println("Nurse is asssisting");
    }
}
