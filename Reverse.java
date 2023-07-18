package com.app;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "INFOWAY TECHNOLOGIES";
        String rev = reverseString(s);
        System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + rev);
    }

    public static String reverseString(String str) {
        char[] info = str.toCharArray();
        int left = 0;
        int right = info.length - 1;
        char temp;
        
        while (left < right) {
            
            temp = info[left];
            info[left] = info[right];
            info[right] = temp;

            left++;
            right--;
        }

        return new String(info);
	}

}
