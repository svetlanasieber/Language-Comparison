public class Box<T>
{
    public T Value { get; set; }
}

var intBox = new Box<int> { Value = 42 };
Console.WriteLine(intBox.Value); 
