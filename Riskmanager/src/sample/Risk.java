package sample;

import java.util.Random;

public class Risk {
    String name;
    int severity;
    String discibtion;


    Risk(){
        Random rand = new Random();
        name = "blank";
        severity = rand.nextInt(1000);
        discibtion = "Yes";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public void setDiscibtion(String discibtion) {
        this.discibtion = discibtion;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    public String getDiscibtion() {
        return discibtion;
    }
}
