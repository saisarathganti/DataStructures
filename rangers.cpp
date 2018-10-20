#include <bits/stdc++.h>
using namespace std;
#define ll long long
bool brr[51];
ll cou=0;
ll pandi;
class Graph 
{ 
    int V;    // No. of vertices 
  
    // Pointer to an array containing adjacency lists 
    list<int> *adj; 
  
    // A function used by DFS 
    void DFSUtil(int v, bool visited[]); 
public: 
    Graph(int V);   // Constructor 
    void addEdge(int v, int w); 
    void connectedComponents(); 
}; 
 
static bool initialized=false;

// Method to print connected components in an 
// undirected graph 
void Graph::connectedComponents() 
{ 
    // Mark all the vertices as not visited 
    bool *visited = new bool[V]; 
    for(int v = 0; v < V; v++) 
        visited[v] = false; 
  
    for (int v=0; v<V; v++) 
    { 
        if (visited[v] == false) 
        { 
            // print all reachable vertices 
            // from v 
            DFSUtil(v, visited); 
            cou++;
            
            
        } 
    } 
} 
ll crr[50]; 
ll dude=0; 
void Graph::DFSUtil(int v, bool visited[]) 
{ 
    // Mark the current node as visited and print it 
    visited[v] = true;
    if(brr[v]==true){ 
		if (!initialized) {
			   initialized = true;
			   // do the initialization 
			   pandi=v;
			}
		cou++;
		crr[dude++]=v;
  }
    // Recur for all the vertices 
    // adjacent to this vertex 
    list<int>::iterator i; 
    for(i = adj[v].begin(); i != adj[v].end(); ++i) 
        if(!visited[*i]) 
            DFSUtil(*i, visited); 
} 
  
Graph::Graph(int V) 
{ 
    this->V = V; 
    adj = new list<int>[V]; 
} 
  
// method to add an undirected edge 
void Graph::addEdge(int v, int w) 
{ 
    adj[v].push_back(w); 
    adj[w].push_back(v); 
} 
  
int main(){
	ll n;
	cin >> n;
	while(n--){
		pandi=0;
		initialized=false;
		dude=0;
		cou=0;
		ll a;
		cin >> a;
		ll arr[50];
		Graph g(51); 
		memset(brr,false,51);
		for(ll i=0;i<a;i++){
			cin >> arr[i];
			brr[arr[i]]=true;
		}
		for(ll i=0;i<a;i++){
			for(ll j=i+1;j<a;j++){
				if(__gcd(arr[i], arr[j])==1){
					g.addEdge(arr[i], arr[j]); 
				}
			}
		}
		g.connectedComponents(); 
		cou=cou-50;
		cout << pandi << endl; 
		if(cou==1){
			cout << "0" << endl;
			for(ll i=0;i<a;i++){
				cout << arr[i] << " ";
				}
			cout << endl;
			goto hev;
		}
		cout << "1" << endl;
		for(int i=0;i<a-1;i++){
			cout << crr[i] << " ";
		}
		cout << crr[a-1]+1 << endl;
		hev:
		ll op;
	}
	return 0;
}
