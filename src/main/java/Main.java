public class Main {
    public static void main(String[] args) {
        print("OK");
        print(1000);

        System.out.println("1");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(2000);
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        System.out.println("2");
    }

    public static <T> void print(T type) {
        System.out.println(type);
    }
}
