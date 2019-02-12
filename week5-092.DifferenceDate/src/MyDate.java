public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate){
        int comparedDateYear = comparedDate.year;
        int comparedDateMonth = comparedDate.month;
        int comparedDateDay = comparedDate.day;
        
        MyDate newMyDate = new MyDate(day, month, year);
        int firstDateYear = newMyDate.year;
        int firstDateMonth = newMyDate.month;
        int firstDateDay = newMyDate.day;
        int date = 0;
        
        if(firstDateYear > comparedDateYear){
            date = (firstDateYear - comparedDateYear) - 1;
        }
        else if(comparedDateYear > firstDateYear){
            date = (comparedDateYear - firstDateYear) - 1;
        }
        if (firstDateYear > comparedDateYear && firstDateMonth >= comparedDateMonth && firstDateDay >= comparedDateDay){
            date = firstDateYear - comparedDateYear;
        }
        else if(comparedDateYear > firstDateYear && comparedDateMonth >= firstDateMonth && comparedDateDay >= firstDateDay){
            date = comparedDateYear - firstDateYear;
        }

        return date;
    }

}
