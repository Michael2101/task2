import java.util.Arrays;
public class task2 {
public static void main(String[] args) {
    int[] arr = new int[]{10, 4, 1, 4, -10, -50, 32, 21};
    int[] arr2 = new int[]{1,2,3,4};
    int[] arr3 = new int[]{1,2,3};
    int[] arr33 = new int [arr3.length];
    cumulativeSum(arr3, arr33);
    int[] mas = new int[]{7};
    System.out.println(repeat("mice", 5));
    System.out.println(differenceMaxMin(arr));
    System.out.println(isAvgWhole(arr2));
    System.out.println(getDecPlc("43.20"));
    System.out.println(Arrays.toString(arr33));
    Fibanachi(7);
    System.out.println(isValid("590011"));
    System.out.println(isStrangePair("ratio", "orator"));
    System.out.println(isPrefix("automation", "auto-"));
    System.out.println(isSuffix("arachnophobia", "-phobia"));
    System.out.println(box(1));
 }


public static String repeat (String word, int amount)
{

    String output = ""; 
    for (int i = 0; i < word.length(); i++) 
    {
        for (int j = 0; j < amount; j++)    
        {
            output += word.charAt(i);       
        }
    }
    return output;
}
public static int differenceMaxMin (int[] array){
        int max, min, output; 
        max = array[0]; min = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (max < array[i])
            {
                max = array[i];
            }
            if (min > array[i])
            {
                min = array[i];
            }
        }
        output = max - min;
        return output;
}
public static boolean isAvgWhole(int[] array){
    float f = 0;

    for (int i = 0; i < array.length; i++)
    {
        f += array[i];
    }
    f = f / array.length;
    
    return ((int) f == f);
}
public static void cumulativeSum(int[] arr3, int[] arr33)
{
    int cum = 0;
    for (int i = 0; i < arr3.length; i++)
    {
        arr33[i] = arr3[i] + cum;
        cum += arr3[i];
    }
}
public static int getDecPlc(String num)
{   
    int dotplace =0;
    for (int i = 0; i < num.length(); i++)
    {
        if (num.charAt(i) == '.')
        {
            dotplace = num.length() - i - 1;
        }
    }
    return dotplace;
}
public static void Fibanachi(int numb){
    numb+=2;
    int[] mas = new int[numb];
    mas[0]=0;
    mas[1]=1;
    for(int i=2;i<mas.length;i++){
        mas[i]=mas[i-1]+mas[i-2];
    }
    System.out.println(mas[mas.length-1]);
    
}
public static boolean isValid(String word){
    String space = " ";
    char[]  repeet = word.toCharArray();
    if(repeet.length>5){
        return false;
    }
    for (int i = 0; i< repeet.length; i++){
        if(Character.isWhitespace(repeet[i])){
            return false;
        }
        if(Character.isLetter(repeet[i])){
            return false;
        }
    }
    return true;
}
public static boolean isStrangePair(String word1, String word2)
{
    if ( (word1.charAt( 0 ) == word2.charAt(word2.length() - 1 ) ) & (word2.charAt( 0 ) == word1.charAt(word1.length() - 1) ) ) 
    {
        return true;
    }

    return false;
}
public static boolean isPrefix(String word, String prefix)
    {
        
        prefix = prefix.substring(0, prefix.length() - 1);
        
        if(word.matches(String.format("^(?:%s).*", prefix)))
        {
            return true;
        }
        return false;
    }
    public static boolean isSuffix(String word, String suffix)
    {
        suffix = suffix.substring(1);
        
        if(word.matches(String.format("(.*(?:%s)$)", suffix)))
        {

            return true;
        }

        return false;
    }
public static int box(int step)
    {
        int sum = 0;

        for (int i = 1; i <= step; i++)
        {
            if (i % 2 == 0)
            {
                sum -= 1;
            }
            if (i % 2 != 0)
            {
                sum += 3;
            }
            
        }
        return sum;
    }
}
