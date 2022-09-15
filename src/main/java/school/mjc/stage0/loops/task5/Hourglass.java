package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int k=height/2;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if(i==k){
                    System.out.print('8');
                }else{
                    if(j==k){
                        System.out.print('8');
                    }else{
                        System.out.print(' ');
                    }
                }     
            }
            System.out.print('\n');
            
        }
    }
}
