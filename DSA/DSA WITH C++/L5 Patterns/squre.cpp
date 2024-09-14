/*  1234
    1234
    1234
    1234 */

#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter No. Of Lines : ";
    cin>>n;
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {
            cout<<j<<" ";     // Use ("*") for star patterns
        }
        cout<<endl;
    }
    return 0;
}