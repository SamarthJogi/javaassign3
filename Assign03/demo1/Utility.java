public class Utility  {
 
    public static int summation(int l, int h, NumberCheck chk){
        int evensum = 0;
    
        int evencounter = 0;
       
        for(int i = l; i<= h;i++){
            if(chk.checkNumber(i)){
                evensum+=i;
                evencounter++;
            }
          
        }
        System.out.println("The total of all even number is "+ evensum);
        return evencounter;
     
    }


    public static int oddsummation(int l, int h, NumberCheck odd){
        int oddsum = 0;
    
        int oddcounter = 0;
       
        for(int i = l; i<= h;i++){
            if(odd.checkNumber(i)){
                oddsum+=i;
                oddcounter++;
            }
          
        }
        System.out.println("The total of all odd number is "+ oddsum);
        return oddcounter;
     
    }
    
}
