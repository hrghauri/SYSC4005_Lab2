package com.company;

import java.util.ArrayList;
public class mySystem {

    private Server server;
    private ArrayList<Event> eventList;
    private double clock;

    public mySystem() {
        this.server = new Server();
        this.eventList = new ArrayList<Event>();
        this.clock = 0;
    }
}
