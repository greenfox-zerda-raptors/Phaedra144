package com.workshop03.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ${SzilviaB} on 2017. 01. 01..
 */
@Component
public class TextEditor {
    @Autowired
    private SpellChecker spellChecker;

    public TextEditor() {
    }

////    @Autowired
//    public TextEditor(SpellChecker spCh){
//        System.out.println("Inside TextEditor constructor." );
//        this.spellChecker=spCh;
//    }
//
////    @Autowired
//    public void setSpellChecker(SpellChecker spellChecker){
//        this.spellChecker = spellChecker;
//    }
//
//    public SpellChecker getSpellChecker( ) {
//        return spellChecker;
//    }

    public void spellCheck(String tx) {
        spellChecker.checkSpelling(tx);
    }

    public String printing(String tx){
        spellChecker.setTextWord(tx);
        return spellChecker.toString();
    }
}
