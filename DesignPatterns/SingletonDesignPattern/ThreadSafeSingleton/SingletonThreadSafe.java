package SingletonDesignPattern.ThreadSafeSingleton;

// class Singleton{
//     private static Singleton instance  = null;

//     private Singleton(){
//         System.out.println("Singleton Object created.");
//     }

//     synchronized public static Singleton getInstance(){
//         if(instance == null){
//             instance = new Singleton();
//         }

//         return instance;
//     }
// }


//Optimized Version
class Singleton{
    volatile private static Singleton instance  = null;

    private Singleton(){
        System.out.println("Singleton Object created.");
    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}

public class SingletonThreadSafe {
    public static void main(String[] args) throws InterruptedException{
        
        final Singleton[] s1 = new Singleton[1];
        final Singleton[] s2 = new Singleton[1];

        Thread t1 = new Thread(() -> {
            s1[0] = Singleton.getInstance();
        });
        
        Thread t2 = new Thread(() -> {
            s2[0] = Singleton.getInstance();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(s1[0] == s2[0]);  
    }
}

//without proper synchronization (s1[0] == s2[0]) is sometimes false
//Theads are non-deterministic in nature (anyone can go first)