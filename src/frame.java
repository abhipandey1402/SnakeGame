import javax.swing.JFrame;

public class frame extends  JFrame{
    frame(){
        //adding the panel to the snake
        this.add(new Panel());
        this.setTitle("snake");
        //setting the closing action to close all instance of JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ensuring uniformity of the panel
        this.setResizable(false);
        //ensuring system preferred size
        this.pack();
        //displaying panel to the user
        this.setVisible(true);
        //ensuring the game starts at the center of screen
        this.setLocationRelativeTo(null);

    }
}

