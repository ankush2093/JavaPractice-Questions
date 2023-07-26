#include<bits/stdc++.h>
using namespace std;

int main(){
    int a, b, c, d, e, f;
    cin>>a>>b>>c>>d>>e>>f;
    int maxxi = max(a, max(b, max(c, max(d, max(e, f)))));
    int minni = min(a, min(b, min(c, min(d, min(e, f)))));
    cout<<maxxi <<endl;
    cout<< minni << endl;
}