#include <bits/stdc++.h>
using namespace std;
#define ll long long
#define pb push_back
#define pf push_front
void dfs(ll temp2,vector<ll> adl[],bool vis[],string col[],ll parent){
	vis[temp2]=true;
	col[temp2]="grey";
	cout << temp2 << " ";
	vector<ll>::iterator it;
	for(it=adl[temp2].begin();it!=adl[temp2].end();it++){
		if(col[*it]=="white"){
			dfs(*it,adl,vis,col,temp2);
		}
		else if(col[*it]=="grey"&&*it!=parent){
			cout << "cycle exists" << endl;
			exit();
		}
	}
}
int main(){
	ll n,temp1,temp2,no;
	cout << "Enter number of vertices: " << endl;
	cin >> n;
	vector<ll> adl[n+1];
	cout <<"Enter no of edges: "<<endl;
	cin >> no; 
	cout << "Now enter edges: "<< endl;
	for(ll i=0;i<no;i++){
		cin >> temp1>>temp2;
		adl[temp1].pb(temp2);
		adl[temp2].pb(temp1);
	}
	vector<ll>::iterator it;
	for(ll i=1;i<=n;i++){
		cout << i<<" - ";
		for(it=adl[i].begin();it!=adl[i].end();it++){
			cout << *it <<" - ";
		}
		cout<< endl;
	}
	string col[n+1];
	for(ll a=0;a<n+1;a++)
		col[a]="white";
		
	bool vis[n];
	memset(vis,false,sizeof(vis[0])*n);
	cout<<"Enter source for dfs: "<<endl;
	cin >> temp2;
	dfs(temp2,adl,vis,col,-1);
	/*
	cout <<"Enter source for bfs: "<<endl;
	cin >> temp1;
	list<ll> que;
	que.pb(temp1);
	vis[temp1]=true;
	while(!que.empty()){
		temp1=que.front();
		que.pop_front();
		cout << temp1<<" ";
		for(it=adl[temp1].begin();it!=adl[temp1].end();it++){
			if(!vis[*it]){
				vis[*it]=true;
				que.pb(*it);
			}
		}
	}	*/
	return 0;
}
