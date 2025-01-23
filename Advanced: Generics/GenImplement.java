public <T> void printType(T item) {
    System.out.println(item.getClass()); 
}

printType(42);    
printType("Hello"); 
