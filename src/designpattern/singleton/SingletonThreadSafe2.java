package designpattern.singleton;

/**
 * Initialization Demand Holder 
 * Thread-Safe method
 */
class SingletonThreadSafe2 {  
    private SingletonThreadSafe2() {  
    }  
      
    private static class HolderClass {  
            private final static SingletonThreadSafe2 instance = new SingletonThreadSafe2();  
    }  
      
    public static Singleton getInstance() {  
        return HolderClass.instance;  
    }
}