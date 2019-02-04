import java.sql.SQLOutput;

public class CW1 {

    public static void main (String[] args) {
        double[] name = {1, 2, 3, 4};
        name[3] = 50;

        /* циклы */
        int a, b, c = 0;
        for (a = 0; a < name.length; a++) {
            System.out.println(name[a]);
        }

        int ff = 0;
        while (ff < name.length) {
            System.out.println(name[ff]);
            ff++;
        }

        String as = "111111111122222";
        Object as1 = new Object();
        double [] aee = {1,2,3,4};

        as = "123 1" + " 102 ";
        System.out.println(as.indexOf("102"));

        String[] an = as.split("102");

        as.replace("102"," ");
        System.out.println(as);

    }
}
