import java.util.Stack;

/*
You are given a string s and an integer k, a k duplicate removal consists of
choosing k adjacent and equal letters from s
and removing them, causing the left and the right side of the deleted
substring to concatenate together.
We repeatedly make k duplicate removals on s until we no longer can.

Input: K = 2, str = “geeksforgeeks”
Output: gksforgks
Explanation: After removal of both occurrences of the substring “ee”, the string reduces to “gksforgks”.

Input: K = 3, str = “qddxxxd”
Output: q
Explanation:
Removal of “xxx” modifies the string to “qddd”.
Again, removal of “ddd”modifies the string to “q”.
 */
public class RemoveKConsecutiveDuplicateCharacter {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbbaaadbc",3));
    }
    public static String removeDuplicates(String s, int k) {

        if(k<=1)
            return "";


        Stack<CharFrequency> stak= new Stack<CharFrequency>();
        for(int i=0;i<s.length(); i++)
        {
            if(stak.size()==0)
            {
                stak.push(new CharFrequency(s.charAt(i),1));
                continue;
            }

            if(stak.peek().charVal==s.charAt(i)){

                CharFrequency charFeq=stak.peek();

                stak.pop();

                charFeq.count+=1;
                if(charFeq.count==k)
                {
                    continue;
                }
                else{
                    stak.push(charFeq);
                }

            }else{
                stak.push(new CharFrequency(s.charAt(i),1));
            }


        }
        StringBuilder output=new StringBuilder();
        while(stak.size()>0)
        {
            char c=stak.peek().charVal;

            int charCount=stak.peek().count;

            while(charCount>0)
            {
                output.append(c);
                charCount--;
            }
            stak.pop();

        }

        return output.reverse().toString();
    }



   static class CharFrequency{
        int count;
        char charVal;

        CharFrequency(char charVal, int count)
        {
            this.count=count;
            this.charVal=charVal;
        }
    }
}
