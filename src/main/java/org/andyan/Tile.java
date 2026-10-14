package org.andyan;


import javax.swing.JButton;

public class Tile extends JButton
{
    private final int column;
    private final int row;

public Tile(String s, int x, int y)
{
    column = x;
    row = y;
}
public int getColumn()
 {
 return column;
 }
}