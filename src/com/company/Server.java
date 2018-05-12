package com.company;

import java.util.ArrayList;
public class Server {
    private boolean busy;
    private ArrayList<Double> serviceTimes;

    public Server(){
        this.busy = false;
        serviceTimes = new ArrayList<Double>();
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public Double getServiceTime() {
        return serviceTimes.remove(0);
    }

    public void setServiceTimes(ArrayList<Double> serviceTimes) {
        this.serviceTimes = serviceTimes;
    }
}
