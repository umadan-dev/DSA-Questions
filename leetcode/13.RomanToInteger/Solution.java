class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> romanToInt= new HashMap<>();
        romanToInt.put('I',1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L' , 50);
        romanToInt.put('C' , 100);
        romanToInt.put('D' , 500);
        romanToInt.put('M' , 1000);

        int resultInteger = 0;
        for(int index=s.length()-1 ; index>=0 ; index--)
        {
            resultInteger += romanToInt.get(s.charAt(index));
            if( index>0 && romanToInt.get(s.charAt(index))>romanToInt.get(s.charAt(index-1))){
                resultInteger -= romanToInt.get(s.charAt(index-1));
                index--;
            }
        }
        return resultInteger;
    }
}

