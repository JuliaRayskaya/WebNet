package sakila.entity;
// Generated 01.02.2019 20:35:21 by Hibernate Tools 4.3.1



/**
 * Bookings generated by hbm2java
 */
public class Bookings  implements java.io.Serializable {


     private int date;
     private Character asd;

    public Bookings() {
    }

	
    public Bookings(int date) {
        this.date = date;
    }
    public Bookings(int date, Character asd) {
       this.date = date;
       this.asd = asd;
    }
   
    public int getDate() {
        return this.date;
    }
    
    public void setDate(int date) {
        this.date = date;
    }
    public Character getAsd() {
        return this.asd;
    }
    
    public void setAsd(Character asd) {
        this.asd = asd;
    }




}

