using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Simulation
{
    class Program
    {
        private static int N = 8;
        private static int[,] blobBlock = new int[8, 8]
        {
            {1,0,0,0,0,0,0,1 },
            {0,1,1,0,0,1,0,0 },
            {1,1,0,0,1,0,1,0 },
            {0,0,0,0,0,1,0,0 },
            {0,1,0,1,0,1,0,0 },
            {0,1,0,1,0,1,0,0 },
            {1,0,0,0,1,0,0,1 },
            {0,1,1,0,0,1,1,1 }
        };
        private static int BACKGROUND_COLOR = 0;
        private static int IMAGE_COLOR = 1;
        private static int ALREADY_COLOR = 2;

        public static int countCells(int x, int y)
        {
           
            if(x<0 || y<0 || x>=N || y >= N)
            {
                return 0;
            }
            else if(blobBlock[x,y] != IMAGE_COLOR)
            {
                return 0;
            }
            else
            {
                blobBlock[x, y] = ALREADY_COLOR;
                return 1 + countCells(x - 1, y + 1) + countCells(x, y + 1)
                        + countCells(x + 1, y) + countCells(x - 1, y - 1)
                        + countCells(x, y - 1) + countCells(x + 1, y - 1)
                        + countCells(x + 1, y+1) + countCells(x - 1, y );
            }
        }

        public static void Main(string[] args)
        {
            Console.WriteLine(countCells(1,5));
        }

    }
}
