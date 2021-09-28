package com.example.fragments.data;

import com.example.fragments.models.User;

import java.util.ArrayList;

public class UserService {

    private ArrayList<User> list;

    public ArrayList<User> getUserList(){
        list = new ArrayList<>();
        list.add(new User("Ololo","LOLOL"));
        list.add(new User("Jojo1","Ololo"));
        list.add(new User("Jojsafo","Ololo"));
        list.add(new User("Jojo3","Ololo"));
        list.add(new User("Joj12o","Ololo"));
        list.add(new User("Jojdsfo","Ololo"));
        list.add(new User("Jojo2412","Ololo"));
        list.add(new User("Joqw67jo","Ololo"));
        list.add(new User("Joddsfjo","Ololo"));
        list.add(new User("Ololo","LOLOL"));
        return list;
    }

}
