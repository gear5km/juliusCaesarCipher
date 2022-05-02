package src.main.java;

public class stringToNumber {
    /*****************************************************************
     Assigns a Value to each of the Characters typed by the user
     *****************************************************************/



    String textInput; // Variable holds base string
    char[] textBlock; // Holds base string converted to char array
    int[] numberOutput;

    public stringToNumber (String textInput){
        this.textInput=textInput;
        this.textBlock=textInput.toCharArray();
    };

    int[] convertToNumber() {
        numberOutput= new int[textBlock.length];
        for (int i=0; i < textBlock.length;i++) {
            System.out.println(textBlock[i]);
            for (int a = 0; a < textBlock.length; a++) {
                switch (textBlock[a]) {
                    case 'a':
                        numberOutput[a] = 1;
                        break;
                    case 'b':
                        numberOutput[a] = 2;
                        break;
                    case 'c':
                        numberOutput[a] = 3;
                        break;
                    case 'd':
                        numberOutput[a] = 4;
                        break;
                    case 'e':
                        numberOutput[a] = 5;
                        break;
                    case 'f':
                        numberOutput[a] = 6;
                        break;
                    case 'g':
                        numberOutput[a] = 7;
                        break;
                    case 'h':
                        numberOutput[a] = 8;
                        break;
                    case 'i':
                        numberOutput[a] = 9;
                        break;
                    case 'j':
                        numberOutput[a] = 10;
                        break;
                    case 'k':
                        numberOutput[a] = 11;
                        break;
                    case 'l':
                        numberOutput[a] = 12;
                        break;
                    case 'm':
                        numberOutput[a] = 13;
                        break;
                    case 'n':
                        numberOutput[a] = 14;
                        break;
                    case 'o':
                        numberOutput[a] = 15;
                        break;
                    case 'p':
                        numberOutput[a] = 16;
                        break;
                    case 'q':
                        numberOutput[a] = 17;
                        break;
                    case 'r':
                        numberOutput[a] = 18;
                        break;
                    case 's':
                        numberOutput[a] = 19;
                        break;
                    case 't':
                        numberOutput[a] = 20;
                        break;
                    case 'u':
                        numberOutput[a] = 21;
                        break;
                    case 'v':
                        numberOutput[a] = 22;
                        break;
                    case 'w':
                        numberOutput[a] = 23;
                        break;
                    case 'x':
                        numberOutput[a] = 24;
                        break;
                    case 'y':
                        numberOutput[a] = 25;
                        break;
                    case 'z':
                        numberOutput[a] = 26;
                        break;
                }
            }
        }
        return numberOutput;
    }

}
