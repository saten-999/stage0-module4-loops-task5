package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int k=sideLength/2;
        for (int i = 0; i < sideLength; i++) {
            
            for (int j = 0; j < sideLength; j++) {
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
