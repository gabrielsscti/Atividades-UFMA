#include <stdio.h>
#include <stdlib.h>
#define MAX 10000
#define lli long long int



int main(){
    int *testeInt = NULL;
    lli *testeLii = NULL;
    printf("Média de alocação antes da alocação inicial: %dkb\n", (sizeof(testeInt)+sizeof(testeLii))/2);
    for(int i=0; i<MAX; i++){
        testeInt = (int*)malloc(sizeof(int));
        testeLii = (lli*)malloc(sizeof(lli));

    }
    printf("Espaço alocado após iteração e antes da atribuição nula: %dkb\n", ((sizeof(int)+sizeof(lli))*MAX + sizeof(testeInt)+sizeof(testeLii)));
    free(testeInt);
    free(testeLii);
}