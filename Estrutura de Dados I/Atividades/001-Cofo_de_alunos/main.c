#include "cofo.h"

void printAluno(Aluno *a){
    if(a!=NULL)
        printf("Nome: %s\nCPF: %d\nSaldo bancario: %.2f\n\n", a->nome, a->cpf, a->saldoBancario);
}

int main(){
    Cofo *c = cofCreate(10);
    int i;
    if(c!=NULL){
        Aluno *a = (Aluno*)malloc(sizeof(Aluno));
        int actCpf = 1;
        a->cpf = actCpf;
        strcpy(a->nome, "Gabriel");
        a->saldoBancario = 34.2;
        Aluno *b = cofInsert(c, a);
        printAluno(b);
    }
    if(c!=NULL){
        printf("Is not null\n");
    }
    else{
        printf("Is null\n");
    }
}