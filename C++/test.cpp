#include<iostream>
#include<vector>

using namespace std ;

vector<int> readVals();
void printVals(vector<int> v);
vector<int> valsGT0(vector<int> v);
int findLast(vector<int> v, int target);

int main()
{
    // vector<int> a(4,1) ;
    //
    // cin >>a[2] ;
    //
    // a.clear();
    // a.insert(a.begin(), 1000);
    // a.insert(a.begin()+1, 10);
    // a.insert(a.begin()+2, 10);
    // a.erase(a.begin());
    // a[1] =99;

    vector<int> a;
    a = readVals();
    cout << "Original:" << " ";
    printVals(a);

    vector<int> newA;
    newA = valsGT0(a);
    cout << "Filtered:" << " ";
    printVals(newA);

    cout << findLast(a,23) << '\n';
    return 0 ;
}

vector<int> readVals(){
    int val;
    vector<int> v;
    for (int i = 0; i < 5; i++) {
        cin >> val;
        v.push_back(val);
    }
    return v;
}

void printVals(vector<int> v){
    for(int i =0; i<v.size(); i++){
        cout << v[i] << " ";
    }
    cout  << '\n';
}

vector<int> valsGT0(vector<int> v){
    vector<int> result;
    for(int i=0; i<v.size(); i++){
        if(v[i]>0){
            result.push_back(v[i]);
        }
    }
    return result;
}

int findLast(vector<int> v, int target){
    int result = -1;
    for (int i = 0; i < v.size(); i++) {
        if(v[i] == target && result < i){
            result = i;
        }
    }
    return result;
}
