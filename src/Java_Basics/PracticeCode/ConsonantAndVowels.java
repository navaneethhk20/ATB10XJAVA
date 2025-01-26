package Java_Basics.PracticeCode;

public class ConsonantAndVowels {
    public static void main(String[] args) {
        //calculate the number of vowels and consonants in string
        String name ="Nithu";
        int vowel =0;
        int consonant = 0;

        for (int i=0;i<name.length()-1 ;i++){
            if(name.charAt(i) =='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o'|| name.charAt(i)=='u'){
                vowel++;

            }else{
                consonant++;
            }
        }
        System.out.println("Number of vowels in a give string is -> "+ consonant);
        System.out.println("Number of vowels in a give string is -> "+ vowel);
    }
}
