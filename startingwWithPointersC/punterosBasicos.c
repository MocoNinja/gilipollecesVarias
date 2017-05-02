#include <stdio.h>
#include <stdlib.h>

void punteros_intro()
{
    int numero = 10;
    int* direccion = &numero;
    printf("El numero es %d y su direccion es %p.\n", numero, direccion);
}

void funcion_normal(int numero)
{
    printf("Esta funcion toma como paramentro un int numero");
    printf("Se me ha pasado el numero %d.\n", numero);
    numero *= 2;
    printf("Voy a duplicar su valor localmente, quedando %d.\n", numero);
}

void funcion_punteros(int* puntero)
{
    printf("Esta funcion toma como paramentro un puntero int* puntero");
    printf("Se puede acceder al numero usando *puntero, quedando: numero %d.\n", *puntero);
    *puntero *= 2;
    printf("Despues de multiplicar por 2, queda que *puntero =  %d.\n", *puntero);

}
int main(int argc, char** argv)
{
    punteros_intro();

    int numero = 10;
    printf("Acabo de definir un numero que vale %d. Voy a llamar a una funcion...\n", numero);
    funcion_normal(numero);
    printf("Al volver a main, numero vale %d.\n", numero);
    printf("--------------------------------------------\n");
    printf("Ahora ejecuto la misma funcion, pero con punteros, pasandole &numero");
    funcion_punteros(&numero);
    printf("Al volver a main, numero vale %d.\n", numero);
    return (EXIT_SUCCESS);
}

