#include<stdio.h>
void printPattern1(int n){
    int i,j,min;
    //logic to print pyramid pattern
    for(int i = 1; i <=n; i++){
        for(int j = 1; j <=n; j++){
            min=i<j?i:j;
            printf("%d ",n-min+1);
        }
        for(j=n-1;j>=1;j--){
            min=i<j?i:j;
            printf("%d ",n-min+1);
        }
        printf("\n");
    }
     for(int i = n-1; i >=1; i--){
        for(int j = 1; j <=n; j++){
            min=i<j?i:j;
            printf("%d ",n-min+1);
        }
        for(j=n-1;j>=1;j--){
            min=i<j?i:j;
            printf("%d ",n-min+1);
        }
        printf("\n");
    }
}
int main(){
    int n1=4;
    printPattern1(n1);
    return 0;
}