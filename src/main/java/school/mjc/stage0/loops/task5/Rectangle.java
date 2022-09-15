package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int height,int length){
        for (int i = 0; i < length; i++) {
            if(i==0 || i==length-1){
                for (int j = 0; j < height; j++) {
                    System.out.print('8');
                }
            }else{
                for (int j = 0; j <height; j++) {
                    if(j==0 || j==height-1){
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
