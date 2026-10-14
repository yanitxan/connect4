package org.andyan.chess;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import org.andyan.Tile;





public class ConnectFour extends JFrame implements ActionListener
{
private boolean player1 = true;
    private final Container contentPane = getContentPane();
    private final Tile[][] grid; 
    private final int columns = 7;
    private final int rows = 6;
    int columIndex[] =  {5,5,5,5,5,5,5};
    public int x = 0;
    public int y = 0;
    private final ImageIcon imageIconHolder = new ImageIcon("src/Holder.png");
    private final ImageIcon p1 = new ImageIcon("src/Red.png");
    private final ImageIcon p2 = new ImageIcon("src/Yellow.png");


    public ConnectFour()
    {
        String counter = "";
        int size = 220;

        contentPane.setLayout(null);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1540, 1360);
        setLocation(600, 500);
        setTitle("Connect 4");

        


        grid = new Tile[columns][rows]; 
        for (int x = 0; x < columns; x++)
        {
            for (int y = 0; y < rows; y++)
            {
                grid[x][y] = new Tile(counter, x, y);
                grid[x][y].setBounds(0 + (x * size), 0 + (y * size), size, size);
                grid[x][y].addActionListener(this);
                contentPane.add(grid[x][y]);
                grid[x][y].setIcon(imageIconHolder);
                grid[x][y].setBorderPainted(false);
                

            }

        
        }
    }
@Override 
public void  actionPerformed(ActionEvent e)    {
        if (e.getSource() instanceof Tile)


        if (e.getSource() instanceof Tile clicked)
        {
        
            if (player1)
            {
                grid[clicked.getColumn()][columIndex[clicked.getColumn()]].setIcon(new ImageIcon("Red.png"));
                player1 = false;
                grid[clicked.getColumn()][columIndex[clicked.getColumn()]].setIcon(p1);

                columIndex[clicked.getColumn()]--;



            }
            else
            {
                grid[clicked.getColumn()][columIndex[clicked.getColumn()]].setIcon(new ImageIcon("Yellow.png"));
                player1 = true;
                grid[clicked.getColumn()][columIndex[clicked.getColumn()]].setIcon(p2);
                columIndex[clicked.getColumn()]--;
            }

        }
    
        
}













    

     public static void main(String[] args)
    {

        ConnectFour frame = new ConnectFour();
        frame.setIconImage(new ImageIcon("src/Holder.png").getImage());
        frame.setVisible(true);
    }













    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    // }





}
