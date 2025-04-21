package com.juaracoding.maintest;



public class Fungsi1 {

    public Boolean login(String username, String password){
        if(username.equals("paul") && password.equals("Paul@123")){
            return true;
        }
        return false;
    }

    public Boolean insert(String strCondition){
        if(!strCondition.equals("data")){
            return false;
        }
        return true;
    }

    public Boolean update(Long id,String strCondition){
        if(!strCondition.equals("data")){
            return false;
        }
        if(id == null){
            return false;
        }
        
        return true;
    }
}
