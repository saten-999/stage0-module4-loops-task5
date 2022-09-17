package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        
       if (height!=0) {
        for (int i = 0; i <height/2; i++) {
            for (int j = 0; j < height; j++){
                if(i>j || i+j+1>height){
                    System.out.print(" ");
                }else{
                    System.out.print("8");
                }
            }   
            
            System.out.println();
        }
        for (int i = height/2; i < height; i++) {
            for (int j = 0; j < height; j++){
                if(i<j || i+j+1<height){
                    System.out.print(" ");
                }else{
                    System.out.print("8");
                }
            }
            System.out.println();   
        }
        
       }
        

       
    }
}
