/*
给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。

示例 1:
输入: num1 = "2", num2 = "3"
输出: "6"

示例 2:
输入: num1 = "123", num2 = "456"
输出: "56088"
*/
package lianxi0508;

public class test0508 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String num1 = "123";
        String num2 = "456";
        String ss = s.multiply(num1,num2);
        System.out.println(ss);
    }
}

class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2 .equals("0")){
            return "0";
        }
        int[] arr = new int[num1.length()+num2.length()];
        for(int i = num1.length()-1; i>-1; i--){
            for(int j= num2.length()-1; j>-1; j--){
                int a = (num1.charAt(i)-48)  *(num2.charAt(j)-48);
                if( a > 9){
                    arr[i+j+1] += a%10;
                    arr[i+j] += a/10;
                }else{
                    arr[i+j+1] += a;
                }
                if(arr[i+j+1]>9){
                    arr[i+j] += arr[i+j+1] /10;
                    arr[i+j+1] = arr[i+j+1] %10;
                }

            }
        }
        String s = "";
        for(int i :arr){
            s += i;
        }
        if(s.charAt(0) == '0'){
            String ss = s.substring(1);
            return ss;
        }
        return s;
    }
}
