class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = 0;

 
     while (true){
            if (chicken>=10){
                int couponChicken = chicken / 10;
                int remainCoupon = chicken % 10;
                answer += couponChicken;
                chicken = couponChicken + remainCoupon;
            }
            else {
                break;
            }

        }
        return answer;
    }
}