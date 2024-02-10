#include <iostream>

using namespace std;

int digLen(int n) {
  
  int len = 0;
  while (n > 0) {
    int last = n % 10;
    len++;
    n /= 10;
  }

  return len;
}

int main() {
  int n = -84651;

  int ans = 0;
  if (n < 0) {
    ans = 1 + ans + digLen(abs(n));
  }
  else {
    ans += digLen(n);
  }

  cout << ans << endl;

  return 0;
}