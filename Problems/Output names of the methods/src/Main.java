class CreateInstance {

    public static SuperClass create() {

        SuperClass instance = new SuperClass() {


            public void method2() {
                System.out.println("method2");
            }

            public void method3 () {
                System.out.println("method3");
            }
        };/* create an instance of an anonymous class here,
                                 do not forget ; on the end */

        return instance;
    }
}