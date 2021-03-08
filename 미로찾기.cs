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
        private static int[,] maze = new int[8, 8]{
            { 0,0,0,0,0,0,0,1 },
            { 0,1,1,0,1,1,0,1 },
            { 0,0,0,1,0,0,0,1 },
            { 0,1,0,0,1,1,0,0 },
            { 0,1,1,1,0,0,1,1 },
            { 0,1,0,0,0,1,0,1 },
            { 0,0,0,1,0,0,0,1 },
            { 0,1,1,1,0,1,0,0 }
            };
        private const int PATHWAY_COLOUR = 0; //통행가능
        private const int WALL_COLOUR = 1;    //벽
        private const int BLOCKED_COLOUR = 2; //갈수있지만 막혀있음
        private const int PATH_COLOUR = 3;    //지나간곳


        public static bool FindMazePath(int x,int y)
        {
            if(x<0 || y<0 || x>=N || y >= N)
            {
                return false;
            }
            else if (maze[x, y] != PATHWAY_COLOUR)
            {
                return false;
            }
            else if (x == N - 1 && y == N - 1)
            {
                maze[x, y] = PATH_COLOUR;
                return true;
            }
            else
            {
                maze[x, y] = PATH_COLOUR;
                if (FindMazePath(x - 1, y) || FindMazePath(x, y + 1)
                    || FindMazePath(x + 1, y) || FindMazePath(x, y - 1))
                {
                    return true;
                }
                maze[x, y] = BLOCKED_COLOUR; //dead End
                return false;
            }
        }

        public static void printMaze()
        {
            for(int i = 0; i < N; i++)
            {
                for(int j = 0; j < N; j++)
                {
                    Console.Write(maze[i,j]);
                }
                Console.WriteLine();
            }
        }

        public static void Main(string[] args)
        {
            printMaze();
            Console.WriteLine(FindMazePath(0, 0));
            Console.WriteLine();
            printMaze();

        }

    }
}
