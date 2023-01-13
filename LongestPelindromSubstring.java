public class LongestPelindromSubstring {
    public static void main(String[] args) {

       String s = "ababbadefabbba";
       //abba
        //aba
        String result=getLongPerlindrom(s);
        System.out.println("Pelindrom String "+result);
    }
    public static String getLongPerlindrom(String str)
    {
        String result="";

        if(isPelindrom(str))
        {
            return str;
        }

        char[] charArray=str.toCharArray();

        for(int i=0;i<charArray.length;i++)
        {
          int indexVal=  str.lastIndexOf(charArray[i]);
          String subString=str.substring(i,indexVal+1);
          //check is SubString pelindrom
          if(  isPelindrom(subString))
          {
              if(result.length()<subString.length())
              {
                  result=subString;
              }
          }
    }

        return result;
    }

      public static boolean isPelindrom(String str)
    {
        int len=str.length();
        for(int x=0;x<len/2;x++)
        {
            if(str.charAt(x)!=str.charAt(len-(1+x)))
                return false;
        }
        return true;
    }
}
