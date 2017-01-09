package multi_threading.code_3;

class RunSync{

    public static void main(String... args){

        Shared shr = new Shared();
        CustomThread1 t1 = new CustomThread1(shr, "one");
        CustomThread2 t2 = new CustomThread2(shr, "two");
        CustomThread3 t3 = new CustomThread3(shr, "three");
    }
}