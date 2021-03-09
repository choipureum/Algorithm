using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Simulation
{
    class Program
    {
        private static char[] data = {'a','b','c','d','e','f' };
        private static int n = data.Length;
        private static bool[] include = new bool[n];
        private static int cnt = 0;

        public static void powerSet(int k)
        {
            if (k == n)
            {
                for(int i = 0; i < n; i++)
                {
                    if (include[i])
                    {
                        Console.Write(data[i]+" ");
                       
                    }                
                }
                Console.WriteLine();
                cnt++;
                return;
            }
            include[k] = true;
            powerSet(k + 1);
            include[k] = false;
            powerSet(k + 1);
        }

        public static void Main(string[] args)
        {
            powerSet(0);
            Console.WriteLine(cnt);
        }

    }
}
