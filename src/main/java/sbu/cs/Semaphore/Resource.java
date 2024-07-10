package sbu.cs.Semaphore;
public class Resource {

    public static void accessResource(String operatorName) {
        System.out.println(operatorName + " accessed the resource at " + System.currentTimeMillis());
        // Simulate resource access time
        try {
            Thread.sleep(1000); // Simulate work with the resource
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
