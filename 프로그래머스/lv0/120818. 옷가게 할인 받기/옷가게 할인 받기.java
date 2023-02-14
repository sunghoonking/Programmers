class Solution {
    public int solution(int price) {
        int answer = 0;

           if(price >= 500000) {
            price *= 0.8;
        } else if(price >= 300000) {
            price *= 0.9;
        } else if(price >= 100000) {
            price *= 0.95;
        }
        return price;
        // int q = 0;
        // if(price >= 500000){
        //     q = (int) (price * 20.0 / 100.0);
        // }else if(price>=300000){
        //     q = (int) (price * 10.0 / 100.0);
        // }else if(price>=100000) {
        //     q = (int) (price * 5.0 / 100.0);
        // }
        // answer = price- q;
        // return answer;
    }
}