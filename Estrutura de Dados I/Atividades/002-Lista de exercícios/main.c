#include <stdio.h>
#include <stdlib.h>

void printMatrix(int *matrix, int n, int m){
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++)
            printf("%d ", matrix[i*m+j]);
        printf("\n");
    }
    printf("\n");
}

int areMatrixesEqual(int *ma, int *mb, int n, int m, int p, int q){
    if(n!=p || m!=q)
        return 0;
    for(int i=0; i<n; i++)
        for(int j=0; j<m; j++)
            if(ma[i*m+j]!=mb[i*m+j])
                return 0;

    return 1;
}

int *getTranspose(int *matrix, int n, int m){
    int *r = (int*)malloc(sizeof(int)*n*m);
    if(r==NULL)
        return NULL;
    for(int i=0; i<n; i++)
        for(int j=0; j<m; j++)
            r[i*m + j] = matrix[j*m + i];
    return r;
}

int *transposta(int *va, int n, int m){
    return getTranspose(va, n, m);
}

int *linhaDaMatriz(int *va, int n, int m, int l){
    int *r = (int*)malloc(sizeof(m));
    for(int i=0; i<m ; i++)
        r[i] = va[l*m + i];
    
    return r;
}

int *colunaDaMatrix(int *va, int n, int m, int p){
    int *r = (int*)malloc(sizeof(n));
    for(int i=0; i<n; i++)
        r[i] = va[i*m + p];

    return r;
}

int *diagonalDaMatriz(int *va, int n, int m){
    if(n!=m)
        return NULL;
    int *r = (int*)malloc(sizeof(n));
    for(int i=0; i<n; i++)
        r[i] = va[i*m + i];

    return r;

}

int isMatrixDiagonal(int *matrix, int n, int m){
    for(int i=0; i<n; i++)
        for(int j=0; j<m; j++)
            if(i!=j)
                if(matrix[i*m+j]!=0)
                    return 0;
    return 1;
}

int *tipoDeMatriz(int *va, int n, int m){
    printMatrix(va, n, m);
    int *answer = (int*)malloc(sizeof(int)*4);
    for(int i=0; i<4; i++)
        answer[i] = 0;

    if(n==m)
        answer[0] = 1;

    if(areMatrixesEqual(getTranspose(va, n, m), va, n, m, n, m))
        answer[1] = 1;
    else
        answer[3] = 1;
    
    if(isMatrixDiagonal(va, n, m))
        answer[2] = 1;
    
    return answer;
}

int main(){

}