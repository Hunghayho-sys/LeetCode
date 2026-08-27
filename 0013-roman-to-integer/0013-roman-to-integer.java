class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        char[] m = s.toCharArray();
        for (int i = 0; i < m.length; i++) {
            if (m[i] == 'I') {
                // Kiểm tra xem còn phần tử phía sau không trước khi truy cập m[i+1]
                if (i + 1 < m.length && (m[i+1] == 'X' || m[i+1] == 'V')) {
                    sum -= 1;
                } else {
                    sum += 1;
                }
            } else if (m[i] == 'V') {
                sum += 5;
            } else if (m[i] == 'X') {
                if (i + 1 < m.length && (m[i+1] == 'L' || m[i+1] == 'C')) {
                    sum -= 10;
                } else {
                    sum += 10;
                }
            } else if (m[i] == 'L') {
                sum += 50;
            } else if (m[i] == 'C') {
                if (i + 1 < m.length && (m[i+1] == 'D' || m[i+1] == 'M')) {
                    sum -= 100;
                } else {
                    sum += 100;
                }
            } else if (m[i] == 'D') {
                sum += 500;
            } else if (m[i] == 'M') {
                sum += 1000;
            }
        }
        return sum;
    }
}