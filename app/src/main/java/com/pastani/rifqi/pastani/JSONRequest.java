package com.pastani.rifqi.pastani;

import java.util.HashMap;

/**
 * Created by Rifqi on 5/9/2017.
 */

public class JSONRequest {

    public static HashMap<String, Object> getUserProfile(){
        /**
         * fire up json request, then process the resopnse from server
         */
        HashMap<String, Object> dataBundle = new HashMap<>();
        dataBundle.put("username", "Rifqi");
        dataBundle.put("coop-point", new Integer(900));
        return dataBundle;
    }

    public static boolean login(String username, String password){
        return username.toString().equals("farmer") && password.toString().equals("petani123");
    }
}
