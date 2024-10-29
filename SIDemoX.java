class SIDemoX {
    static int x = 10;
    static int y;

    public static void showX() {
        System.out.println("Value of x = " + x);
    }

    public static void showY() {
        System.out.println("Value of y = " + y);
    }
}

class SIDemo4 {
    public static void main(String[] args) {
        SIDemoX.x = 50;
        SIDemoX.y = 25;
        SIDemoX.showY();
        
        SIDemoX st = new SIDemoX(); // Note: Creating 'st' instance is optional as we're working with static fields
        SIDemoX.y = 500;
        SIDemoX.showX();
        SIDemoX.showY();
    }
}
