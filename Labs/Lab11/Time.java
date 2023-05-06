public class Time {
    //create private integers where this class can only access them
    private int hrs;
    private int mins;
    private int secs;

    //when you create an empty time object, the default values will be set to 0s
    public Time() {
        this(0,0,0);
    }

    //if a user creates a time object with invalid values, it will set all the values to 0
    public Time(int hrs, int mins, int secs) {
        if (hrs < 0 || hrs >= 24 || mins < 0 || mins >= 60 || secs < 0 || secs >= 60) {
            this.hrs = 0;
            this.mins = 0;
            this.secs = 0;
        } else {
            this.hrs = hrs;
            this.mins = mins;
            this.secs = secs;
        }
    }

    public int getHrs() {
        return hrs;
    }

    public int getMins() {
        return mins;
    }

    public int getSecs() {
        return secs;
    }

    //if the user sets the new values to a time object to invalid values, it will also reset values of said object to 0s
    //otherwise change values of time
    public void setTime(int newHrs, int newMins, int newSecs) {
        if (newHrs < 0 || newHrs >= 24 || newMins < 0 || newMins >= 60 || newSecs < 0 || newSecs >= 60) {
            newHrs = 0;
            newMins = 0;
            newSecs = 0;
        }

        hrs = newHrs;
        mins = newMins;
        secs = newSecs;
    }

    public void printMilitary() {
        //create string version of values of time because we would like to modify them
        String strHrs = Integer.toString(hrs);
        String strMins = Integer.toString(mins);
        String strSecs = Integer.toString(secs);

        //test if any of vales are less than 10 and add a 0 before the value
        if (hrs < 10) {
            strHrs = "0" + strHrs;
        }

        if (mins < 10) {
            strMins = "0" + strMins;
        }

        if (secs < 10) {
            strSecs = "0" + strSecs;
        }

        //display results
        System.out.printf("%s:%s:%s", strHrs, strMins, strSecs);
    }

    public void printStandard() {
        //redeclare the hrs values because we would like to modify it
        int newHrs = hrs;
        //we need a version declared so we can use it later
        String version = "";
        //12 13 14 15 16 17...
        if (hrs > 11) {
            version = "PM";
            //avoid 12
            if (hrs > 12) {
                newHrs -= 12;
            }
        } else {
            version = "AM";
            if(hrs == 0) {
                newHrs = 12;
            }
        }

        //similar to military
        String strHrs = Integer.toString(newHrs);
        String strMins = Integer.toString(mins);
        String strSecs = Integer.toString(secs);

        if (newHrs < 10 && newHrs != 12) {
            strHrs = "0" + strHrs;
        }

        if (mins < 10) {
            strMins = "0" + strMins;
        }

        if (secs < 10) {
            strSecs = "0" + strSecs;
        }

        System.out.printf("%s:%s:%s %s", strHrs, strMins, strSecs, version);
    }

    public String toString() {
        return hrs + ":" + mins + ":" + secs;
    }

    public boolean equals(Time t) {
        return hrs == t.hrs && mins == t.mins && secs == t.secs;
    }

    public boolean lessThan(Time t) {
        return hrs < t.hrs || mins < t.mins || secs < t.secs;
    }

    public void copy(Time t) {
        hrs = t.hrs;
        mins = t.mins;
        secs = t.secs;
    }

    public Time getCopy() {
        return new Time(hrs, mins, secs);
    }

    //when incrementing, these methods will use each other to assis with checking if the values fall over parameters
    public void incrementSecs() {
        secs++;

        if (secs == 60) {
            secs = 0;
            incrementMins();
        }
    }

    public void incrementMins() {
        mins++;

        if (mins == 60) {
            mins = 0;
            incrementHrs();
        }
    }

    public void incrementHrs() {
        hrs++;

        if (hrs == 24) {
            hrs = 0;
        }
    }
}