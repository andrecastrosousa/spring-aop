package com.andrecastrosousa.springaop.data;

import com.andrecastrosousa.springaop.aspect.TrackTime;
import org.springframework.stereotype.Service;

@Service
public class Dao1 {

    @TrackTime
    public String retrieveSomething() {
        return "Dao1";
    }
}
