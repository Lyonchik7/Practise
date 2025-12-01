#include <iostream>
#include <vector>
#include <climits>

using namespace std;

int findMin(const vector<int>& numbers) {
    if (numbers.empty()) {
        cerr << "Список пуст. Возвращаю максимальное значение int." << endl;
        return INT_MAX;
    }
    
    int min = numbers[0];
    for (int num : numbers) {
        if (num < min) {
            min = num;
        }
    }
    return min;
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

    cout << "Минимум в списке: " << findMin(arr) << endl;
    return 0;
}
