import java.util.Random;
public class calcPi{
    public static void main(String[] args){
        Random r = new Random();
        double[] num = new double[16000];
        for(int i = 0; i<num.length; i++){
            num[i] = r.nextDouble();
        }
        int counter = 0;
        for(int i = 0; i<num.length/2; i++){
            if((Math.pow(num[i],2) + Math.pow(num[(num.length/2)+i],2))<1)
                counter++;
        }
        System.out.println((counter*4.0)/(num.length/2.0));
    }

}
