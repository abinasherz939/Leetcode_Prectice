package com.company.execptionHandling;

public class userDefinedExeception extends Exception{
    String msg;
    userDefinedExeception (String msg){
        this.msg = msg;
    }
    public String toString () {
        return ("massage is " + msg);
    }
}
class userDefinedExecptionMain {
    public static void main(String[] args) {
        try {
            throw new userDefinedExeception("// written by me");
        }catch (userDefinedExeception exeception){
            System.out.println(exeception.toString());
        }

    }

}
