#include <bits/stdc++.h>
using namespace std;
int main(){
	int t;
	cin >> t;
	for(int i=0;i<t;i++) {
			string in;
			cin >> in;
			string temp=in;
			int n;
			cin >> n;
			for(int j=1;j<n;j++) {
				in=in+temp;
			}
		//	System.out.println(in);
			int ans=0;
			int cn=0;
			int cn1=0;
			for(int j=0;j<in.size();j++) {
			 {
					if(in[j]=='a') {
						cn++;
					}
					if(in[j]=='b') {
						cn1++;
					}
				}
				if(cn>cn1) {
					ans++;
				}
			}
			cout << ans << endl;
		}
	}
