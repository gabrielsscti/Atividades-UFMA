#include "cofo.h"

Cofo *cofCreate(int n){
    Cofo *c = (Cofo*)malloc(sizeof(Cofo));
    if(c!=NULL){
        c->elms = (Aluno*)malloc(sizeof(Aluno)*n);
        c->maxElms = n;
        c->nElms = 0;
        if(c->elms!=NULL)
            return c;
    }
    return NULL;
}


Aluno *cofInsert(Cofo *c, Aluno *a){
    if(c!=NULL && a!=NULL){
        if(c->nElms!=c->maxElms){
            Aluno *newAluno = c->elms+c->nElms;
            c->nElms++;
            newAluno->cpf = a->cpf;
            strcpy(newAluno->nome, a->nome);
            newAluno->saldoBancario = a->saldoBancario;
            return newAluno;
        }
    }
    return NULL;
}

int cofRemove(Cofo *c, int key){
    if(c!=NULL){
        if(c->nElms!=0){
            int i=0;
            while(c->elms[i].cpf != key && i!=c->nElms)
                i++;
            if(i!=c->nElms){
                for(int j=i; j<c->nElms-1; j++)
                    c->elms[j] = c->elms[j+1];
                c->nElms--;
                return true;
            }
        }
    }
    return false;
}

Aluno *cofQuery(Cofo *c, int key){
    if(c!=NULL){
        if(c->nElms!=0){
            int i=0;
            while(c->elms[i].cpf != key && i!=c->nElms)
                i++;
            if(i!=c->nElms)
                return c->elms+i;
            
        }
    }
    return NULL;
}

int cofDestroy(Cofo *c){
    if(c!=NULL){
        if(c->nElms==0){
            free(c->elms);
            free(c);
            return true;
        }
    }
    return false;
}