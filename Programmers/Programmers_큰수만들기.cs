using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Simulation
{
    class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine(solution("1924",2));
            Console.WriteLine(solution("1231234", 3));
            Console.WriteLine(solution("4177252841", 4));
           
        }
        public static string solution(string number, int k)
        {
            var answer = new StringBuilder();
            int idx = 0;
            char max;
            
            if (number[0] == '0')
            {
                answer.Append('0');
            }
            else
            {
                for(int i = 0; i < number.Length - k; i++)
                {
                    max = '0';
                    for(int j = idx; j <= k + i; j++)
                    {
                        if (j >= number.Length) { break; }
                        if (max < number[j])
                        {
                            max = number[j];
                            idx = j + 1;                           
                        } 
                    }
                    answer.Append(max);
                }
            }
            return answer.ToString();
        }
    }


}
