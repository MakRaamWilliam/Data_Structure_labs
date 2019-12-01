#include <bits/stdc++.h>

using namespace std;

int fastexponent3(int a, int b, int m)
{
    if (a == 0)
        return 0;
    if (b == 0)
        return 1;
    int c;
    if (b % 2 == 0) {
        c = fastexponent3(a, b / 2, m);
        c = (c * c) % m;
    }
    else {
        c = a % m;
        c = (c * fastexponent3(a, b - 1, m) % m) % m;
    }

    return (c + m) % m;
}

int main()  
{  
int a , b , m ;  cout<<"enter a, b, m"<<endl;
    cin>>a >>b>>m;
   printf("Power is %d", fastexponent3(a, b, m));
 
 return 0;

}
