#include <iostream>
#include <bits/stdc++.h>

using namespace std;

bool isAnagram(string str1, string str2)
{
    int length1 = str1.length();
    int length2 = str2.length();

    if (length1 != length2)
        return false;

    sort(str1.begin(), str1.end());
    sort(str2.begin(), str2.end());

    for (int i = 0; i < length1; i++)
        if (str1[i] != str2[i])
            return false;

    return true;
}

int main()
{
    string input1;
    string input2;

    cout << "What is the first string? ";
    cin >> input1;
    cout << "And the second string? ";
    cin >> input2;

    if (isAnagram(input1, input2))
        cout << "Yes, they are anagrams.";
    else
        cout << "No, they are not anagrams.";

    return 0;
};