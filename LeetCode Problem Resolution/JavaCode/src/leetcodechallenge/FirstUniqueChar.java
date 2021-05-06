/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodechallenge;

/**
 *
 * @author Davessenn
 */
public class FirstUniqueChar {

    public static int firstUniqChar(String s) {
        if (s.length() == 1) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {

//                System.out.println("i " + i);
//                System.out.println("s[i] " + s.charAt(i));
//                System.out.println("j " + j);
//                System.out.println("s[j] " + s.charAt(j));
                if (i != j) {
                    if (s.charAt(i) == (s.charAt(j))) {
                        break;
                    }
                }
                if (j == s.length() - 1) {
                    return i;
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String yo = "dddccdbba";
        System.out.println(firstUniqChar(yo));
    }

}
