package breakout;

import java.io.File;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class Main
{

    public static void main( String[] args )
    {
        JFrame obj = new JFrame();
        Gameplay gamePlay = new Gameplay();

        obj.setBounds( 356, 147, 700, 600 );
        obj.setTitle( "Breakout Ball" );
        obj.setResizable( false );
        obj.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        obj.add( gamePlay );

        obj.setVisible( true );

        try
        {

            File f = new File( "NeonLights.wav" );
            String filePath = f.getAbsolutePath();

            SimpleAudioPlayer audioPlayer = new SimpleAudioPlayer( filePath );
            audioPlayer.play();

            while ( true )
            {

            }
        }

        catch ( Exception ex )
        {
            System.out.println( "Error with playing sound." );
            ex.printStackTrace();

        }
    }

}