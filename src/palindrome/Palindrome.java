/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author Guntur
 */
import java.util.Scanner;
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    static boolean isPalindrome(String str){
        
        int i = 0, j = str.length() - 1;
        
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program Pengecekan Kata Palindrome");
        Scanner reader = new Scanner(System.in);
        System.out.print("Masukkan kata untuk diproses: ");
        String original = reader.nextLine();
        if (isPalindrome(original)){
            System.out.printf("%s adalah kata Palindrome", original);
        }else{
            System.out.printf("%s adalah bukan kata Palindrome", original);
        }
        
    }
    
}
