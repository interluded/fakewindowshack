using System;
using System.Collections.Generic;
using System.Text;

namespace fakeHack
{
    internal class Program
    {
        public static OperatingSystem OSVersion => Environment.OSVersion;
        static void Main(string[] args)
        {
            String osVersion = Environment.OSVersion.ToString();
            Console.WriteLine("\"exploting\" " + osVersion + " at ip " + args[0] + " at port " + args[1]);
            Console.ReadLine();

        }
    }
}
