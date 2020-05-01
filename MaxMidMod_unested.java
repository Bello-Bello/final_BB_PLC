
public class MaxMidMod_unested {
    public static void main(String[] args) {
  
    int first = 20, second = 40, third = 5;
    int max=0,min=0,mid=0;
    
    if(first>second && first>third && second>third){
        max=first;
        min=third;
        mid=second;
    }
    else if(first>second && first>third && second<third){
        max=first;
        min=second;
        mid= third;
    }
    else if(second>third && second>first && first>third){
        max=second;
        min=third;
        mid=first;
    }
    else if(second>third && second>first && third>first){
        max=second;
        min=first;
        mid=third;
    }
    else if(third>first && third>second && first>second){
        max=third;
        min=second;
        mid=first;
    }
    else{
        max=third;
        min=first;
        mid= third;
    }
    System.out.println("Max is "+ max);
    System.out.println("Min is "+ min);
    System.out.println("Mid is "+ mid);
    }
 }