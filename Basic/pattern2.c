#include<stdio.h>
void printPattern1(int n){
    //logic to print pyramid pattern
    for(int i = 1; i <=n; i++){
        for(int j = 1; j <=i; j++){
            printf("* ");
        }
    printf("\n");
    }
    for(int i = n-1; i >=1; i--){
        for(int j = i; j >=1; j--){
            printf("* ");
        }
    printf("\n");
    }
}
int main(){
    int n1=9;
    printPattern1(n1);
    return 0;
}