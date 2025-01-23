public void PrintType<T>(T item)
{
    Console.WriteLine(typeof(T)); 
}

PrintType(42);  // Output: System.Int32
PrintType("Hello");  // Output: System.String
