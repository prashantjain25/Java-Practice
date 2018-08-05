package graph;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

public class OverlappingRectanglesArea {
    
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        int ip1 = Integer.parseInt(in.nextLine().trim());
        int ip2_rows = 0;
        int ip2_cols = 0;
        ip2_rows = Integer.parseInt(in.nextLine().trim());
        ip2_cols = Integer.parseInt(in.nextLine().trim());
        
        int[][] ip2 = new int[ip2_rows][ip2_cols];
        for(int ip2_i=0; ip2_i<ip2_rows; ip2_i++) {
            for(int ip2_j=0; ip2_j<ip2_cols; ip2_j++) {
                ip2[ip2_i][ip2_j] = in.nextInt();
                
            }
        }
        output = resolveconflict(ip1,ip2);
        System.out.println(String.valueOf(output));
    }
    public static int resolveconflict(int input1,int[][] input2)
    {   
        int[] cost=new int[input2.length];
        for(int i=0;i<input2.length;i++){
        cost[i]=input2[i][input2[i].length-1];
        //System.out.println(cost[i]);
        }
        int[] area=new int[input2.length];
        for(int i=0;i<input2.length;i++){
            int x=input2[i][2]-input2[i][0];
            int y=input2[i][3]-input2[i][1];
            area[i]=x*y;
        }
        int[] commonArea=new int[input2.length];
        int[] common=new int[input2.length];
        /*find overlap between all inputs*/
        for(int i=0;i<input2.length;i++){
            for(int j=i+1;j<input2.length;j++){
                if(doOverlap(input2[i][0],input2[i][1],
                        input2[i][2],input2[i][3],input2[j][0],
                        input2[j][1],input2[j][2],input2[j][3])) {
                    
                   commonArea[i]= findArea(input2[i][0],input2[i][1],
                           input2[i][2],input2[i][3],input2[j][0],
                           input2[j][1],input2[j][2],input2[j][3]);
                }
            }
            
        }
        int costTotal=costFinder(cost,commonArea,area);
        return 0;
        
        //for(int i=0;i<input2.length)
      
    }
    private static int costFinder(int[] cost, int[] commonArea, int[] area) {
        int area=area-commonArea;
        for(int i=0;i<)
        AtomicInteger atomicSumCommonArea = new AtomicInteger(0);
        Arrays.stream(commonArea).mapToObj(atomicSumCommonArea::addAndGet);
        int sumcommonArea=atomicSumCommonArea.get();
        
//        AtomicInteger atomicSumarea = new AtomicInteger(0);
//        Arrays.stream(area).mapToObj(atomicSumarea::addAndGet);
//        int sumArea=atomicSumarea.get();
        
        
        
        
        return 0;
    }
    static boolean doOverlap(int l1x, int l1y, int r1x, int r1y
            ,int l2x, int l2y, int r2x, int r2y)
        {
            if (l1x> r2x|| l2x > r1x)
                return false;
            if (l1y < r2y || l2y < r1y)
                return false;
         
            return true;
        }
    static int findArea(int l1x, int l1y, int r1x, int r1y
            ,int l2x, int l2y, int r2x, int r2y) {
        int lowerX=l1x<l2x?l1x:l2x;
        int upperX=r1x<r2x?r2x:r1x;
        int smallest=upperX-lowerX;
        
        int lowerY=l1y<l2y?l1y:l2y;
        int upperY=r1y<r2y?r2y:r1y;
        int largest=upperY-lowerY;
        
        int residualX=Math.abs(r2x-r1x)+Math.abs(l2x-l1x);
        int residualY=Math.abs(r2y-r1y)+Math.abs(l2y-l1y);
        int residualAreaX=smallest-residualX;
        int residualAreaY=largest-residualY;
        return residualAreaX*residualAreaY; 
    }
}
