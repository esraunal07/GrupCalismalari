package GrupCalismalari;

import java.util.Arrays;

public class KaydirmaMethodu {

    public static void main(String[] args) {

        // Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        //basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        //Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

        int  [] input={4,5,6,7};

        inputKaydirmaMethodu(input);
        System.out.println(Arrays.toString(input));//[7, 4, 5, 6]
    }

    private static int[] inputKaydirmaMethodu(int[] input) {

        int  kova=input[input.length-1];
        for (int i =input.length-1; i >=1 ; i--) {
            input[i]=input[i-1];

        }
        input[0]=kova;
        return input;
    }
}
