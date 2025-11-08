public class EvenCheck implements  NumberCheck {

    @Override
    public boolean checkNumber(int number) {
        if(number %2 ==0) return true;
        return false;
    }
    
}
