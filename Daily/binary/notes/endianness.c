#include <stdio.h>

int main() {
    int x = 1;
    char *c = (char*) &x;
    if (*c)
        printf("Little endian\n");
    else
        printf("Big endian\n");
    return 0;
}
