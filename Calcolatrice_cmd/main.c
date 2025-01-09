#include <stdio.h>
#include <stdlib.h>
#define R 10

int main(int argc, char *argv[])
{
    char operand;
    int res=0;

    if(4<argc || 0>argc){
        printf("Errore, parametri insufficienti");
    } else{
        if(argv[2][1]=='*'){
            operand = argv[2][1];
        } else{
            operand = argv[2][0];
        }
        printf("%c", operand);

        switch (operand){
            case '+':
            break;
        }
    }

    return 0;
}
