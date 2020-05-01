
public class MaxMinMid_nested {
    public static void main(String[] args) {
        int first = 20, second = 40, third = 5;
        int max,min,mid;
        if(first>second){
            if(first>third){
                if(second>third){
                    max=first;
                    min=third;
                    mid=second;
                }else{
                    max=first;
                    min=second;
                    mid=third;
                }
            }else{
                max=third;
                min=second;
                mid=first;
            }
        }else{
            if(second<third){
                max=third;
                min=first;
                mid=second;
            }else{
                if(first<third){
                    max=second;
                    min=first;
                    mid=third;
                }else{
                    max=second;
                    min=third;
                    mid=first;
                }
            }
        }
        System.out.println(" Max is "+ max);
        System.out.println(" Min is "+ min);
        System.out.println(" Mid is "+ mid);
    }
}