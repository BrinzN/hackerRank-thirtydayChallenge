import java.util.Scanner;
public class DaySixLetUsReview {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++){
            String inputStr = sc.nextLine();
            char[] myStrArr = inputStr.toCharArray();
            String oddChar = "";
            String evenChar = "";
            for(int j=0; j<inputStr.length(); j++){
                if(j%2==0){
                    oddChar = oddChar+ myStrArr[j];
                }
                else{
                    evenChar = evenChar + myStrArr[j];
                }
            }
            System.out.println(oddChar+" "+ evenChar);

        }
    }
}
