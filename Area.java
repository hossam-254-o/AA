package area;

import java.util.Scanner;

public class Area {

    public static void main(String[] args)
    {
        
        int width , height , area ;
        Scanner a1 = new Scanner (System.in);
        
        System.out.println("Enter Height : ");
        height = a1.nextInt();
        System.out.println("Enter Width : ");
        width = a1.nextInt();
        area =width* height;
        System.out.println(" the area  = " + area);
    }
    
}
