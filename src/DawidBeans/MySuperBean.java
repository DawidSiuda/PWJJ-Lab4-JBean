package DawidBeans;

import java.awt.BasicStroke;
import java.awt.Color;

/**
@version 1.0
@author Dawid Siuda
*/

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

//import javax.swing.JLabel;
import javax.swing.JPanel;



/**
 * @author Dawid
 *
 */
public class MySuperBean extends JPanel {

	public MySuperBean() {
		text = defaultText;
		setBackground(new Color(50,50,100));
		textColor= new Color(200,200,200);
		possitionX = 10;
		possitionY = 100;
		textSize= 30;
	}

	@Override
	public void paintComponent(Graphics gr) {
		super.paintComponent(gr);
		Graphics2D g2 = (Graphics2D) gr;

		setBackground(getBackground());

		Font font = new Font("Verdana", Font.BOLD, textSize);

		g2.setColor(textColor);
		g2.setFont(font);
        g2.drawString(text, possitionX, possitionY);
	}

	public Dimension getPreferredSize()
	{
		return new Dimension(XPREFSIZE, YPREFSIZE);
	}


	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Color getTextColor() {
		return textColor;
	}

	public void setTextColor(Color textColor) {
		this.textColor = textColor;
	}

	public int getPossitionX() {
		return possitionX;
	}

	public void setPossitionX(int possitionX) {
		this.possitionX = possitionX;
	}

	public int getPossitionY() {
		return possitionY;
	}

	public void setPossitionY(int possitionY) {
		this.possitionY = possitionY;
	}

	public int getTextSize() {
		return textSize;
	}

	public void setTextSize(int textSize) {
		this.textSize = textSize;
	}

	public static int getXprefsize() {
		return XPREFSIZE;
	}

	public static int getYprefsize() {
		return YPREFSIZE;
	}

	public static final int XPREFSIZE = 300;
	public static final int YPREFSIZE = 120;
	public static final long serialVersionUID = 1L;

	String text;
	Color textColor;
	final String defaultText = "DEFAULT TEXT";
	int possitionX;
	int possitionY;
	int textSize;
}
