class SolutionVerticalScanning {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        int flag=0;
        for (int i=0;i<strs[0].length();i++){
            char match = strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(i == strs[j].length()||strs[j].charAt(i)!=match) flag=1;
            }
            if (flag==1) break;
            str.append(match);
        }
        return str.toString(); 
    }
}
