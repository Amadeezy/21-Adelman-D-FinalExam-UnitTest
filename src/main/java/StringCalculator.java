public class StringCalculator {
   public int add(final String numbers) {
      int returnValue = 0;
      String[] numbersArray = numbers.split(",|\n");
      for (String number : numbersArray) {
         if (!number.trim().isEmpty()) {
             int value = Integer.parseInt(number.trim());
             if(value < 0) {
            	 throw new IllegalArgumentException("negatives not allowed");
             }else if(value >= 1000) {
            	 //do nothing
             }else {
            	 returnValue += value;
             }
        	 
         }
      }
      return returnValue;
   }
}