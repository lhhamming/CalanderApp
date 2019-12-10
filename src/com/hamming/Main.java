package com.hamming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        Daily d = new Daily("Test daily", 9122019);
        Monthly m = new Monthly("Test Monthly", 9122019);
        OneTime o = new OneTime("Test Onetime", 10122019);
        appointments.add(d);
        appointments.add(m);
        appointments.add(o);

    }
}
