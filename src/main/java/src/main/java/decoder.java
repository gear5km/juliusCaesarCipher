package src.main.java;

class decoder{
    /*****************************************************************
     Changes the Value of an encrypted message back to its original number value
     using the shift value as a guide
     *****************************************************************/
    int[] encryptedVal;
    int encryptedValLength;
    int shiftValue;
    int[] decryptedVal;
    decoder( int[] encryptedVal, int shiftValue) {
        this.encryptedVal=encryptedVal;
        this.encryptedValLength = encryptedVal.length;;
        this.shiftValue= shiftValue;
    }
    int[] convertToDecode(){

        for (int i=0; i< encryptedValLength; i++){
            System.out.println(encryptedVal[i]);
        };

        for (int i = 0; i < encryptedVal.length; i++){
            encryptedVal[i]= encryptedVal[i]- shiftValue;
        }
        System.out.println("checking wait " + encryptedVal[0]);
        decryptedVal=encryptedVal;
        return decryptedVal;
    }

}