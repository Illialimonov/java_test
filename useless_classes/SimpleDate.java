package useless_classes;

import java.util.Objects;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }



    // used to check if this date object (`this`) is before
    // the date object given as the parameter (`compared`)
    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        if (this.year > compared.year) {
            return false;
        }

        // years are same, compare months
        if (this.month < compared.month) {
            return true;
        }

        if (this.month > compared.month) {
            return false;
        }

        // years and months are same, compare days
        if (this.day < compared.day) {
            return true;
        }

        return false;
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(day, month, year);

        for (int i = 0; i < days; i++) {
            newDate.nextDay();
        }
        return newDate;
    }


    private void nextDay() {
        day++;           // Increment using the ++ notation
        // Alternative syntax:
        // this.day += 1;  // Increment using the += notation
    
        if (day > 30) {
            day = 1;
            month++;
    
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof SimpleDate) {
            SimpleDate otherDate = (SimpleDate) object;

            return this.day == otherDate.day &&
            this.month == otherDate.month &&
            this.year == otherDate.year;
            }

 // If the object is not a SimpleDate, return false
            return false;
            }


        @Override
public int hashCode() {
    return Objects.hash(day, month, year);
}
    }
    