package GrupCalismalari;

public class Degree_Fahrenat {

    public static void main(String[] args) {

        //String str1=" Today weather is sunny and 155 degree. It is a perfect day to practice java";

        String str1="Today weather is sunny and 155 degree. It is a perfect day to practice java";

        String fahrenheit=str1.replaceAll("\\D","");

        //(30°C x 1.8) + 32 = 86°F’

        int fahrenheit1= Integer.parseInt(fahrenheit);


        double derece = (fahrenheit1-32)/1.8;

        System.out.println("Donusumu istenilen : "+fahrenheit1+"F"+" Derece karsiligi : "+derece);


        //////////////////////////////////////////////////////////////////////////////











    }
}
