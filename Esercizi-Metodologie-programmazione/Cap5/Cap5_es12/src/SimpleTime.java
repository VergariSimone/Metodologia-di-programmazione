public class SimpleTime {
    //attributi 
    public int hour;
    public int minute;
    public String time;

    //costruttore 

    public SimpleTime(int hour, int minute){

        this.hour = hour;
        this.minute = minute;
        this.time = hour + ":" + minute;
    }


    //metodi 
    public int compareTo(SimpleTime other){

        if (this.hour < other.hour){
            return -1;

        }
        else if (this.hour == other.hour){
            if(this.minute < other.minute){
                return -1;
            }
            else if (this.minute == other.minute){
                return 0;

            }
            else{
                return 1;
            }
        }
        else{
            return 1;
        }
        

    }
}
