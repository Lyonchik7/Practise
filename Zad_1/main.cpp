#include <iostream>
#include <vector>
#include <climits>

using namespace std;

int findMax(const vector<int>& numbers) {
    if (numbers.empty()) {
        cerr << "Список пуст. Возвращаю минимальное значение int." << endl;
        return INT_MIN;
    }
    
    int max = numbers[0];
    for (int num : numbers) {
        if (num > max) {
            max = num;
        }
    }
    return max;
}

int main() {
    int n;
    cout << "Введите количество элементов в массиве: ";
    cin >> n;

    vector<int> arr(n);
    cout << "Введите элементы массива: ";
    for (int i = 0; i < n; ++i) {
        cin >> arr[i];
    }

    cout << "Максимум в списке: " << findMax(arr) << endl;
    return 0;
}
