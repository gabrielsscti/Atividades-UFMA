#include <stdio.h>
#include <stdlib.h>
#define TRUE 1
#define FALSE 0


int compFloat(const void *n1,const void *n2){
    if(*(float*)n1>*(float*)n2)
        return TRUE;
    return FALSE;
}

int compInt(const void *n1,const void *n2){
    if(*(int*)n1>*(int*)n2)
        return TRUE;
    return FALSE;
}

int main(){
    int op, n;
    printf("Digite:\n1-Inteiros\t2-Reais\n");
    scanf("%d", &op);
    switch(op){
        case 1:
            printf("Digite o numero de posiçoes do vetor:\n");
            scanf("%d", &n);
            int *vInt = (int*)malloc(sizeof(int)*n);
            printf("Digite a sequencia de N numeros inteiros:\n");
            for(int i=0; i<n; i++)
                scanf("%d", &vInt[i]);
            qsort(vInt, n, sizeof(int), compInt);
            printf("\nSequencia ordenada:\n");
            for(int i=0; i<n; i++)
                printf("%d ", vInt[i]);
            printf("\n");
            break;
        case 2:
            printf("Digite o numero de posiçoes do vetor:\n");
            scanf("%d", &n);
            float *vFloat = (float*)malloc(sizeof(float)*n);
            printf("Digite a sequencia de N numeros reais:\n");
            for(int i=0; i<n; i++)
                scanf("%f", &vFloat[i]);
            qsort(vFloat, n, sizeof(float), compFloat);
            printf("\nSequencia ordenada:\n");
            for(int i=0; i<n; i++)
                printf("%.2f ", vFloat[i]);
            printf("\n");
            break;
        default:
        printf("Opcao invalida, encerrando...\n");
    }

}