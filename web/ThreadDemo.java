class ThreadDemo{
    public static void main(String[] args) {
        Thread t = new Thread(()-> System.out.println("Thread run using lamdas"));
        t.start();
    }
}