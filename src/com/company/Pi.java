package com.company;

public class Pi {
    public void principal(){
        int i;
        double resp = 0;
        for (i = 1; i < 999999999;i++){
            resp = resp + (1/(Math.pow(i,2)));
        }

        resp = 6 * resp;
        System.out.println(Math.sqrt(resp));
    }
}
