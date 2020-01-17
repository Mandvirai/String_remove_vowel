import java.util.Scanner;
public class String_vowel {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        String A = S.toLowerCase();
        char ch[] = A.toCharArray();
        for(int i = 0;i<ch.length;i++){
            if(ch[i] == 'a' | ch[i] == 'e' | ch[i] == 'i' | ch[i] == 'o' | ch[i] == 'u'){

            }
            else{
                System.out.print("." +ch[i]);
            }
        }
    }
}
