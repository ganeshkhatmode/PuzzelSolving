package com.gk.object_;

import java.io.IOException;

public class ObjetCreateAndClose {
    public static void main(String[] args) throws IOException {
        try(Example example = new Example("Object", 1)){
            System.out.println("Example object :: "+example);
        }
    }
}
