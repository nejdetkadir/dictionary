
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nejdet Kadir
 */
public class Word {
    
    private int id;
    private String tr;
    private String en;
    private String fr;
    private String de;
    private byte[] image;

    public Word(int id, String tr, String en, String fr, String de, byte[] image) {
        this.id = id;
        this.tr = tr;
        this.en = en;
        this.fr = fr;
        this.de = de;
        this.image = image;
    }
    
    public ImageIcon getImageIcon() {
        return new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(
                100, 100, java.awt.Image.SCALE_SMOOTH));
    }

    public int getId() {
        return id;
    }

    public String getTr() {
        return tr;
    }

    public String getEn() {
        return en;
    }

    public String getFr() {
        return fr;
    }

    public String getDe() {
        return de;
    }

    public byte[] getImage() {
        return image;
    }
    
}
