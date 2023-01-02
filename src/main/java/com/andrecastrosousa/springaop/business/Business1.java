package com.andrecastrosousa.springaop.business;

import com.andrecastrosousa.springaop.aspect.TrackTime;
import com.andrecastrosousa.springaop.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private Dao1 dao1;

    @TrackTime
    public String calculateSomething() {
        return this.dao1.retrieveSomething();
    }
}
