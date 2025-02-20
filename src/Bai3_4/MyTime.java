package Bai3_4;

public class MyTime {
	private int hour = 0, minute = 0, second = 0;

	public MyTime() {
	}

	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public void setTime(int hour, int minute, int second) {
		 if (isValidTime(hour, minute, second)) {
             this.hour = hour;
             this.minute = minute;
             this.second = second;
         } else {
             throw new IllegalArgumentException("Invalid hour, minute, or second!");
         }
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour!");
        }
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute!");
        }
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second!");
        }
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	public MyTime nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            nextMinute();
        }
        return this;
    }

    public MyTime nextMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        hour++;
        if (hour == 24) {
            hour = 0;
        }
        return this;
    }
    public MyTime previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            previousMinute();
        }
        return this;
    }

    public MyTime previousMinute() {
        minute--;
        if (minute < 0) {
            minute = 59;
            previousHour();
        }
        return this;
    }

    public MyTime previousHour() {
        hour--;
        if (hour < 0) {
            hour = 23;
        }
        return this;
    }

    private boolean isValidTime(int hour, int minute, int second) {
        return (hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59);
    }
	
	
}
