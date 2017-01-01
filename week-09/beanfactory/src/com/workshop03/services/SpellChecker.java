package com.workshop03.services;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ${SzilviaB} on 2017. 01. 01..
 */

public class SpellChecker {

    private String textWord;
    @Autowired(required = false)
    private String codeLanguage = "EN";

    public void setTextWord(String textWord) {
        this.textWord = textWord;
    }

    public SpellChecker(){
        System.out.println("Inside SpellChecker constructor." );
    }

    public void checkSpelling(String tx){
        System.out.printf("Inside checkSpelling, %s is a word.\n", tx );
    }

    public String toString(){
       return String.format("SpellChecking '%s' in '%s'\n",this.textWord,this.codeLanguage);
    }
}