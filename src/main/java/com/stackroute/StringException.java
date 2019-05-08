package com.stackroute;

public class StringException {
    StringException(String message) {
        message = "this is block to be execute";
        System.out.println(message);
    }

    public static void main(String[] args) throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("gets printed");
        }

    }
}

