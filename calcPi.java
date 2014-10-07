import java.util.Random;
public class calcPi{
    public static void main(String[] args){
        
        if(args.length == 0)
            System.out.println("Usage: java calcPi [number of random pairs] ex. java calcPi 64000");
        else{

            Random r = new Random();
            double[] xPos = new double[Integer.parseInt(args[0])];
            double[] yPos = new double[Integer.parseInt(args[0])];
            for(int i = 0; i<xPos.length; i++){
                xPos[i] = r.nextDouble();
                yPos[i] = r.nextDouble();
            }
            int counter = 0;
            for(int i = 0; i<xPos.length; i++){
                if((xPos[i]*xPos[i]) + (yPos[i]*yPos[i])<1)
                    counter++;
            }
            System.out.println((counter*4.0)/(xPos.length));
        }
    }

}
