package com.example102.demo.services;

import org.springframework.stereotype.Service;


//falta crear su controller
@Service
public class FormularioService{
    public boolean VerifyAnswer(int n){
        if(n == 3){
            return true;
        }
        return false;
    }
}
