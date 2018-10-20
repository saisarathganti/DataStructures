#include <bits/stdc++.h>
#define pb push_back
#define ins insert
#define pf push_front
#define bl bool
#define rem remove
#define ll long long
#define lpf(a,b,c,d) for(ll d=a;d<=b;d=d+c)
#define lpb(a,b,c,d) for(ll d=a;d>=b;d=d-c)
#define vi vector<int>
#define vll vector<ll>
#define vvi vector < vi >
#define pii pair<int,int>
#define pll pair<long long, long long>
#define mod 1000000007
#define inf 1000000000000000001;
#define all(c) c.begin(),c.end()
#define mp(x,y) make_pair(x,y)
#define mem(a,val) memset(a,val,sizeof(a))
#define eps 1e-9
#define pi 3.1415926535897932384626433832795
#define dbl double long
#define sp setprecision
#define x first
#define y second

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	ll n,k;
	cin >> n >> k;
	ll pos[n];
	ll rad[n];
	ll iq[n];
	lpf(0,n-1,1,i)
	{
		cin >> pos[i] >> rad[i] >> iq[i];
	}
	bl pair[n][n];
	ll cnt=0;
	lpf(0,n-1,1,i)
	{
		lpf(0,n-1,1,j)
		{
			pair[i][j]=0;
		}
		
	}
	lpf(0,n-1,1,i)
	{
		lpf(0,n-1,1,j)
		{
			if(i==j)
			{
				pair[i][j]=0;
			}
			else if((abs(pos[i]-rad[i])<=pos[j] && pos[i]+rad[i]>=pos[j]) && abs(iq[i]-iq[j])<=k)
			{
				pair[i][j]=1;
			}
		}
	}
	// lpf(0,n-1,1,i)
	// {
	// 	lpf(0,n-1,1,j)
	// 	{
	// 		cout << pair[i][j] << " ";
	// 	}
	// 	cout << endl;
	// }
	lpf(0,n-1,1,i)
	{
		lpf(0,n-1,1,j)
		{
			if(pair[i][j]==1 && pair[j][i]==1 && i!=j)
			{
				cnt++;
			}
		}
	}
	cout << cnt/2 << endl;

	return 0;
}	
