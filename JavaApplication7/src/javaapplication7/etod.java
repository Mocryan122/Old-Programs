
package javaapplication7;

public class etod {

    private String fname;
    private String mdname;
    private String lname;
   
    private String gender;
   
    private String month;
    private int day;
    private int year;
   
    private String mname;
    private String ftname;
   
    private int add;
   
    private String yn;
   
    public String getfname(){
        return fname;
    }
    public String getmdname(){
        return mdname;
    }
    public String getlname(){
        return lname;
    }
   
    public String getGender(){
        switch(gender){
            case "male":
                return gender;
           
            case "Female":
                return gender;
            case "Male":
                return gender;
           
            case "Gay":
                return "Male";
            case "Lesbian":
                return "Female";
           
            case "gay":
                return "Male";
            case "lesbian":
                return "Female";
               
                default:
                    break;
            }
        return null;
        }
    public String getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }
   
    public int getAdd(){
        return add;
    }
   
    public String getMname(){
        return mname;
    }
    public String getFtname(){
        return ftname;
    }
   
    public String getYn(){
        return null;
    }
   
    public void setfname(String res){
        fname = res;
    }
    public void setmdname(String res){
        mdname = res;
    }
    public void setlname(String res){
        lname = res;
    }
   
    public void setGender(String res){
        gender = res;
    }
   
    public void setMonth(String res){
        month = res;
    }
    public void setDay(int res){
        day = res;
    }
    public void setYear(int res){
        year = res;
    }
   
    public void setMname(String res){
        mname = res;
    }
    public void setFtname(String res){
        ftname = res;
    }
   
    public void setAdd(int res){
        add = res;
    }
   
    public void setYn(String res){
        yn = res;
    }
   
}

