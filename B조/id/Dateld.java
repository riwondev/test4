package id;

public class Dateld {
      String datetime;
      int i;
    public Dateld(String nowdate){
        this.datetime = nowdate;
        this.i = 0;
    }
    public void plusda(String a){
        System.out.println(a+"의 식별번호:"+datetime+String.format("%02d",i));
        i++;
    }

 }

