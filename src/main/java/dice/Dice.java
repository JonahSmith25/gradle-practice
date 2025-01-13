public class Dice{
    public int roll(int sides){
        int min = 1;
        int max = sides;
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        return randomNumber;
    }
}