
    package javaapplication7;
    import java.util.Scanner;

    public class JavaApplication7 {


        public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
            System.out.println("PSA Online Registration");
            etod go = new etod();
            System.out.println("Please enter your first,middle and last name");
            go.setfname(input.next());
            go.setmdname(input.next());
            go.setlname(input.next());
            System.out.println("-----------------------------------------------");

            System.out.println("Gender");
            go.setGender(input.next());
            System.out.println("-----------------------------------------------");

            System.out.println("Full birthdate (month/day/year)");
            go.setMonth(input.next());
            go.setDay(input.nextInt());
            go.setYear(input.nextInt());
            System.out.println("-----------------------------------------------");

            System.out.println("No. of siblings");
            go.setAdd(input.nextInt());
            System.out.println("-----------------------------------------------");

            System.out.println("Mother's First name:");
            go.setMname(input.next());
            System.out.println("-----------------------------------------------");

            System.out.println("Father's First name:");
            go.setFtname(input.next());
            System.out.println("-----------------------------------------------");



            System.out.println("Result");
            System.out.println("Full name: " + go.getlname() + ", " + go.getfname() + " " + go.getmdname());
            System.out.println("Gender: " + go.getGender());
            System.out.println("Birthdate: " + go.getMonth() + ", " + go.getDay() + " " + go.getYear());
            System.out.println("No.of siblings: " + go.getAdd());
            System.out.println("Mother's name: " + go.getlname() + ", " + go.getMname());
            System.out.println("Father's name: " + go.getlname() + ", " + go.getFtname());
             System.out.println();

             System.out.println("Are you sure is this the right information? Yes/No");
             String choice = input.next();

             switch(choice){
                 case"yes":
                     System.out.println("Thank you, your document will be sent soon to your location. For more information, please call:0902394123" );
                     break;
                 case"no":
                     System.out.println("Please input again");
                     break;
                 default:
                         System.out.println("null");
                     break;}
        }
    }
