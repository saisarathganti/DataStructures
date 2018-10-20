#include <bits/stdc++.h>
#include <stdio.h> 
#include <stdlib.h> 
#define ll long long
using namespace std;
ll randoml(ll min,ll max){
	ll range = max - min + 1;
	ll num = rand() % range + min;
	return num;
}
int main(){	
	freopen ("testoutput.txt","w",stdout);
	ll tem=randoml(1,100000);
	cout << tem <<" ";
	cout << randoml(0,20)<<endl;
	for(int i=0;i<tem;i++){
		cout << randoml(1,1000000000) << " " << randoml(1,1000000000) << " " << randoml(1,1000000000) <<endl;
	}
}

