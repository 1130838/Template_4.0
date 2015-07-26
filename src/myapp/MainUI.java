package myapp;

import myapp.bootstrapper.Bootstraper;

/**
 * Created by bruno.devesa on 26-07-2015.
 */
public class MainUI {

    public void run() {
        Bootstraper bootstraper = new Bootstraper();
        bootstraper.execute();
    }
}
