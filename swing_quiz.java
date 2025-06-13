
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class swing_quiz extends javax.swing.JFrame {

    public swing_quiz() {
        initComponents();
    }
    @SuppressWarnings("unchecked")                       
    private void initComponents() {

        label_bg = new javax.swing.JPanel();
        rupp = new javax.swing.JLabel();
        resultTell_lb = new javax.swing.JLabel();
        scorem_lb = new javax.swing.JLabel();
        result_lb = new javax.swing.JLabel();
        quiz_score = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        scorem_txt = new javax.swing.JTextField();
        result_txt = new javax.swing.JTextField();
        code_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_score = new javax.swing.JTable();
        delete_btn = new javax.swing.JButton();
        sort_btn = new javax.swing.JButton();
        result_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        scoref_txt = new javax.swing.JTextField();
        scoref_lb = new javax.swing.JLabel();
        code_lb = new javax.swing.JLabel();
        name_lb1 = new javax.swing.JLabel();
        quiz_score1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1003, 569));
        setMinimumSize(new java.awt.Dimension(1003, 569));
        getContentPane().setLayout(null);

        label_bg.setBackground(new java.awt.Color(204, 204, 204));
        label_bg.setLayout(null);

        rupp.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        rupp.setForeground(new java.awt.Color(0, 0, 0));
        rupp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rupp.setText("Royal University Of Phnom Penh");
        label_bg.add(rupp);
        rupp.setBounds(20, 0, 550, 62);

        resultTell_lb.setBackground(new java.awt.Color(0, 0, 0));
        resultTell_lb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resultTell_lb.setForeground(new java.awt.Color(0, 0, 0));
        resultTell_lb.setText("AVG < 50 = Fail");
        label_bg.add(resultTell_lb);
        resultTell_lb.setBounds(820, 390, 160, 40);

        scorem_lb.setBackground(new java.awt.Color(0, 0, 0));
        scorem_lb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        scorem_lb.setForeground(new java.awt.Color(0, 0, 0));
        scorem_lb.setText("Score Midterm :");
        label_bg.add(scorem_lb);
        scorem_lb.setBounds(30, 260, 140, 40);

        result_lb.setBackground(new java.awt.Color(0, 0, 0));
        result_lb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        result_lb.setForeground(new java.awt.Color(0, 0, 0));
        result_lb.setText("Your Grade :");
        label_bg.add(result_lb);
        result_lb.setBounds(690, 430, 110, 40);

        quiz_score.setBackground(new java.awt.Color(0, 0, 0));
        quiz_score.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        quiz_score.setForeground(new java.awt.Color(0, 0, 0));
        quiz_score.setText("Table Score");
        label_bg.add(quiz_score);
        quiz_score.setBounds(670, 80, 140, 40);

        name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_txtActionPerformed(evt);
            }
        });
        label_bg.add(name_txt);
        name_txt.setBounds(210, 190, 250, 40);

        scorem_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scorem_txtActionPerformed(evt);
            }
        });
        label_bg.add(scorem_txt);
        scorem_txt.setBounds(210, 260, 250, 40);

        result_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result_txtActionPerformed(evt);
            }
        });
        label_bg.add(result_txt);
        result_txt.setBounds(810, 430, 170, 40);

        code_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code_txtActionPerformed(evt);
            }
        });
        label_bg.add(code_txt);
        code_txt.setBounds(210, 130, 250, 40);

        table_score.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                
            },
            new String [] {
                "Code", "Namme", "Score M", "Score F", "Average Score"
            }
        ));
        table_score.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_scoreMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_score);

        label_bg.add(jScrollPane1);
        jScrollPane1.setBounds(490, 120, 480, 250);

        delete_btn.setText("Delete Data");
        delete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_btnMouseClicked(evt);
            }
        });
        label_bg.add(delete_btn);
        delete_btn.setBounds(210, 460, 150, 40);

        sort_btn.setText("Sort Score");
        sort_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sort_btnMouseClicked(evt);
            }
        });
        sort_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sort_btnActionPerformed(evt);
            }
        });
        label_bg.add(sort_btn);
        sort_btn.setBounds(400, 460, 150, 40);

        result_btn.setText("Show");
        result_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                result_btnMouseClicked(evt);
            }
        });
        result_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result_btnActionPerformed(evt);
            }
        });
        label_bg.add(result_btn);
        result_btn.setBounds(830, 480, 130, 40);

        add_btn.setText("Add Quiz");
        add_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_btnMouseClicked(evt);
            }
        });
        label_bg.add(add_btn);
        add_btn.setBounds(20, 460, 150, 40);

        scoref_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoref_txtActionPerformed(evt);
            }
        });
        label_bg.add(scoref_txt);
        scoref_txt.setBounds(210, 320, 250, 40);

        scoref_lb.setBackground(new java.awt.Color(0, 0, 0));
        scoref_lb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        scoref_lb.setForeground(new java.awt.Color(0, 0, 0));
        scoref_lb.setText("Score Final :");
        label_bg.add(scoref_lb);
        scoref_lb.setBounds(30, 320, 140, 40);

        code_lb.setBackground(new java.awt.Color(0, 0, 0));
        code_lb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        code_lb.setForeground(new java.awt.Color(0, 0, 0));
        code_lb.setText("Code :");
        label_bg.add(code_lb);
        code_lb.setBounds(30, 130, 140, 40);

        name_lb1.setBackground(new java.awt.Color(0, 0, 0));
        name_lb1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name_lb1.setForeground(new java.awt.Color(0, 0, 0));
        name_lb1.setText("Name :");
        label_bg.add(name_lb1);
        name_lb1.setBounds(30, 190, 140, 40);

        quiz_score1.setBackground(new java.awt.Color(0, 0, 0));
        quiz_score1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        quiz_score1.setForeground(new java.awt.Color(0, 0, 0));
        quiz_score1.setText("Quiz Score :");
        label_bg.add(quiz_score1);
        quiz_score1.setBounds(30, 80, 140, 40);

        getContentPane().add(label_bg);
        label_bg.setBounds(0, 0, 1000, 570);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold> 
    private void name_txtActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
    }                                        

    private void scorem_txtActionPerformed(java.awt.event.ActionEvent evt) {                                           

    }                                          

    private void result_txtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }                                          

    private void code_txtActionPerformed(java.awt.event.ActionEvent evt) {                                         

    }                                        

    private void sort_btnActionPerformed(java.awt.event.ActionEvent evt) {                                         

    }                                        

    private void scoref_txtActionPerformed(java.awt.event.ActionEvent evt) {                                           
       
    }                                          

    private void result_btnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }                                          

    private void table_scoreMouseClicked(java.awt.event.MouseEvent evt) {                                         
           DefaultTableModel model = (DefaultTableModel) table_score.getModel();
    }                                        
    private void add_btnMouseClicked(java.awt.event.MouseEvent evt) {                                     
    String code = code_txt.getText();
    String name = name_txt.getText();
    String scoreMidterm = scorem_txt.getText();
    String scoreFinal = scoref_txt.getText();
   

  if(code.isEmpty() || name.isEmpty() || scoreFinal.isEmpty() || scoreMidterm.isEmpty() ){
      JOptionPane.showMessageDialog(this, "Plz input data");
      return;
  }
    try{
        double names = Double.parseDouble(name);
        JOptionPane.showMessageDialog(this, "Name is Not Number");
        return;
    }catch(NumberFormatException e){
    }
    try{
        double scoreM = Double.parseDouble(scoreMidterm);
        double scoreF = Double.parseDouble(scoreFinal);
        
        double avg = (scoreM + scoreF)/2;
        
        
        ((DefaultTableModel)table_score.getModel()).addRow(new Object[] {
         code, name, scoreM, scoreF, avg
    });
    code_txt.setText("");
    name_txt.setText("");
    scorem_txt.setText("");
    scoref_txt.setText("");
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(this, "Score is a Number ");
    }
    }                                    

    private void delete_btnMouseClicked(java.awt.event.MouseEvent evt) {                                        
    DefaultTableModel model = (DefaultTableModel) table_score.getModel();
    int seletedRow = table_score.getSelectedRow();
    if (seletedRow != -1){
        model.removeRow(seletedRow);
    }else{
        JOptionPane.showMessageDialog(this, "Plz Select row");
    }
    }                                       

    private void sort_btnMouseClicked(java.awt.event.MouseEvent evt) {                                      
    DefaultTableModel model = (DefaultTableModel)table_score.getModel();
       int rowCount = model.getRowCount();
       List<Object[]> tableData = new ArrayList<>();
       
       for(int i = 0 ;  i<rowCount ; i++){
           Object[] row = new Object[model.getColumnCount()];
           for(int j = 0 ;  j < model.getColumnCount() ; j++){
               row[j] = model.getValueAt(i, j);
           }
           tableData.add(row);
       }
       Collections.sort(tableData, new Comparator<Object[]>() {
    @Override
    public int compare(Object[] o1, Object[] o2) {
        if (o1[4] == null && o2[4] == null) return 0;
        if (o1[4] == null) return 1; // nulls go last
        if (o2[4] == null) return -1;

        double avg1 = ((Double) o1[4]).doubleValue();
        double avg2 = ((Double) o2[4]).doubleValue();
        return Double.compare(avg2, avg1); // descending order
    }
});
       model.setRowCount(0);
       for(Object[] row : tableData){
           model.addRow(row);
       }
        
    }                                     

    private void result_btnMouseClicked(java.awt.event.MouseEvent evt) {                                        
    DefaultTableModel model = (DefaultTableModel)table_score.getModel();
    int seletedRow = table_score.getSelectedRow();
    if(seletedRow == -1){
        JOptionPane.showMessageDialog(this, "Plz Select your Score");
        return;
    }
    Object avg = model.getValueAt(seletedRow, 4);
    if(avg == null){
        JOptionPane.showMessageDialog(this, "Where Your Average Score lil bro ?");
        return;
    }
    double averageObj;
    try{
        averageObj = Double.parseDouble(avg.toString());
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(this, "Invalid");
        return;
    }

    if(averageObj < 50){
        result_txt.setText("Fail");
    }else{
        result_txt.setText("Past");
    }
    
        
    }                                       

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new swing_quiz().setVisible(true);
            }
        });
//           class_quiz2.main(null);
    }                    
    private javax.swing.JButton add_btn;
    private javax.swing.JLabel code_lb;
    private javax.swing.JTextField code_txt;
    private javax.swing.JButton delete_btn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel label_bg;
    private javax.swing.JLabel name_lb1;
    private javax.swing.JTextField name_txt;
    private javax.swing.JLabel quiz_score;
    private javax.swing.JLabel quiz_score1;
    private javax.swing.JLabel resultTell_lb;
    private javax.swing.JButton result_btn;
    private javax.swing.JLabel result_lb;
    private javax.swing.JTextField result_txt;
    private javax.swing.JLabel rupp;
    private javax.swing.JLabel scoref_lb;
    private javax.swing.JTextField scoref_txt;
    private javax.swing.JLabel scorem_lb;
    private javax.swing.JTextField scorem_txt;
    private javax.swing.JButton sort_btn;
    private javax.swing.JTable table_score;                
}
