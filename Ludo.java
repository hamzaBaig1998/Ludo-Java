import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Ludo extends JFrame {

    public String player1="";
    public String player2="";
    public String redWinner="";
    public String greenWinner="";
    public int dice;
    public String turn="Your Turn";
    public int player=1;
    
    public int X=120;
    public boolean turnComplete=true;
    public boolean nokillR1=true;
    public boolean nokillR2=true;
    public boolean nokillR3=true;
    public boolean nokillR4=true;
    
    public boolean nokillG1=true;
    public boolean nokillG2=true;
    public boolean nokillG3=true;
    public boolean nokillG4=true;
    
    public boolean red1Safe=false;
    public boolean red2Safe=false;
    public boolean red3Safe=false;
    public boolean red4Safe=false;
    
    public boolean green1Safe=false;
    public boolean green2Safe=false;
    public boolean green3Safe=false;
    public boolean green4Safe=false;
    
    public int stopRedX=50;
    public int stopRedY=300;
    public int stopLeadRedX=300;
    public int stopLeadRedY=100;
    public int stopGreenX=400;
    public int stopGreenY=50;
    public int stopLeadGreenX=600;
    public int stopLeadGreenY=300;
    public int stopYellowX=650;
    public int stopYellowY=400;
    public int stopLeadYellowX=400;
    public int stopLeadYellowY=600;
    public int stopBlueX=300;
    public int stopBlueY=650;
    public int stopLeadBlueX=100;
    public int stopLeadBlueY=400;
    
    
    
    public int red1X=80;
    public int red1Y=85;
   
    public int red2X=170;
    public int red2Y=80;
    
    public int red3X=85;
    public int red3Y=170;
    
    public int red4X=170;
    public int red4Y=170;
    
    
    
    public int red1XHome=80;
    public int red1YHome=85;
    
    public int red2XHome=170;
    public int red2YHome=80;
    
    public int red3XHome=85;
    public int red3YHome=170;
    
    public int red4XHome=170;
    public int red4YHome=170;
    
    
    public int green1X=535;
    public int green1Y=80;
    
    public int green2X=615;
    public int green2Y=80;
    
    public int green3X=535;
    public int green3Y=170;
    
    public int green4X=615;
    public int green4Y=170;
    
    
    
    public int green1XHome=535;
    public int green1YHome=80;
    
    public int green2XHome=615;
    public int green2YHome=80;
    
    public int green3XHome=535;
    public int green3YHome=170;
    
    public int green4XHome=615;
    public int green4YHome=170;
    
    //WinState
    public boolean red1Win=false;
    public boolean red2Win=false;
    public boolean red3Win=false;
    public boolean red4Win=false;
    
    public boolean green1Win=false;
    public boolean green2Win=false;
    public boolean green3Win=false;
    public boolean green4Win=false;
    
    //StatusOfToken
    public boolean red1Playable=false;
    public boolean red2Playable=false;
    public boolean red3Playable=false;
    public boolean red4Playable=false;
    
    public boolean green1Playable=false;
    public boolean green2Playable=false;
    public boolean green3Playable=false;
    public boolean green4Playable=false;
    
    public boolean yellow1Playable=false;
    public boolean yellow2Playable=false;
    public boolean yellow3Playable=false;
    public boolean yellow4Playable=false;
    
    public boolean blue1Playable=false;
    public boolean blue2Playable=false;
    public boolean blue3Playable=false;
    public boolean blue4Playable=false;
    
    //currentIndexOfToken
    public int red1CurrentIndex=0;
    public int red2CurrentIndex=0;
    public int red3CurrentIndex=0;
    public int red4CurrentIndex=0;
    
    public int yellow1CurrentIndex=0;
    public int yellow2CurrentIndex=0;
    public int yellow3CurrentIndex=0;
    public int yellow4CurrentIndex=0;
    
    public int green1CurrentIndex=0;
    public int green2CurrentIndex=0;
    public int green3CurrentIndex=0;
    public int green4CurrentIndex=0;
    
    public int blue1CurrentIndex=0;
    public int blue2CurrentIndex=0;
    public int blue3CurrentIndex=0;
    public int blue4CurrentIndex=0;
    
    //RedPath
    class Index
    {
        int x;
        int y;
        int index;
    }
    Index redPath[]=new Index[57];
    Index greenPath[]=new Index[57];
   void settingBoardPath()
   {
    for(int i=0;i<57;i++)
    {
        redPath[i]=new Index();
        greenPath[i]=new Index();
    }
    
    redPath[0].x=50;
    redPath[0].y=300;
    redPath[0].index=0;
    
    redPath[1].x=100;
    redPath[1].y=300;
    redPath[1].index=0;
    
    redPath[2].x=150;
    redPath[2].y=300;
    redPath[2].index=0;
    
    redPath[3].x=200;
    redPath[3].y=300;
    redPath[3].index=0;
    
    redPath[4].x=250;
    redPath[4].y=300;
    redPath[4].index=0;
    
    redPath[5].x=300;
    redPath[5].y=250;
    redPath[5].index=0;
    
    redPath[6].x=300;
    redPath[6].y=200;
    redPath[6].index=0;
   
    redPath[7].x=300;
    redPath[7].y=150;
    redPath[7].index=0;
    
    redPath[8].x=300;
    redPath[8].y=100;
    redPath[8].index=0;
    
    redPath[9].x=300;
    redPath[9].y=50;
    redPath[9].index=0;
    
    redPath[10].x=300;
    redPath[10].y=0;
    redPath[10].index=0;
    
    redPath[11].x=350;
    redPath[11].y=0;
    redPath[11].index=0;
    
    redPath[12].x=400;
    redPath[12].y=0;
    redPath[12].index=0;
    
    redPath[13].x=400;
    redPath[13].y=50;
    redPath[13].index=0;
    
    redPath[14].x=400;
    redPath[14].y=100;
    redPath[14].index=0;
    
    redPath[15].x=400;
    redPath[15].y=150;
    redPath[15].index=0;
    
    redPath[16].x=400;
    redPath[16].y=200;
    redPath[16].index=0;
    
    redPath[17].x=400;
    redPath[17].y=250;
    redPath[17].index=0;
    
    redPath[18].x=450;
    redPath[18].y=300;
    redPath[18].index=0;
    
    redPath[19].x=500;
    redPath[19].y=300;
    redPath[19].index=0;
    
    redPath[20].x=550;
    redPath[20].y=300;
    redPath[20].index=0;
    
    redPath[21].x=600;
    redPath[21].y=300;
    redPath[21].index=0;
    
    redPath[22].x=650;
    redPath[22].y=300;
    redPath[22].index=0;
    
    redPath[23].x=700;
    redPath[23].y=300;
    redPath[23].index=0;
    
    redPath[24].x=700;
    redPath[24].y=350;
    redPath[24].index=0;
    
    redPath[25].x=700;
    redPath[25].y=400;
    redPath[25].index=0;
    
    redPath[26].x=650;
    redPath[26].y=400;
    redPath[26].index=0;
    
    redPath[27].x=600;
    redPath[27].y=400;
    redPath[27].index=0;
    
    redPath[28].x=550;
    redPath[28].y=400;
    redPath[28].index=0;
    
    redPath[29].x=500;
    redPath[29].y=400;
    redPath[29].index=0;
    
    redPath[30].x=450;
    redPath[30].y=400;
    redPath[30].index=0;
    
    redPath[31].x=400;
    redPath[31].y=450;
    redPath[31].index=0;
    
    redPath[32].x=400;
    redPath[32].y=500;
    redPath[32].index=0;
    
    redPath[33].x=400;
    redPath[33].y=550;
    redPath[33].index=0;
    
    redPath[34].x=400;
    redPath[34].y=600;
    redPath[34].index=0;
    
    redPath[35].x=400;
    redPath[35].y=650;
    redPath[35].index=0;
    
    redPath[36].x=400;
    redPath[36].y=700;
    redPath[36].index=0;
    
    redPath[37].x=350;
    redPath[37].y=700;
    redPath[37].index=0;
    
    redPath[38].x=300;
    redPath[38].y=700;
    redPath[38].index=0;
    
    redPath[39].x=300;
    redPath[39].y=650;
    redPath[39].index=0;        
    
    redPath[40].x=300;
    redPath[40].y=600;
    redPath[40].index=0;
    
    redPath[41].x=300;
    redPath[41].y=550;
    redPath[41].index=0;
    
    redPath[42].x=300;
    redPath[42].y=500;
    redPath[42].index=0;
    
    redPath[43].x=300;
    redPath[43].y=450;
    redPath[43].index=0;
    
    redPath[44].x=250;
    redPath[44].y=400;
    redPath[44].index=0;
    
    redPath[45].x=200;
    redPath[45].y=400;
    redPath[45].index=0;
    
    redPath[46].x=150;
    redPath[46].y=400;
    redPath[46].index=0;
    
    redPath[47].x=100;
    redPath[47].y=400;
    redPath[47].index=0;
    
    redPath[48].x=50;
    redPath[48].y=400;
    redPath[48].index=0;
    
    redPath[49].x=0;
    redPath[49].y=400;
    redPath[49].index=0;
    
    redPath[50].x=0;
    redPath[50].y=350;
    redPath[50].index=0;
    
    redPath[51].x=50;
    redPath[51].y=350;
    redPath[51].index=0;
    
    redPath[52].x=100;
    redPath[52].y=350;
    redPath[52].index=0;
    
    redPath[53].x=150;
    redPath[53].y=350;
    redPath[53].index=0;
    
    redPath[54].x=200;
    redPath[54].y=350;
    redPath[54].index=0;
    
    redPath[55].x=250;
    redPath[55].y=350;
    redPath[55].index=0;
    
    redPath[56].x=300;
    redPath[56].y=350;
    redPath[56].index=0;
    
    //greenPath
    greenPath[0].x=400;
    greenPath[0].y=50;
    greenPath[0].index=0;
    
    greenPath[1].x=400;
    greenPath[1].y=100;
    greenPath[1].index=0;
    
    greenPath[2].x=400;
    greenPath[2].y=150;
    greenPath[2].index=0;
    
    greenPath[3].x=400;
    greenPath[3].y=200;
    greenPath[3].index=0;
    
    greenPath[4].x=400;
    greenPath[4].y=250;
    greenPath[4].index=0;
    
    greenPath[5].x=450;
    greenPath[5].y=300;
    greenPath[5].index=0;
    
    greenPath[6].x=500;
    greenPath[6].y=300;
    greenPath[6].index=0;
   
    greenPath[7].x=550;
    greenPath[7].y=300;
    greenPath[7].index=0;
    
    greenPath[8].x=600;
    greenPath[8].y=300;
    greenPath[8].index=0;
    
    greenPath[9].x=650;
    greenPath[9].y=300;
    greenPath[9].index=0;
    
    greenPath[10].x=700;
    greenPath[10].y=300;
    greenPath[10].index=0;
    
    greenPath[11].x=700;
    greenPath[11].y=350;
    greenPath[11].index=0;
    
    greenPath[12].x=700;
    greenPath[12].y=400;
    greenPath[12].index=0;
    
    greenPath[13].x=650;
    greenPath[13].y=400;
    greenPath[13].index=0;
    
    greenPath[14].x=600;
    greenPath[14].y=400;
    greenPath[14].index=0;
    
    greenPath[15].x=550;
    greenPath[15].y=400;
    greenPath[15].index=0;
    
    greenPath[16].x=500;
    greenPath[16].y=400;
    greenPath[16].index=0;
    
    greenPath[17].x=450;
    greenPath[17].y=400;
    greenPath[17].index=0;
    
    greenPath[18].x=400;
    greenPath[18].y=450;
    greenPath[18].index=0;
    
    greenPath[19].x=400;
    greenPath[19].y=500;
    greenPath[19].index=0;
    
    greenPath[20].x=400;
    greenPath[20].y=550;
    greenPath[20].index=0;
    
    greenPath[21].x=400;
    greenPath[21].y=600;
    greenPath[21].index=0;
    
    greenPath[22].x=400;
    greenPath[22].y=650;
    greenPath[22].index=0;
    
    greenPath[23].x=400;
    greenPath[23].y=700;
    greenPath[23].index=0;
    
    greenPath[24].x=350;
    greenPath[24].y=700;
    greenPath[24].index=0;
    
    greenPath[25].x=300;
    greenPath[25].y=700;
    greenPath[25].index=0;
    
    greenPath[26].x=300;
    greenPath[26].y=650;
    greenPath[26].index=0;
    
    greenPath[27].x=300;
    greenPath[27].y=600;
    greenPath[27].index=0;
    
    greenPath[28].x=300;
    greenPath[28].y=550;
    greenPath[28].index=0;
    
    greenPath[29].x=300;
    greenPath[29].y=500;
    greenPath[29].index=0;
    
    greenPath[30].x=300;
    greenPath[30].y=450;
    greenPath[30].index=0;
    
    greenPath[31].x=250;
    greenPath[31].y=400;
    greenPath[31].index=0;
    
    greenPath[32].x=200;
    greenPath[32].y=400;
    greenPath[32].index=0;
    
    greenPath[33].x=150;
    greenPath[33].y=400;
    greenPath[33].index=0;
    
    greenPath[34].x=100;
    greenPath[34].y=400;
    greenPath[34].index=0;
    
    greenPath[35].x=50;
    greenPath[35].y=400;
    greenPath[35].index=0;
    
    greenPath[36].x=0;
    greenPath[36].y=400;
    greenPath[36].index=0;
    
    greenPath[37].x=0;
    greenPath[37].y=350;
    greenPath[37].index=0;
    
    greenPath[38].x=0;
    greenPath[38].y=300;
    greenPath[38].index=0;
    
    greenPath[39].x=50;
    greenPath[39].y=300;
    greenPath[39].index=0;        
    
    greenPath[40].x=100;
    greenPath[40].y=300;
    greenPath[40].index=0;
    
    greenPath[41].x=150;
    greenPath[41].y=300;
    greenPath[41].index=0;
    
    greenPath[42].x=200;
    greenPath[42].y=300;
    greenPath[42].index=0;
    
    greenPath[43].x=250;
    greenPath[43].y=300;
    greenPath[43].index=0;
    
    greenPath[44].x=300;
    greenPath[44].y=250;
    greenPath[44].index=0;
    
    greenPath[45].x=300;
    greenPath[45].y=200;
    greenPath[45].index=0;
    
    greenPath[46].x=300;
    greenPath[46].y=150;
    greenPath[46].index=0;
    
    greenPath[47].x=300;
    greenPath[47].y=100;
    greenPath[47].index=0;
    
    greenPath[48].x=300;
    greenPath[48].y=50;
    greenPath[48].index=0;
    
    greenPath[49].x=300;
    greenPath[49].y=0;
    greenPath[49].index=0;
    
    greenPath[50].x=350;
    greenPath[50].y=0;
    greenPath[50].index=0;
    
    greenPath[51].x=350;
    greenPath[51].y=50;
    greenPath[51].index=0;
    
    greenPath[52].x=350;
    greenPath[52].y=100;
    greenPath[52].index=0;
    
    greenPath[53].x=350;
    greenPath[53].y=150;
    greenPath[53].index=0;
    
    greenPath[54].x=350;
    greenPath[54].y=200;
    greenPath[54].index=0;
    
    greenPath[55].x=350;
    greenPath[55].y=250;
    greenPath[55].index=0;
    
    greenPath[56].x=350;
    greenPath[56].y=300;
    greenPath[56].index=0;
    
   }
public void getPlayerNames(String name1,String name2){
            player1=name1;
            player2=name2;
        }
    Ludo(){
        setTitle("Ludo");
        setSize(770,799);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBackground(Color.white);
        add(new Board());
        settingBoardPath();
        setVisible(true);
    }
   
    class Board extends JPanel implements MouseListener
    {
        
        Board(){
            
        }
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillRect(0, 0, 300, 300);
            g.setColor(Color.black);
            g.drawRect(0,0,300,300);
            g.setColor(Color.white);
            g.fillOval(50, 50, 200, 200);
            g.setColor(Color.black);
            g.drawOval(50, 50, 200, 200);
            g.setColor(Color.green);
            g.fillRect(450, 0,300, 300);
            g.setColor(Color.black);
            g.drawRect(450,0,300,300);
            g.setColor(Color.white);
            g.fillOval(500, 50, 200, 200);
            g.setColor(Color.black);
            g.drawOval(500, 50, 200, 200);
            g.setColor(Color.blue);
            g.fillRect(0, 450, 300, 300);
            g.setColor(Color.black);
            g.drawRect(0,450,300,300);
            g.setColor(Color.white);
            g.fillOval(50, 500, 200, 200);
            g.setColor(Color.black);
            g.drawOval(50, 500, 200, 200);
            g.setColor(Color.yellow);
            g.fillRect(450, 450, 300, 300);
            g.setColor(Color.black);
            g.drawRect(450,450,300,300);
            g.setColor(Color.white);
            g.fillOval(500, 500, 200, 200);
            g.setColor(Color.black);
            g.drawOval(500, 500, 200, 200);
            g.setColor(Color.black);
            
            //Red x=120
            //Green x=560
            g.drawString(turn, X, 20);
            g.drawString(player1, 30, 20);
            g.drawString(player2, 480, 20);
            //centerZone
            g.fillRect(300, 300, 150, 150);
            g.setColor(Color.gray);
            g.draw3DRect(350, 350, 50, 50, rootPaneCheckingEnabled);
            g.setColor(Color.black);
            g.setColor(Color.white);
            g.drawString(""+dice, 370, 380);
            g.setColor(Color.black);
            //centerZoneEnd
            
            //greenZoneStart
            g.drawRect(300, 0, 50, 50);
            g.drawRect(300, 50, 50, 50);
            g.fillRect(300, 100, 50, 50);  //Stop
            g.setColor(Color.white);
            g.fillOval(305, 105, 40, 40);
            g.setColor(Color.black);
            g.drawRect(300, 150, 50, 50);
            g.drawRect(300, 200, 50, 50);
            g.drawRect(300, 250, 50, 50);
            
            //greenZoneHome
            g.drawRect(350, 0, 50, 50);
            g.setColor(Color.green);
            g.fillRect(350, 50, 50, 50);
            g.fillRect(350, 100, 50, 50);
            g.fillRect(350, 150, 50, 50);
            g.fillRect(350, 200, 50, 50);
            g.fillRect(350, 250, 50, 50);
            //Border
            g.setColor(Color.black);
            g.drawRect(350, 50, 50, 50);
            g.drawRect(350, 100, 50, 50);
            g.drawRect(350, 150, 50, 50);
            g.drawRect(350, 200, 50, 50);
            g.drawRect(350, 250, 50, 50);
            //InnerCircle
            g.setColor(Color.white);
            g.fillOval(355, 55, 40, 40);
            g.fillOval(355, 105, 40, 40);
            g.fillOval(355, 155, 40, 40);
            g.fillOval(355, 205, 40, 40);
            g.fillOval(355, 255, 40, 40);
            
            g.setColor(Color.black);
            g.drawRect(400, 0, 50, 50);
            g.setColor(Color.green);
            g.fillRect(400, 50, 50, 50);   //StopGreenHome
            g.setColor(Color.black);
            g.drawRect(400, 50, 50, 50);   //borderOfStopGreen
            g.drawRect(400, 100, 50, 50);
            g.drawRect(400, 150, 50, 50);
            g.drawRect(400, 200, 50, 50);
            g.drawRect(400, 250, 50, 50);
            //greenZoneEnd
            
            //redZoneStart
            g.drawRect(0, 300, 50, 50);
            g.setColor(Color.red);
            g.fillRect(50, 300, 50, 50);  //StopRedHome
            g.setColor(Color.black);
            g.drawRect(50, 300, 50, 50);  //borderOfStopRed
            g.drawRect(100, 300, 50, 50);
            g.drawRect(150, 300, 50, 50);
            g.drawRect(200, 300, 50, 50);
            g.drawRect(250, 300, 50, 50);
            
            g.drawRect(0, 350, 50, 50);
            g.setColor(Color.red);
            g.fillRect(50, 350, 50, 50);
            g.fillRect(100, 350, 50, 50);
            g.fillRect(150, 350, 50, 50);
            g.fillRect(200, 350, 50, 50);
            g.fillRect(250, 350, 50, 50);
            //border
            g.setColor(Color.black);
            g.drawRect(50, 350, 50, 50);
            g.drawRect(100, 350, 50, 50);
            g.drawRect(150, 350, 50, 50);
            g.drawRect(200, 350, 50, 50);
            g.drawRect(250, 350, 50, 50);
            
            //InnerCircle
            g.setColor(Color.white);
            g.fillOval(55, 355, 40, 40);
            g.fillOval(105, 355, 40, 40);
            g.fillOval(155, 355, 40, 40);
            g.fillOval(205, 355, 40, 40);
            g.fillOval(255, 355, 40, 40);
            g.setColor(Color.BLACK);
            
            g.drawRect(0, 400, 50, 50);
            g.drawRect(50, 400, 50, 50);
            g.fillRect(100, 400, 50, 50);  //Stop
            g.setColor(Color.white);
            g.fillOval(105, 405, 40, 40);
            g.setColor(Color.black);
            g.drawRect(150, 400, 50, 50);
            g.drawRect(200, 400, 50, 50);
            g.drawRect(250, 400, 50, 50);
          
            //redZoneEnd
            
            //yellowZoneStart
            g.drawRect(450, 300, 50, 50);
            g.drawRect(500, 300, 50, 50);
            g.drawRect(550, 300, 50, 50);
            g.fillRect(600, 300, 50, 50);      //YellowHome
            g.setColor(Color.white);
            g.fillOval(605, 305, 40, 40);
            g.setColor(Color.black);
            g.drawRect(650, 300, 50, 50);
            g.drawRect(700, 300, 50, 50);
            
            g.setColor(Color.yellow);
            g.fillRect(450, 350, 50, 50);
            g.fillRect(500, 350, 50, 50);
            g.fillRect(550, 350, 50, 50);
            g.fillRect(600, 350, 50, 50);
            g.fillRect(650, 350, 50, 50);
            g.setColor(Color.black);
            g.drawRect(700, 350, 50, 50);
            //border
            g.drawRect(450, 350, 50, 50);
            g.drawRect(500, 350, 50, 50);
            g.drawRect(550, 350, 50, 50);
            g.drawRect(600, 350, 50, 50);
            g.drawRect(650, 350, 50, 50);
            //InnerCircle
            g.setColor(Color.white);
            g.fillOval(455,355,40,40);
            g.fillOval(505,355,40,40);
            g.fillOval(555,355,40,40);
            g.fillOval(605,355,40,40);
            g.fillOval(655,355,40,40);
            g.setColor(Color.black);
            
//            g.fillRect(450, 400, 50, 50);
            g.drawRect(450, 400, 50, 50);
            g.drawRect(500, 400, 50, 50);
            g.drawRect(550, 400, 50, 50);
            g.drawRect(600, 400, 50, 50);
            g.setColor(Color.yellow);
            g.fillRect(650, 400, 50, 50);  //Stop
            g.setColor(Color.black);
            g.drawRect(650, 400, 50, 50);
            g.drawRect(700, 400, 50, 50);
            //yellowZoneEnd
            
            //blueZoneStart
            g.drawRect(300, 450, 50, 50);
            g.drawRect(300, 500, 50, 50);
            g.drawRect(300, 550, 50, 50);
            g.drawRect(300, 600, 50, 50);
            g.setColor(Color.blue);
            g.fillRect(300, 650, 50, 50); //BlueStop
            g.setColor(Color.black);
            g.drawRect(300, 650, 50, 50);
            g.drawRect(300, 700, 50, 50);
            //blueHome
            g.setColor(Color.blue);
            g.fillRect(350, 450, 50, 50);
            g.fillRect(350, 500, 50, 50);
            g.fillRect(350, 550, 50, 50);
            g.fillRect(350, 600, 50, 50);
            g.fillRect(350, 650, 50, 50);
            g.setColor(Color.BLACK);
            //border
            g.drawRect(350, 450, 50, 50);
            g.drawRect(350, 500, 50, 50);
            g.drawRect(350, 550, 50, 50);
            g.drawRect(350, 600, 50, 50);
            g.drawRect(350, 650, 50, 50);
            g.drawRect(350, 700, 50, 50);
            //InnerCircle
            g.setColor(Color.white);
            g.fillOval(355, 455, 40, 40);
            g.fillOval(355, 505, 40, 40);
            g.fillOval(355, 555, 40, 40);
            g.fillOval(355, 605, 40, 40);
            g.fillOval(355, 655, 40, 40);
            g.setColor(Color.BLACK);
            
            g.drawRect(400, 450, 50, 50);
            g.drawRect(400, 500, 50, 50);
            g.drawRect(400, 550, 50, 50);
            g.fillRect(400, 600, 50, 50); //Stop
            g.setColor(Color.white);
            g.fillOval(405, 605, 40, 40);
            g.setColor(Color.black);
            g.drawRect(400, 650, 50, 50);
            g.drawRect(400, 700, 50, 50);
           
            //blueZoneEnd
            
            //Tokens
            //Red
            
            g.setColor(Color.red);
            g.fillOval(red1X,red1Y,40,40);
            g.fillOval(red2X,red2Y,40,40);
            g.fillOval(red3X,red3Y,40,40);
            g.fillOval(red4X,red4Y,40,40);
            g.setColor(Color.black);
            g.drawOval(red1X,red1Y,40,40);
            g.drawOval(red2X,red2Y,40,40);
            g.drawOval(red3X,red3Y,40,40);
            g.drawOval(red4X,red4Y,40,40);
            
            
            //Green
            g.setColor(Color.green);
            g.fillOval(green1X,green1Y,40,40);
            g.fillOval(green2X,green2Y,40,40);
            g.fillOval(green3X,green3Y,40,40);
            g.fillOval(green4X,green4Y,40,40);
            g.setColor(Color.black);
            g.drawOval(green1X,green1Y,40,40);
            g.drawOval(green2X,green2Y,40,40);
            g.drawOval(green3X,green3Y,40,40);
            g.drawOval(green4X,green4Y,40,40);
            
            //Blue
            g.setColor(Color.blue);
            g.fillOval(85,535,40,40);
            g.fillOval(170,535,40,40);
            g.fillOval(85,615,40,40);
            g.fillOval(170,615,40,40);
            g.setColor(Color.black);
            g.drawOval(85,535,40,40);
            g.drawOval(170,535,40,40);
            g.drawOval(85,615,40,40);
            g.drawOval(170,615,40,40);
            
            //Yellow
            g.setColor(Color.yellow);
            g.fillOval(535,535,40,40);
            g.fillOval(615,535,40,40);
            g.fillOval(535,615,40,40);
            g.fillOval(615,615,40,40);
            g.setColor(Color.black);
            g.drawOval(535,535,40,40);
            g.drawOval(615,535,40,40);
            g.drawOval(535,615,40,40);
            g.drawOval(615,615,40,40);
            g.drawString(redWinner,150,150);
            g.drawString(greenWinner,550,150);
            this.addMouseListener(this);
        }
        /*Mouse Listener*/
        public void mouseClicked(MouseEvent e)
        {
          
            if(e.getX()>=350 && e.getX()<=400 && e.getY()>=350 && e.getY()<=400)
            {
                if(turnComplete==true)
                {
                
                diceRoll();
//                if(dice!=6){
//                    changePlayer();
//                }
//                if(player==1){
//                if(dice!=6 &&(red1Playable==false && red2Playable==false && red3Playable==false && red4Playable==false))
//                {
//                    player=2;
//                }
//                }
//                else if(player==2){
//                if(dice!=6 &&(green1Playable==false && green2Playable==false && green3Playable==false && green4Playable==false))
//                {
//                    player=1;
//                }
//                }
//                
                displayTurn();
                if(red1Win==true && red2Win==true && red3Win==true && red4Win==true)
                {
                    redWinner="Winnner";
                }
                else if(green1Win==true && green2Win==true && green3Win==true && green4Win==true)
                {
                    greenWinner="Winnner";
                }
                //turnComplete=false;
                repaint();
                }
            }
            switch(player)
            {case 1:
                {
                    if((e.getX()>=red1X && e.getX()<=(red1X+50) && e.getY()>=red1Y && e.getY()<=(red1Y+50)) && red1Win==false)
                    {
                        if(dice==6 && red1Playable==false)
                        {
                            red1X=redPath[0].x;
                            red1Y=redPath[0].y;
                            red1Safe=true;
                            red1Playable=true;
                            turnComplete=true;
                            repaint();
                        }
                        else if(red1Playable==true)
                        {   
                            if(dice!=6)
                            {
                                player=2;
                            }
                            red1CurrentIndex=red1CurrentIndex+dice;
                            if(red1CurrentIndex>56){
                                red1CurrentIndex=red1CurrentIndex-dice;
                                return;
                            }
                            else{
                            red1X=redPath[red1CurrentIndex].x;
                            red1Y=redPath[red1CurrentIndex].y;
                            safeCheck(red1CurrentIndex,red1Safe);
                            if(red1X==green1X && red1Y==green1Y || red1X==green2X && red1Y==green2Y || red1X==green3X && red1Y==green3Y || red1X==green4X && red1Y==green4Y)
                            {
                             
                                if(red1CurrentIndex!=0 && green1CurrentIndex!=39 && red1CurrentIndex!=8 && green1CurrentIndex!=47 && red1CurrentIndex!=13 && green1CurrentIndex!=0 && red1CurrentIndex!=21 && green1CurrentIndex!=8 && red1CurrentIndex!=26 && green1CurrentIndex!=13 && red1CurrentIndex!=34 && green1CurrentIndex!=21  && red1CurrentIndex!=39 && green1CurrentIndex!=26 && red1CurrentIndex!=47 && green1CurrentIndex!=34)
                                {
                                    if(red1X==green1X && red1Y==green1Y){
                                    green1X=green1XHome;
                                    green1Y=green1YHome;
                                    green1CurrentIndex=0;
                                    green1Playable=false;
                                    repaint();
                                }
                            }
                                else if((red1X==green2X && red1Y==green2Y) && (green2CurrentIndex!= 0 && green2CurrentIndex!= 8 && green2CurrentIndex!= 13 && green2CurrentIndex!= 21 && green2CurrentIndex!= 26 && green2CurrentIndex!= 34 && green2CurrentIndex!= 39 && green2CurrentIndex!= 47)){
                                    green2X=green2XHome;
                                    green2Y=green2YHome;
                                    green2CurrentIndex=0;
                                    green2Playable=false;
                                    repaint();
                                }
                                else if((red1X==green3X && red1Y==green3Y) && (green3CurrentIndex!= 0 && green3CurrentIndex!= 8 && green3CurrentIndex!= 13 && green3CurrentIndex!= 21 && green3CurrentIndex!= 26 && green3CurrentIndex!= 34 && green3CurrentIndex!= 39 && green3CurrentIndex!= 47)){
                                    green3X=green3XHome;
                                    green3Y=green3YHome;
                                    green3CurrentIndex=0;
                                    green3Playable=false;
                                    repaint();
                                }
                                else if((red1X==green4X && red1Y==green4Y) && (green4CurrentIndex!= 0 && green4CurrentIndex!= 8 && green4CurrentIndex!= 13 && green4CurrentIndex!= 21 && green4CurrentIndex!= 26 && green4CurrentIndex!= 34 && green4CurrentIndex!= 39 && green4CurrentIndex!= 47)){
                                    green4X=green4XHome;
                                    green4Y=green4YHome;
                                    green4CurrentIndex=0;
                                    green4Playable=false;
                                    repaint();
                                }
                            }
                            
                            if(red1CurrentIndex==56)
                            {
                                red1Win=true;
                            }
                            repaint();
                            }
                            turnComplete=true;
                            player=2;
                        }
                            
                    }
                    else if((e.getX()>=red2X && e.getX()<=(red2X+50) && e.getY()>=red2Y && e.getY()<=(red2Y+50)) && red2Win==false)
                    {
                        if(dice==6 && red2Playable==false)
                        {
                            red2X=redPath[0].x;
                            red2Y=redPath[0].y;
                            red2Safe=true;
                            red2Playable=true;
                            turnComplete=true;
                            repaint();
                        }
                        else if(red2Playable==true)
                        {   
                            
                            red2CurrentIndex=red2CurrentIndex+dice;
                            if(red2CurrentIndex>56){
                                red2CurrentIndex=red2CurrentIndex-dice;
                                return;
                            }
                            else{
                                if(dice!=6)
                                {
                                    player=2;
                                }
                            red2X=redPath[red2CurrentIndex].x;
                            red2Y=redPath[red2CurrentIndex].y;
                            safeCheck(red2CurrentIndex,red2Safe);
                            if(red2X==green1X && red2Y==green1Y || red2X==green2X && red2Y==green2Y || red2X==green3X && red2Y==green3Y || red2X==green4X && red2Y==green4Y)
                            {
                                if((red2X==green1X && red2Y==green1Y) && green1Safe==false){
                                    green1X=green1XHome;
                                    green1Y=green1YHome;
                                    green1CurrentIndex=0;
                                    green1Playable=false;
                                    repaint();
                                }
                                else if((red2X==green2X && red2Y==green2Y)&& green2Safe==false){
                                    green2X=green2XHome;
                                    green2Y=green2YHome;
                                    green2CurrentIndex=0;
                                    green2Playable=false;
                                    repaint();
                                }
                                else if((red2X==green3X && red2Y==green3Y)&& green3Safe==false){
                                    green3X=green3XHome;
                                    green3Y=green3YHome;
                                    green3CurrentIndex=0;
                                    green3Playable=false;
                                    repaint();
                                }
                                else if((red2X==green4X && red2Y==green4Y)&& green4Safe==false){
                                    green4X=green4XHome;
                                    green4Y=green4YHome;
                                    green4CurrentIndex=0;
                                    green4Playable=false;
                                    repaint();
                                }
                            
                            }
                            if(red2CurrentIndex==56)
                            {
                                red2Win=true;
                            }
                            repaint();
                            }
                            turnComplete=true;
                            player=2;
                        }
                    }
                    else if((e.getX()>=red3X && e.getX()<=(red3X+50) && e.getY()>=red3Y && e.getY()<=(red3Y+50)) && red3Win==false)
                    {
                        if(dice==6 && red3Playable==false)
                        {
                            red3X=redPath[0].x;
                            red3Y=redPath[0].y;
                            red3Safe=true;
                            red3Playable=true;
                            turnComplete=true;
                            repaint();
                        }
                        else if(red3Playable==true)
                        {   
                            if(dice!=6)
                            {
                                player=2;
                            }
                            red3CurrentIndex=red3CurrentIndex+dice;
                            if(red3CurrentIndex>56){
                                red3CurrentIndex=red3CurrentIndex-dice;
                                return;
                            }
                            else{
                                
                            red3X=redPath[red3CurrentIndex].x;
                            red3Y=redPath[red3CurrentIndex].y;
                            safeCheck(red3CurrentIndex,red3Safe);
                            if(red3X==green1X && red3Y==green1Y || red3X==green2X && red3Y==green2Y || red3X==green3X && red3Y==green3Y || red3X==green4X && red3Y==green4Y )
                            {
                                if((red3X==green1X && red3Y==green1Y)&& green1Safe==false){
                                    green1X=green1XHome;
                                    green1Y=green1YHome;
                                    green1CurrentIndex=0;
                                    green1Playable=false;
                                    repaint();
                                }
                                else if((red3X==green2X && red3Y==green2Y)&& green2Safe==false){
                                    green2X=green2XHome;
                                    green2Y=green2YHome;
                                    green2CurrentIndex=0;
                                    green2Playable=false;
                                    repaint();
                                }
                                else if((red3X==green3X && red3Y==green3Y)&& green3Safe==false){
                                    green3X=green3XHome;
                                    green3Y=green3YHome;
                                    green3CurrentIndex=0;
                                    green3Playable=false;
                                    repaint();
                                }
                                else if((red3X==green4X && red3Y==green4Y)&& green4Safe==false){
                                    green4X=green4XHome;
                                    green4Y=green4YHome;
                                    green4CurrentIndex=0;
                                    green4Playable=false;
                                    repaint();
                                }
                            
                            }
                            if(red3CurrentIndex==56)
                            {
                                red3Win=true;
                            }
                            repaint();
                            }
                            turnComplete=true;
                            player=2;
                        }
                    }
                    else if((e.getX()>=red4X && e.getX()<=(red4X+50) && e.getY()>=red4Y && e.getY()<=(red4Y+50)) && red4Win==false)
                    {
                        if(dice==6 && red4Playable==false)
                        {
                            red4X=redPath[0].x;
                            red4Y=redPath[0].y;
                            red4Safe=true;
                            red4Playable=true;
                            turnComplete=true;
                            repaint();
                        }
                        else if(red4Playable==true)
                        {   
                            if(dice!=6){
                                player=2;
                            }
                            red4CurrentIndex=red4CurrentIndex+dice;
                            if(red4CurrentIndex>56){
                                red4CurrentIndex=red4CurrentIndex-dice;
                                return;
                            }
                            else{
                            red4X=redPath[red4CurrentIndex].x;
                            red4Y=redPath[red4CurrentIndex].y;
                           safeCheck(red4CurrentIndex,red4Safe);
                            
                            if(red4X==green1X && red4Y==green1Y || red4X==green2X && red4Y==green2Y || red4X==green3X && red4Y==green3Y || red4X==green4X && red4Y==green4Y )
                            {
                                if((red4X==green1X && red4Y==green1Y)&& green1Safe==false){
                                    green1X=green1XHome;
                                    green1Y=green1YHome;
                                    green1CurrentIndex=0;
                                    green1Playable=false;
                                    repaint();
                                }
                                else if((red4X==green2X && red4Y==green2Y)&& green2Safe==false){
                                    green2X=green2XHome;
                                    green2Y=green2YHome;
                                    green2CurrentIndex=0;
                                    green2Playable=false;
                                    repaint();
                                }
                                else if((red4X==green3X && red4Y==green3Y)&& green3Safe==false){
                                    green3X=green3XHome;
                                    green3Y=green3YHome;
                                    green3CurrentIndex=0;
                                    green3Playable=false;
                                    repaint();
                                }
                                else if((red4X==green4X && red4Y==green4Y)&& green4Safe==false){
                                    green4X=green4XHome;
                                    green4Y=green4YHome;
                                    green4CurrentIndex=0;
                                    green4Playable=false;
                                    repaint();
                                }
                            
                            }
                            if(red4CurrentIndex==56)
                            {
                                red1Win=true;
                            }
                            repaint();
                            }
                            turnComplete=true;
                            player=2;
                        }
                    }
                }break;
                case 2:
                {
                    if((e.getX()>=green1X && e.getX()<=(green1X+50) && e.getY()>=green1Y && e.getY()<=(green1Y+50)) && green1Win==false)
                    {
                         if(dice==6 && green1Playable==false)
                        {
                            green1X=greenPath[0].x;
                            green1Y=greenPath[0].y;
                            green1Safe=true;
                            green1Playable=true;
                            turnComplete=true;
                            repaint();
                        }
                        else if(green1Playable==true)
                        {   
                            if(dice!=6)
                            {  player=1;
                            }
                              
                            green1CurrentIndex=green1CurrentIndex+dice;
                            if(green1CurrentIndex>56){
                                green1CurrentIndex=green1CurrentIndex-dice;
                                return;
                            }
                            else{
                            green1X=greenPath[green1CurrentIndex].x;
                            green1Y=greenPath[green1CurrentIndex].y;
                            safeCheck(green1CurrentIndex,green1Safe);
                            
                            if(green1X==red1X && green1Y==red1Y || green1X==red2X && green1Y==red2Y || green1X==red3X && green1Y==red3Y || green1X==red4X && green1Y==red4Y )
                            {
                                if((green1X==red1X && green1Y==red1Y)&& red1Safe==false){
                                    red1X=red1XHome;
                                    red1Y=red1YHome;
                                    red1CurrentIndex=0;
                                    red1Playable=false;
                                    repaint();
                                }
                                else if((green1X==red2X && green1Y==red2Y)&& red2Safe==false){
                                    red2X=red2XHome;
                                    red2Y=red2YHome;
                                    red2CurrentIndex=0;
                                    red2Playable=false;
                                    repaint();
                                }
                                else if((green1X==red3X && green1Y==red3Y)&& red3Safe==false){
                                    red3X=red3XHome;
                                    red3Y=red3YHome;
                                    red3CurrentIndex=0;
                                    red3Playable=false;
                                    repaint();
                                }
                                else if((green1X==red4X && green1Y==red4Y)&& red4Safe==false){
                                    red4X=red4XHome;
                                    red4Y=red4YHome;
                                    red4CurrentIndex=0;
                                    red4Playable=false;
                                    repaint();
                                }
                                
                            }
                            if(green1CurrentIndex==56)
                            {
                                green1Win=true;
                            }
                            repaint();
                            }
                            turnComplete=true;
                            player=1;
                        }
                    } 
                    else if((e.getX()>=green2X && e.getX()<=(green2X+50) && e.getY()>=green2Y && e.getY()<=(green2Y+50)) && green2Win==false)
                    {
                        if(dice==6 && green2Playable==false)
                        {
                            green2X=greenPath[0].x;
                            green2Y=greenPath[0].y;
                            green2Safe=true;
                            green2Playable=true;
                            turnComplete=true;
                            repaint();
                        }
                        else if(green2Playable==true)
                        {   
                             if(dice!=6)
                            {  player=1;
                            }
                            green2CurrentIndex=green2CurrentIndex+dice;
                            if(green2CurrentIndex>56){
                                green2CurrentIndex=green2CurrentIndex-dice;
                                return;
                            }
                            else{
                            green2X=greenPath[green2CurrentIndex].x;
                            green2Y=greenPath[green2CurrentIndex].y;
                            safeCheck(green2CurrentIndex,green2Safe);
                            
                            if(green2X==red1X && green2Y==red1Y || green2X==red2X && green2Y==red2Y || green2X==red3X && green2Y==red3Y || green2X==red4X && green2Y==red4Y)
                            {
                                if((green2X==red1X && green2Y==red1Y)&& red1Safe==false){
                                    red1X=red1XHome;
                                    red1Y=red1YHome;
                                    red1CurrentIndex=0;
                                    red1Playable=false;
                                    repaint();
                                }
                                else if((green2X==red2X && green2Y==red2Y)&& red2Safe==false){
                                    red2X=red2XHome;
                                    red2Y=red2YHome;
                                    red2CurrentIndex=0;
                                    red2Playable=false;
                                    repaint();
                                }
                                else if((green2X==red3X && green2Y==red3Y)&& red3Safe==false){
                                    red3X=red3XHome;
                                    red3Y=red3YHome;
                                    red3CurrentIndex=0;
                                    red3Playable=false;
                                    repaint();
                                }
                                else if((green2X==red4X && green2Y==red4Y)&& red4Safe==false){
                                    red4X=red4XHome;
                                    red4Y=red4YHome;
                                    red4CurrentIndex=0;
                                    red4Playable=false;
                                    repaint();
                                }
                            
                            }
                            if(green2CurrentIndex==56)
                            {
                                green2Win=true;
                            }
                            repaint();
                            }
                            turnComplete=true;
                             player=1;
                        }
                    }
                    else if((e.getX()>=green3X && e.getX()<=(green3X+50) && e.getY()>=green3Y && e.getY()<=(green3Y+50)) && green3Win==false)
                    {
                        if(dice==6 && green3Playable==false)
                        {
                            green3X=greenPath[0].x;
                            green3Y=greenPath[0].y;
                            green3Safe=true;
                            green3Playable=true;
                            turnComplete=true;
                            repaint();
                        }
                        else if(green3Playable==true)
                        {   
                             if(dice!=6)
                            {  player=1;
                            }
                            green3CurrentIndex=green3CurrentIndex+dice;
                            if(green3CurrentIndex>56){
                                green3CurrentIndex=green3CurrentIndex-dice;
                                return;
                            }
                            else{
                            green3X=greenPath[green3CurrentIndex].x;
                            green3Y=greenPath[green3CurrentIndex].y;
                           safeCheck(green3CurrentIndex,green3Safe);
                            //try if(nokill==false){then the kill logic}
                           
                            if(green3X==red1X && green3Y==red1Y || green3X==red2X && green3Y==red2Y || green3X==red3X && green3Y==red3Y || green3X==red4X && green3Y==red4Y )
                            {
                                
                                if((green3X==red1X && green3Y==red1Y)&& red1Safe==false){
                                    red1X=red1XHome;
                                    red1Y=red1YHome;
                                    red1CurrentIndex=0;
                                    red1Playable=false;
                                    repaint();
                                }
                                else if((green3X==red2X && green3Y==red2Y)&& red2Safe==false){
                                    red2X=red2XHome;
                                    red2Y=red2YHome;
                                    red2CurrentIndex=0;
                                    red2Playable=false;
                                    repaint();
                                }
                                else if((green3X==red3X && green3Y==red3Y)&& red3Safe==false){
                                    red3X=red3XHome;
                                    red3Y=red3YHome;
                                    red3CurrentIndex=0;
                                    red3Playable=false;
                                    repaint();
                                }
                                else if((green3X==red4X && green3Y==red4Y)&& red4Safe==false){
                                    red4X=red4XHome;
                                    red4Y=red4YHome;
                                    red4CurrentIndex=0;
                                    red4Playable=false;
                                    repaint();
                                }
                            
                            }
                            if(green3CurrentIndex==56)
                            {
                                green3Win=true;
                            }
                            repaint();
                            }
                            turnComplete=true;
                            player=1;
                        }
                    }
                    else if((e.getX()>=green4X && e.getX()<=(green4X+50) && e.getY()>=green4Y && e.getY()<=(green4Y+50)) && green4Win==false)
                    {
                        if(dice==6 && green4Playable==false)
                        {
                            green4X=greenPath[0].x;
                            green4Y=greenPath[0].y;
                            green4Safe=true;
                            green4Playable=true;
                            turnComplete=true;
                            repaint();
                        }
                        else if(green4Playable==true)
                        {   
                             if(dice!=6)
                            {  player=1;
                            }
                            green4CurrentIndex=green4CurrentIndex+dice;
                            if(green4CurrentIndex>56){
                                green4CurrentIndex=green4CurrentIndex-dice;
                                return;
                            }
                            else{
                            green4X=greenPath[green4CurrentIndex].x;
                            green4Y=greenPath[green4CurrentIndex].y;
                           
                            safeCheck(green4CurrentIndex,green4Safe);
                            
                            if(green4X==red1X && green4Y==red1Y || green4X==red2X && green4Y==red2Y || green4X==red3X && green4Y==red3Y || green4X==red4X && green4Y==red4Y )
                            {
                                
                                if((green4X==red1X && green4Y==red1Y) && red1Safe==false){
                                    red1X=red1XHome;
                                    red1Y=red1YHome;
                                    red1CurrentIndex=0;
                                    red1Playable=false;
                                    repaint();
                                }
                                else if((green4X==red2X && green4Y==red2Y)&& red2Safe==false){
                                    red2X=red2XHome;
                                    red2Y=red2YHome;
                                    red2CurrentIndex=0;
                                    red2Playable=false;
                                    repaint();
                                }
                                else if((green4X==red3X && green4Y==red3Y)&& red3Safe==false){
                                    red3X=red3XHome;
                                    red3Y=red3YHome;
                                    red3CurrentIndex=0;
                                    red3Playable=false;
                                    repaint();
                                }
                                else if((green4X==red4X && green4Y==red4Y)&& red4Safe==false){
                                    red4X=red4XHome;
                                    red4Y=red4YHome;
                                    red4CurrentIndex=0;
                                    red4Playable=false;
                                    repaint();
                                }
                            
                            }
                            if(green4CurrentIndex==56)
                            {
                                green4Win=true;
                            }
                            repaint();
                            }
                            turnComplete=true;
                            player=1;
                        }
                    }
                }
        }
            
           
            
            
           
        }
        public void mouseEntered(MouseEvent e){}
        public void mouseExited(MouseEvent e){}
        public void mousePressed(MouseEvent e){}
        public void mouseReleased(MouseEvent e) {}
        void changePlayer(){
            if (player==1)
            {
                player=2;
            }
            else{
                player=1;
            }
        }
       
        void displayTurn(){
            if(player==1){
                X=120;
            }
            else{
                X=560;
            }
        }
        void diceRoll()
        {
            dice=new Random().nextInt(6)+1;
            
        }
        void safeCheck(int index,boolean state){
            if(index==0 || index==8 || index==13 || index==21 || index==26 || index==34 || index==39 || index==47)
            {
               state=true;
            }
            else
            {
                state=false;
            }
        }
    }
    public static void main(String[] args) {
       new Ludo(); 
    }
    
}
