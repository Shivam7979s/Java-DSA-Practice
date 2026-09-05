package arrays;


public class Container_With_Most_Water {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(container(height));
    }
    static int container(int[] height){
        int n=height.length;

        int start=0;
        int last=n-1;
        int max=0;
        while(start<last){
            int distance= last-start;
            if(height[start]<height[last]){
                int ct=height[start]*distance;
                if(max<ct){
                    max=ct;
                }
                start++;

            }
            else{
                int area=height[last]*distance;
                if(max<area){
                    max=area;
                }
                last--;

            }
            
        }
        return max;
    }
    
}
