package src.main.java;

class encoder {
    /*****************************************************************
     Changes the Value of a stringToNumber object based on a Shift Value
     *****************************************************************/
    int[] inputVals;
    int inputValLength;
    int shiftValue;
    int[] encryptedVal;

    encoder( int[] inputVals, int shiftValue) {
        this.inputVals=inputVals;
        this.inputValLength = inputVals.length;;
        this.shiftValue= shiftValue;
    }

    int[] convertToEncode() {
        for (int i = 0; i < inputValLength; i++) {
            System.out.println(inputVals[i]);
        }
        ;

        for (int i = 0; i < inputVals.length; i++) {
            inputVals[i] = inputVals[i] + shiftValue;
        }
        System.out.println("checking wait " + inputVals[0]);
        encryptedVal=inputVals;
        return encryptedVal;
    }
}