package zadanie1;

import java.sql.SQLOutput;

public class Pesel {

    private String pesel;
    private int[] peselArray;
    final private int[] peselAlgorythmNumbers = new int[]{9, 7, 3, 1, 9, 7, 3, 1, 9, 7};





    public int[] getPeselArray (String pesel) {
        String[] peselStringArray = pesel.split("");
        int[] peselIntArray = new int[peselStringArray.length];

        int counter = 0;
        int counter2 = 0;
        for (String element : peselStringArray) {
            try {
                peselIntArray[counter] = Integer.parseInt(peselStringArray[counter2]);
                counter++;
            }catch(NumberFormatException error){
            }
            counter2++;
        }
        return peselIntArray;
    }

    public Pesel(String pesel)  {
        this.pesel = pesel;
        this.peselArray = getPeselArray(pesel);

    }

    public String getPesel() {
        return pesel;
    }



    public boolean isValidPesel(){
        int checkNo = peselArray[0]*peselAlgorythmNumbers[0];
        for(int i = 1 ; i < 10 ; i++) {
            try {
                checkNo += (peselArray[i] * peselAlgorythmNumbers[i]);
            } catch (ArrayIndexOutOfBoundsException err) {
                return false;
            }
        }

        try {
            return this.peselArray[10] == checkNo % 10;
        }catch(ArrayIndexOutOfBoundsException err){
            return false;
        }
    }
}
