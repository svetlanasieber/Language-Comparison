namespace CustomMinFunction
{
    internal class Program
    {
        static void Main(string[] args)
        {
          
            int[] inputNumbers = Console.ReadLine()
                .Split()
                .Select(int.Parse)
                .ToArray();

            Func<int[], int> getMinNumber = numbers
                => numbers.Min();

            Console.WriteLine(getMinNumber(inputNumbers));
        }
    }
}
