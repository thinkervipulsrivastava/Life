package com.daily.status.jacoco;

public class Message {

    public String getMessage(String name)
    {
        StringBuilder s = new StringBuilder();
        if(name == null || name.trim().length() == 0)
        {
            s = s.append("Please Provide a name!");
        }
        else
        {
            s.append("Hello " + name + "!");
        }
        return s.toString();
    }
}
