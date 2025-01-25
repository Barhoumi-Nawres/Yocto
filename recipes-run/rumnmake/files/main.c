#include <stdio.h>
#include <stdlib.h>
#include "operation.h"
int main(int argc ,char **argv){
int a ,b ,sub,add,mul;
float div;
a=atoi(argv[1]);
b=atoi (argv[2]);
sub=substraction(a,b);
div=division(a,b);
add=addition(a,b);
mul=multiplication(a,b);

printf("la division est%f\n",div);
printf("la multiplication est %d\n",mul);
printf("l'addition est %d\n",add);
printf("la substraction est %d\n",sub);


return 0;
}
