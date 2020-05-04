package texteditor;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class TextEditorMain {

    public static void main(String[] args) {
                
        guiDisplay();
        
        /* Create and display the form */
        TextEditorGui obj = new TextEditorGui();
        obj.setTitle("Sapthaka Texteditor");
        obj.setResizable(true);
        //obj.setLocation(250, 200);
        obj.pack();//make the window to the center with below line
        obj.setLocationRelativeTo(null); //make the window to the center
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    static void guiDisplay(){
        try {
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TextEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
    }
    
}
