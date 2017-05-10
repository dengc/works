#include<iostream>
#include<vector>

using namespace std;

vector<int> readVals();
vector<int> valsGT0(vector<int> v);
int findLast(vector<int> v, int target);
void IterPrint(vector<int>v);

int main()
{
    vector<int> a;
    a = readVals();
    cout << "Original: ";
    IterPrint(a);

    vector<int> newA;
    newA = valsGT0(a);
    cout << "Filtered: ";
    IterPrint(newA);

    cout << "result: " << findLast(a,23) << '\n';
    return 0 ;
}

vector<int> readVals(){
    int val;
    vector<int> v;
    while (cin >> val) {
        v.push_back(val);
    }
    return v;
}

vector<int> valsGT0(vector<int> v){
    vector<int> result;
    for(int i = 0; i < v.size(); i++){
        if(v[i] > 0){
            result.push_back(v[i]);
        }
    }
    return result;
}

int findLast(vector<int> v, int target){
    int result = -1;
    for (int i = 0; i < v.size(); i++) {
        if(v[i] == target){
            result = i;
        }
    }
    return result;
}

void IterPrint(vector<int>v){
    vector<int>::iterator iter;
    for (iter = v.begin(); iter != v.end(); iter++){
        cout << (*iter) << " ";
    }
    cout  << '\n';
}
