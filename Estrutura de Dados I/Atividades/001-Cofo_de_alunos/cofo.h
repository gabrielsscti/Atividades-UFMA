#include <stdio.h>
#include <stdlib.h>
#include <string.h>
    typedef struct _aluno_{
        char nome[50];
        int cpf;
        float saldoBancario;
    }Aluno;

    typedef struct _cofo_{
        int nElms;
        int maxElms;
        Aluno *elms;
    }Cofo;

    Cofo *cofCreate(int n);
    Aluno *cofInsert(Cofo *c, Aluno *a);
    int cofRemove(Cofo *c, int key);
    Aluno *cofQuery(Cofo *c, int key);
    int cofDestroy(Cofo *c);