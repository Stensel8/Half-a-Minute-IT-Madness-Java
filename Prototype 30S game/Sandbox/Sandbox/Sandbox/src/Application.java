import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1500, 768);
    }
    String[]makkelijkeWoorden = {"Hond","Kat","Koe","Kip"};
    public void run() {
        // teken bovenaan de timerbalk
        int input = 0;
        do {
            // Vraag eerst een makkelijke of moeilijke vreaag
            SaxionApp.printLine("Makkelijke of moeilijke vraag?");
            SaxionApp.printLine("1. Makkelijke vraag");
            SaxionApp.printLine("2. Moeilijke vraag");
            input = SaxionApp.readInt();
            SaxionApp.clear();


            switch (input){

                case 1 :
                    drawTimer();

            }

        }while(input != 0);
        // laat erna een de woorden zien
        // vraag of de woorden juist zijn beantwoord
    }
    public void drawTimer(){
        // Let erop dat de width overeenkomt met de width van de applicatie.....
        int width = 1500;
        for(int timer = 30; timer >= 0 ; timer--){
            //
            SaxionApp.drawRectangle(0,0,width,30);
            SaxionApp.printLine(timer);
            SaxionApp.printLine();
            for(String d : makkelijkeWoorden){

                SaxionApp.printLine(d);

            }

            SaxionApp.sleep(1);
            /*
            Zorg ervor dat het getal dat van de widht afgaat bepaald moet worden met volgende formule:
            width : 30
             */
            width = width - 50;
            SaxionApp.clear();

        }

    }

    public void drawMenu(){



    }

}






