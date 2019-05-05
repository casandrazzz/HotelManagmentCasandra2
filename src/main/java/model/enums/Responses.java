package model.enums;

import java.util.Scanner;

public enum Responses {
    YES ("yes"),
    NO ("no"),
    EMPTY ("no response");

    public final String message;

    Responses(String message){
        this.message=message;
    }



    public String getMessage() {
        return message;
    }

    public Scanner toString(String yes) {
        return null;
    }
}
