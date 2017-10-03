package model.user;

import model.internship.Internship;

import java.util.ArrayList;
import java.util.List;

public class UserBuilder {

    private String firstName = "";

    private String lastName = "";

    private String infix = "";

    private String email = "";

    private String password = "";

    private boolean isModerator = false;


    public UserBuilder firstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public UserBuilder lastname(String lastName){
        this.lastName = lastName;
        return this;
    }

    public UserBuilder infix(String infix){
        this.infix = infix;
        return this;
    }

    public UserBuilder email(String email){
        this.email = email;
        return this;
    }

    public UserBuilder password(String password){
        this.password = password;
        return this;
    }

    public UserBuilder isModerator(boolean isModerator){
        this.isModerator = isModerator;
        return this;
    }

    public User build(){
        return new User(firstName,lastName,infix,email,password,isModerator);
    }

}
