#include <iostream>
#include <vector>
#include <climits>

using namespace std;

// Функция для нахождения максимума в векторе целых чисел
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
    // Пример использования функции findMax
    vector<int> arr = {1, 5, 3, 9, 2};
    cout << "Максимум в списке: " << findMax(arr) << endl;
    return 0;
}
