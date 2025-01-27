public class Main {


    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation() ;
        Thread thread = new Thread(ws) ;
        TextUI ui = new TextUI(ws) ;
        SwingUI swing = new SwingUI(ws);
        AWTUI awt = new AWTUI(ws);

        /* positiong of the 2 UI-s so they are not in one another */
        awt.setLocation(200, 350); 
        swing.setLocation(1000, 350);

        

        thread.start() ;
    }
}
