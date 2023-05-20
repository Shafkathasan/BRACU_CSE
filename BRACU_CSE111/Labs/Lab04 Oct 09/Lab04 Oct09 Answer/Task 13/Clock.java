class Clock {
    private int hours, minutes, seconds;
    
    void setClock(int seconds) {
        seconds %= 86399;
        setHours(seconds / 3600);
        setMinutes(seconds % 3600 / 60);
        setSeconds(seconds % 3600 % 60);
    }
    
    int getHours() {
        return hours;
    }
    
    int getMinutes() {
        return minutes;
    }
    
    int getSeconds() {
        return seconds;
    }
    
    void setHours(int hour) {
        if (hour < 24 && hour >= 0) {
            hours = hour;
        }
    }
    
    void setMinutes(int min) {
        if (min > 59) {
            setHours(hours + min / 60);
            min %= 60;
        }
        if (minutes < 60 && minutes >= 0) {
            minutes = min % 60;
        }
    }
    
    void setSeconds(int sec) {
        if (sec > 59) {
            setMinutes(minutes + sec / 60);
        }
        if (seconds < 60 && seconds >= 0) {
            seconds = sec % 60;
        }
    }
    
    void tick() {
        setSeconds(seconds + 1);
    }
    
    Clock addClock(Clock c) {
        int totalSecondsOfC = c.hours * 3600 + c.minutes * 60 + c.seconds;
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        
        int totalTime = totalSecondsOfC + totalSeconds;
        
        Clock newClock = new Clock();
        newClock.setClock(totalTime);
        
        return newClock;
        
    }
    
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
    
    void tickDown() {
        setSeconds(seconds - 1);
    }
    
    Clock subtractClock(Clock c) {
        int totalSecondsOfC = c.hours * 3600 + c.minutes * 60 + c.seconds;
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        
        int totalTime = Math.abs(totalSecondsOfC - totalSeconds);
        
        Clock newClock = new Clock();
        newClock.setClock(totalTime);
        
        return newClock;
    }
    
    Clock () {
        hours = 12;
        minutes = 0;
        seconds = 0;
    }
    
    Clock (int seconds) {
        setClock(seconds);
    }
    
    Clock (int hrs, int mins, int sec) {
        setHours(hrs);
        setMinutes(mins);
        setSeconds(sec);
    }
}