package com.example.labcycle05;

class User {

    String name,password;
    int id;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public User(int id,String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public  void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.name = password;
    }
}
