package com.hamming;

abstract public class Appointment {
    private String Description;
    private String Date;

    public Appointment(String description, String date) {
        Description = description;
        Date = date;
    }

    public boolean occursOn(int year, int month , int day){
        String[] Datesplit = this.getDate().split(" ");
        int Year = Integer.parseInt(Datesplit[2]);
        int Month = Integer.parseInt(Datesplit[1]);
        int Day = Integer.parseInt(Datesplit[0]);
        if(Year == year){
            if(Month == month){
                    if(Day == day){
                        return true;
                    }
                return false;
            }
            return false;
        }
        return false;
    }

    abstract public String getDate();

    public String date(){
        return this.Date;
    }

    public String getDescription(){
        return this.Description;
    }

    @Override
    public String toString() {
        return "Description: " + this.Description + "\n" +
               "Occurs on: " + this.Date + "\n";
    }
}
