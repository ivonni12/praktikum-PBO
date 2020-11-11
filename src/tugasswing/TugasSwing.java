//tugas Swing PRAKT PBO
//IVONNI TIAHAQ
// 124190074
package tugasswing;
import java.awt.Color;
import javax.swing.*;
public class TugasSwing {

    public static void main(String[] args) {
        GUI g = new GUI();
//        JFrame frame = new JFrame();
////        frame.setTitle("Ini bagian Judul");
////        frame.setSize(300,200);
////        //frame.pack();
////        frame.setLayout(null);
////        frame.setVisible(true);
////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//frame.getContentPane().setBackground(color.green);
    }
    
}

    class GUI extends JFrame{
    JLabel lnama = new JLabel("Nama Lengkap");
    final JTextField fnama = new JTextField(10);
    
    JLabel lalamat = new JLabel("Alamat");
    final JTextField falamat = new JTextField(50);

    JLabel ljeniskelamin = new JLabel("Jenis Kelamin");
    JRadioButton rblaki = new JRadioButton("Laki-Laki");
    JRadioButton rbperempuan = new JRadioButton("Perempuan");
    
    JLabel lagama = new JLabel("Agama");
    String[] namaAgama = {"Islam", "Kristen", "Katholik","Hindu","Budha"};
    JComboBox cmagama = new JComboBox(namaAgama);
    
    JLabel lnohp = new JLabel("Nomor HP");
    final JTextField fnohp = new JTextField(10);
    
    JLabel lbarang = new JLabel("Barang");
    JCheckBox cbmakeup = new JCheckBox("Makeup");
    JCheckBox cbbaju = new JCheckBox("Baju");
    
    JButton bsave = new JButton("Save");
    
    public GUI (){
        setTitle("FORM RESELLER LARIS STORE");
        setSize(380,300);
        getContentPane().setBackground(new Color(255,228,196));
        
        ButtonGroup group = new ButtonGroup();
        group.add(rblaki);
        group.add(rbperempuan);
        
        setLayout(null);
        add(lnama);
        add(fnama);
        add(lalamat);
        add(falamat);
        add(ljeniskelamin);
        add(rblaki);
        add(rbperempuan);
        add(lagama);
        add(cmagama);
        add(lnohp);
        add(fnohp);
        add(lbarang);
        add(cbmakeup);
        add(cbbaju);
        add(bsave);
        
        //set bounds(m.n.o.p)
        lnama.setBounds(20,10,120,20);
        fnama.setBounds(130,10,150,20);
        lalamat.setBounds(20,25,120,20);
        falamat.setBounds(130,35,200,50);
        ljeniskelamin.setBounds(20,90,120,20);
        rblaki.setBounds(130,90,100,20);
        rbperempuan.setBounds(230,90,100,20);
        lagama.setBounds(20,120,150,20);
        cmagama.setBounds(130,120,150,20);
        lnohp.setBounds(20,150,120,20);
        fnohp.setBounds(130,150,150,20);
        lbarang.setBounds(20,180,120,20);
        cbmakeup.setBounds(130,180,100,20);
        cbbaju.setBounds(230,180,100,20);
        bsave.setBounds(200,220,120,20);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
    }
}






















