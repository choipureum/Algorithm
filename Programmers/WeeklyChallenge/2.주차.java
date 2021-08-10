class Solution {
    double [] avg;
    public String solution(int[][] scores)
    {
        String answer = "";
        //평균 배열
        avg = new double[scores[0].length];

        for(int j=0;j<scores[0].length;j++)
        {
            int cnt = scores[0].length;
            double sum =0;
            int sw = scores[j][j];
            boolean rf_flag = false;
            boolean lf_flag = false;
            // 1번학생부터~
            for(int i=0;i<scores.length;i++)
            {
                if(i!=j && scores[i][j] == sw){
                    lf_flag = true;
                    rf_flag = true;
                }
                if(i!=j && scores[i][j]<sw) lf_flag = true;
                if(i!=j && scores[i][j]>sw) rf_flag = true;
                sum += scores[i][j];
            }
            //최고나 최저점이 모두 아닌경우
            if(lf_flag != rf_flag){
                sum-=scores[j][j];
                cnt--;
            }
            avg[j] = sum/cnt;
        }
        answer = checkPoint(avg);
        return answer;
    }
    public String checkPoint(double [] avg)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<avg.length;i++)
        {
            double point = avg[i];
            String tmp ="";
            if(point>=90)tmp="A";
            else if(point>=80 && point<90)tmp ="B";
            else if(point>=70 && point<80)tmp ="C";
            else if(point>=50 && point<70)tmp ="D";
            else tmp="F";

            sb.append(tmp);
        }
        return sb.toString();
    }
}
