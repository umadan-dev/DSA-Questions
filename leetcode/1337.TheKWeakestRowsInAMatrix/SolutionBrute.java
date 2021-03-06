class SolutionBrute {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[mat.length];
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum=0;
            for(int j=0;j<mat[i].length;j++){
                sum+=mat[i][j];
            }
            result[i]=sum*mat.length+i;
        }
        Arrays.sort(result);
        for(int i=0;i<k;i++){
            result[i]=result[i]%mat.length;
        }
        return Arrays.copyOfRange(result, 0, k);
    }
}
