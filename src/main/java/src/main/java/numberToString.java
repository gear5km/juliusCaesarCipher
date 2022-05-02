package src.main.java;

import java.util.Arrays;


public class numberToString {

    int[] numberInput;
    int numberBlock;
    int[] stringOutput;
    String[] outputVal;

    numberToString(int[]numberInput){
        this.numberInput=numberInput;
        this.numberBlock = numberInput.length;
    }
    String convertToString(){
        outputVal= new String[numberInput.length];
        for (int a=0;a<numberInput.length; a++){
            switch (numberInput[a]){
                case 1:
                    outputVal[a]="a";
                    break;
                case 2:
                    outputVal[a]="b";
                    break;
                case 3:
                    outputVal[a]="c";
                    break;
                case 4:
                    outputVal[a]="d";
                    break;
                case 5:
                    outputVal[a]="e";
                    break;
                case 6:
                    outputVal[a]="f";
                    break;
                case 7:
                    outputVal[a]="g";
                    break;
                case 8:
                    outputVal[a]="h";
                    break;
                case 9:
                    outputVal[a]="i";
                    break;
                case 10:
                    outputVal[a]="j";
                    break;
                case 11:
                    outputVal[a]="k";
                    break;
                case 12:
                    outputVal[a]="l";
                    break;
                case 13:
                    outputVal[a]="m";
                    break;
                case 14:
                    outputVal[a]="n";
                    break;
                case 15:
                    outputVal[a]="o";
                    break;
                case 16:
                    outputVal[a]="p";
                    break;
                case 17:
                    outputVal[a]="q";
                    break;
                case 18:
                    outputVal[a]="r";
                    break;
                case 19:
                    outputVal[a]="s";
                    break;
                case 20:
                    outputVal[a]="t";
                    break;
                case 21:
                    outputVal[a]="u";
                    break;
                case 22:
                    outputVal[a]="v";
                    break;
                case 23:
                    outputVal[a]="w";
                    break;
                case 24:
                    outputVal[a]="x";
                    break;
                case 25:
                    outputVal[a]="y";
                    break;
                case 26:
                    outputVal[a]="z";
                    break;
            }
        }
        System.out.println(Arrays.toString(outputVal));


        return Arrays.toString(outputVal);

    }

    public String getOutputVal(){

        return Arrays.toString(outputVal);
    }
}