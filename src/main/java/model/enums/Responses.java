package model.enums;

import java.util.Scanner;

public enum Responses {
    YES ("yes", true),
    NO ("no", true ),
    EMPTY ("no response", true );

    public final String message;

    Responses(String message, boolean b){
        this.message=message;
    }



    public String getMessage() {
        return message;
    }

    public Scanner toString(String yes) {
        return null;
    }
}
