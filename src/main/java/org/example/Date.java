package org.example;

import java.util.List;

public class Date {
    public int year;
    public int month;
    public int dayOfMonth;



    public Date(int year, int month, int dayOfMonth) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }

    // days will always be greater than > 0. Also, no other validations are done on input dates
    public Date addDaysToDate(int days) {
        int currentDayOfMonth = this.dayOfMonth;
        List<Integer> monthDays = List.of(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);

        if (days + currentDayOfMonth <= monthDays.get(this.month - 1)) {
            this.dayOfMonth = days + currentDayOfMonth;
        } else {
            int currMonth = this.month;
            int totalDaysElapsed = monthDays.get(currMonth - 1) - currentDayOfMonth; // remaining days in current month
            int i = currMonth;
            boolean requiredDaysCalculated = false;
            while (totalDaysElapsed < days) {
                while (i < 12) {
                    totalDaysElapsed += monthDays.get(i);

                    if (totalDaysElapsed >= days) {
                        requiredDaysCalculated = true;
                        break;
                    }
                    i++;
                }

                if (!requiredDaysCalculated) {
                    this.year += 1;
                    i = 0;
                }
            }
            this.month = i + 1;
            int daysElapsedTillPrevMonth = totalDaysElapsed - monthDays.get(i);
            this.dayOfMonth = days - daysElapsedTillPrevMonth;
        }

        return new Date(this.year, this.month, this.dayOfMonth);
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", dayOfMonth=" + dayOfMonth +
                '}';
    }
}

