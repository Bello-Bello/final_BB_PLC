//code_8A _withoutGoto

#include <stdio.h>

int main(){
    int j=-3;
    
    for (int i=0; i<3; i++){
        if (j+2 == 3 || j+2 == 2){
        j--;
        }
        else if (j+2 == 0){
        j+=2;
        }else{
            j=0;
        }
        if (j>0){
            i=2;
        }else{
            j=3-i;
        }
     printf("%d\n", j);
    }
   return 0;
}
        