
    package pi;

    import java.math.RoundingMode;

    import java.text.DecimalFormat;


    public class PI {


        public static void main(String[] args) {
          DecimalFormat yes = new DecimalFormat("#.####");
          yes.setRoundingMode(RoundingMode.CEILING);

          double pi = Math.PI;
          System.out.println(yes.format(pi));   
        }

    }
