package com.jetBello;

public class code_8c_noSwitch {

    public static void main(String[] args) {
        int j = -3;
        for(int i=0; i<3; i++){
            if(j+2 == 3 || j+2 == 2) {
                j--;
            }else if(j+2 == 0) {
                j++;
            }else{
                j = 0;
            }
            if(j>0){
                return;
            }
            j = 3 - i;
            System.out.println("j: " + j);
        }
    }
}