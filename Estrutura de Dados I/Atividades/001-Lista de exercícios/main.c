#include <stdio.h>
#include <stdlib.h>

int linearSearch(float *v, float query, int size){
    for(int i=0; i<size; i++){
        if(v[i]==query)
            return i;
    }
    return -1;
}

void printVector(float *v, int size){
    for(int i=0; i<size; i++)
        printf("%.2f ", v[i]);
    printf("\n");
}
void printMatrix(float **matrix, int n, int m){
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++)
            printf("%.2f ", matrix[i][j]);
        printf("\n");
    }
    printf("\n");
}

int cmpVectorMatrix(int n, int m, int p, float *vet, float **mat){
    for(int i=0; i<m; i++){
        for(int j=0; j<p; j++){
            int res = linearSearch(vet, mat[i][j], n);
            if(res!=-1)
                printf("Encontrado o numero %.2f em (%dx%d) na pos %d do vetor\n", mat[i][j], i, j, res);
            
        }
    }
    return 0;
}

int cmpVectorMatrix(int n, int m, int p, float *vet, float *mat){
    for(int i=0; i<m*p; i++){
            int res = linearSearch(vet, mat[i], n);
            if(res!=-1)
                printf("Encontrado o numero %.2f em (%dx%d) na pos %d do vetor\n", mat[i], i/(m+1), i%p, res);
    }
    return 0;
}

float elementWiseMultiplication(float *v1, float *v2, int n){
    float r = 0.0;
    for(int i=0; i<n; i++)
        r += v1[i]*v2[i];
    return r;
}

float *getColumnVector(float **matrix, int n, int column){
    float *r = (float*)malloc(sizeof(float)*n);
    for(int i=0; i<n; i++)
        r[i] = matrix[i][column];

    return r;
}

float *getColumnVector(float *matrix, int n, int m, int column){
    float *r = (float*)malloc(sizeof(float)*n);
    for(int i=0; i<n; i++)
        r[i] = matrix[i*m + column];
    return r;

}

float **multMatrix(int n, int m, int p, int q, float **ma, float **mb){
    if(m!=p)
        return NULL;
    float **mr = (float**)malloc(sizeof(float*)*n);
    for(int i=0; i<n; i++){
        mr[i] = (float*)malloc(sizeof(float)*q);
        for(int j=0; j<q; j++){
            mr[i][j] = elementWiseMultiplication(ma[i], getColumnVector(mb, p, j), m);
        }
    }
    return mr;
}

float *multMatrix(int n, int m, int p, int q, float *ma, float *mb){
    if(m!=p)
        return NULL;
    float *mr = (float*)malloc(sizeof(float)*n*q);
    for(int i=0; i<n; i++){
        for(int j=0; j<q; j++)
            mr[i*q + j] = elementWiseMultiplication(ma+(i*m), getColumnVector(mb, p, q, j), m);
    }
    return mr;
}

float **allocateMatrix(int n, int m){
    float **r = (float**)malloc(sizeof(float*)*n);
    for(int i=0; i<n; i++){
        r[i] = (float*)malloc(sizeof(float)*m);
    }
    return r;
}

void listToMatrix(float *list, float **matrix, int n, int m){
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            matrix[i][j] = list[i*m + j];}
    }
}

int main(){
    float **ma;
    float **mb;
    int n=2, m=2, p=2, q=2;

    ma = allocateMatrix(n, m);
    mb = allocateMatrix(p, q);

    float aList[6] = {3, 4, 2, 1};
    float bList[12] = {1, 5, 3, 7};

    listToMatrix(aList, ma, n, m);
    listToMatrix(bList, mb, p, q);
    
    //printMatrix(ma, n, m);
    //printMatrix(mb, p, q);
    
    float **mr = multMatrix(n, m, p, q, ma, mb);
    //printMatrix(mr, n, q);

    for(int i=0; i<m; i++)
        free(ma[i]);
    free(ma);
    for(int i=0; i<q; i++)
        free(mb[i]);
    free(mb);

    printVector(multMatrix(n, m, p, q, aList, bList), n*q);
}