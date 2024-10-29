class SIDemo4 {
    public static void main(String[] args) {
        SIDemoX.x = 50;
        SIDemoX.y = 25;
        SIDemoX.showY();
        
        
        SIDemoX st = new SIDemoX();
        SIDemoX.y = 500; 
        SIDemoX.showX();
        SIDemoX.showY(); 
    }
}
